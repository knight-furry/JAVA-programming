import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

class LoginApp
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username : ");
        String username = sc.nextLine();
        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","datta123");
        
        if(con == null)
        {
            System.out.println("Connection Not established");
        }
        else 
        {
            String query = "SELECT count(userid) FROM loginapp where userid='" + username +"';";        
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false", "root", "datta123");
		    PreparedStatement st = con.prepareStatement(query);
		    ResultSet rs = st.executeQuery();
		    if(rs.next())
            {
                int i = rs.getInt(1);
                if(i == 0)
                {
                    System.out.println("There is no record in System..");
                }
                else
                {
                    System.out.println("Record found successfully..");
                }
            }
		}

        con.close();
    }
}