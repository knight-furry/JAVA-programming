import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.*;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


class DemoFrame implements ActionListener
{
	private JFrame frame = null;
	private JButton btnLogin = null;
	private JButton btnCancel = null;
	private JTextField txtUserName = null;
	private JPasswordField txtPassword = null;
	
	DemoFrame()
	{
		frame = new JFrame();
		frame.setTitle("Login Page");
		frame.setVisible(true);
		frame.setSize(1000, 500);
		frame.setLocation(140, 100);
		frame.getContentPane().setBackground(java.awt.Color.PINK);
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		init_Components();
	}
	
	void init_Components()
	{
		JLabel lblUserName = new JLabel();
		lblUserName.setText("User Name");
		frame.add(lblUserName);
		lblUserName.setBounds(350, 150, 100, 20);
		
		txtUserName = new JTextField();
		frame.add(txtUserName);
		txtUserName.setBounds(480, 150, 200, 30);
		
		JLabel lblPassword = new JLabel();
		lblPassword.setText("Password");
		frame.add(lblPassword);
		lblPassword.setBounds(350, 200, 100, 20);
		
		txtPassword = new JPasswordField();
		frame.add(txtPassword);
		txtPassword.setBounds(480, 200, 200, 30);
		
		btnLogin = new JButton();
		btnLogin.setText("LOGIN");
		frame.add(btnLogin);
		btnLogin.setBounds(350, 300, 140, 30);
		btnLogin.addActionListener(this);
		
		btnCancel = new JButton();
		btnCancel.setText("CANCEL");
		frame.add(btnCancel);
		btnCancel.setBounds(540, 300, 140, 30);
		btnCancel.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btnLogin)
		{
			String username = txtUserName.getText();
			String password = txtPassword.getText();
			dataBase(username, password);
            frame.setVisible(false);
            System.exit(0);
		}
		else if(ae.getSource() == btnCancel)
		{
			System.out.println("EXIT !!!");
			frame.setVisible(false);
            System.exit(0);
		}
	}

    public void dataBase(String username, String password)
    {
        Connection con = null;
        try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false", "root", "datta123");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


        try{

        
        if(con == null)
        {
            System.out.println("Connection Not established");
        }
        else 
        {
            String query = "SELECT count(userid) FROM loginapp where userid='" + username +"' && password = '"+ password + "';";        
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
        }
        catch(Exception e){
            e.printStackTrace();
        }

        //con.close();
    }
}

class TestFrame
{
	public static void main(String args[]) throws Exception
	{
		DemoFrame df = new DemoFrame();
	}
}
