import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class CreateDB
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DB name: ");
        String dbname = sc.nextLine();
        System.out.println("Enter table name: ");
        String tname = sc.nextLine();

        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","datta123");
        if(con == null)
        {
            System.out.println("Connection Not established");
        }
        else 
        {
            System.out.println("To insert records :\n ");
            System.out.println("Enter user name: ");
            String name = sc.nextLine();
            System.out.println("Enter Roll number: ");
            int rollno = sc.nextInt();
            System.out.println("Enter Marks: ");
            int marks = sc.nextInt();

            String query1 = "create database " + dbname ;
            String query2 = "create table " + dbname +"."+ tname +"(name varchar(20), rollno integer, marks integer);"; 
            String query3 = "insert into " + dbname +"."+ tname +" values ('"+ name +"','"+ rollno +"','"+ marks +"')";      
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false", "root", "datta123");
		    PreparedStatement st = con.prepareStatement(query3);
		    int rec = st.executeUpdate();
		    System.out.println(rec + " Number of records affected...");
		}
        con.close();
    }
}