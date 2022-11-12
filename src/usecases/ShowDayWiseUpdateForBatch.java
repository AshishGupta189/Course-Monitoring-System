package usecases;

import Dao.BatchDao;
import DaoImpl.BatchDaoImpl;

public class ShowDayWiseUpdateForBatch {

	public static void main(String[] args) {
		
		BatchDao dao=new BatchDaoImpl();
		String s=dao.dayWiseUpdateOfBatch();
		System.out.println(s);

	}

}
