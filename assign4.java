import java.sql.*;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;



public class connectivity

{

	void show()

	{

	

		try{  

			Class.forName("com.mysql.jdbc.Driver");  

			Connection con=DriverManager.getConnection(  

			"jdbc:mysql://localhost/thamarai","root","");  

			//here thamarai is database name, root is username and password  

			Statement stmt=con.createStatement();  

			ResultSet rs=stmt.executeQuery("select * from thams");  

			while(rs.next())  

			{

				String username=rs.getString(1);

				String password=rs.getString(2);

			System.out.println(username+"  "+password); 

			}

			con.close();  

			}catch(Exception e)

			{

				System.out.println(e);

			

			}  

		}

	

	public static void main(String args[]){  

	connectivity s=new connectivity();

	s.show();

}

}