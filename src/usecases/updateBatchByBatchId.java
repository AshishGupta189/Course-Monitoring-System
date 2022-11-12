package usecases;

import java.util.Scanner;

import Dao.BatchDao;
import DaoImpl.BatchDaoImpl;

public class updateBatchByBatchId {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter batch id to update");
		int id=sc.nextInt();
		System.out.println("Enter new batchId for updation:");
		int id2=sc.nextInt();
		
		BatchDao dao=new BatchDaoImpl();
		
		try {
		String s=dao.updateBatchByBatchId(id, id2);
		System.out.println(s);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
