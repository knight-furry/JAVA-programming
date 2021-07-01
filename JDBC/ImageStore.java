import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.File;

class ImageStore
{
    public static void main(String args[]) throws Exception
    {
        System.out.println("************************* Storing image in databse *************************\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Roll number: ");
        int rollno = sc.nextInt();
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your path of the image: ");
        String path = sc.next();
        File f = new File(path);
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Enter your marks: ");
        float marks = sc.nextFloat();

        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false", "root", "datta123");
        if(con == null)
        {
            System.err.println("Connection NOT established..");
        }
        else
        {
            String query = "insert into student_resume(rollno, name, image, marks) values(?, ?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setBinaryStream(3, fis);
            ps.setFloat(4, marks);
            int res = ps.executeUpdate();
            if(res != 0)
            {
                System.out.println("Record stored successfully...");
            }
            else
            {
                System.out.println("Something goes wrong...");
            }
        }
        con.close();
    }
}