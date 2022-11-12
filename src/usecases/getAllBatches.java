package usecases;

import java.util.List;

import Bean.Batch;
import Dao.BatchDao;
import DaoImpl.BatchDaoImpl;
import Exception.MyException;

public class getAllBatches {

	public static void main(String[] args) {
		
		
		BatchDao dao=new BatchDaoImpl();
		try {
			List<Batch> batches=dao.getAllBatchDetails();
			batches.forEach(s->System.out.println(s));
		} catch (MyException e) {
			
			System.out.println(e.getMessage());
		}
		
		

	}

}
