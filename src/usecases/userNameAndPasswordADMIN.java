package usecases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Exception.MyException;
import utility.dbutil;

public class userNameAndPasswordADMIN {
	
	int flag=0;
	public void userNameAndPass() throws MyException {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Admin Username ");
		String s=sc.next();
		System.out.println("Enter Admin Password");
		String pass=sc.next();
		try(Connection conn=dbutil.provideconnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from admin where username=? and password=?");
			ps.setString(1, s);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(rs!=null) {
				flag=1;
				System.out.println("LOGIN SUCCESSFUL");
			}else {
				System.out.println("WRONG USERNAME OR PASSWORD");
			}
			
		}
		catch(SQLException e) {
		throw new MyException("Error Occured");	
		}
		}

	public static void main(String[] args) {
		
		userNameAndPasswordADMIN a=new userNameAndPasswordADMIN();
		try {
			a.userNameAndPass();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
