package usecases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Exception.MyException;
import utility.dbutil;

public class UsernamePasswordFaculty {
	
	int flags=0;

	String pass="123";
	
		
	public void userNameAndPass() throws MyException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Faculty Username ");
		String s=sc.next();
		System.out.println("Enter Faculty Password");
		String passed=sc.next();
		try(Connection conn=dbutil.provideconnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from faculty where username=? and password=?");
			ps.setString(1, s);
			ps.setString(2, passed);
			ResultSet rs=ps.executeQuery();
			if(rs!=null) {
				flags=1;
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
		
		UsernamePasswordFaculty a=new UsernamePasswordFaculty();
		try {
			a.userNameAndPass();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
		

	}
