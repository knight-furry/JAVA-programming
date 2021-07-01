import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

class ImageExtract
{
    public static void main(String args[]) throws Exception
    {
        System.out.println("\n******************************** Extract your image from database ********************************\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number to find the image: ");
        int rollno = sc.nextInt();
        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false", "root", "datta123");

        if(con == null)
        {
            System.err.println("Connection NOT established...");
        }
        else 
        {
            String query = "select image from student_resume where rollno='"+ rollno +"';";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                FileOutputStream fos = new FileOutputStream("datta.png");
                InputStream is = null;
                is = rs.getBinaryStream(1);
                IOUtils.copy(is, fos);

                System.out.println("Record retrive...");
            }
        }
        con.close();
    }
}