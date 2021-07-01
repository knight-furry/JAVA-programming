import java.sql.DriverManager;
import java.sql.Connection;

class JdbcConnectivity
{
    public static void main(String args[]) throws Exception
    {
        // com.mysql.cj.jdbc.Driver obj = new com.mysql.cj.jdbc.Driver();
        // DriverManager.registerDriver(obj);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","datta123");
	System.out.println("The con class is: " + con.getClass());
        if(con == null)
        {
            System.out.println("Connection Not established");
        }
        else 
        {
            System.out.println("Connection established");
        }

        con.close();
    }

}