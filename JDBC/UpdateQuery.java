import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class UpdateQuery
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter First Name: ");
        String fname = sc.nextLine();

        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","datta123");
        if(con == null)
        {
            System.out.println("Connection Not established");
        }
        else 
        {
            String query = "update demo set First_Name='" + fname + "' where Username='" + username + "';";       
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false", "root", "datta123");
		    PreparedStatement st = con.prepareStatement(query);
		    int rec = st.executeUpdate();
		    System.out.println(rec + " Number of records affected...");
		}
        con.close();
    }
}