import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class SelectQuery
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","datta123");
        // System.out.println("The con class is: " + con.getClass());
        if(con == null)
        {
            System.out.println("Connection Not established");
        }
        else 
        {
            String query = "SELECT * FROM demo where Username='" + username +"';";        
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false", "root", "datta123");
		    PreparedStatement st = con.prepareStatement(query);
		    ResultSet rs = st.executeQuery();
		    while(rs.next())
		    {
    			System.out.println(rs.getString(1));
		    	System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
		    }
		}

        con.close();
    }

}