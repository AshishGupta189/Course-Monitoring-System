package usecases;

import java.util.List;

import Bean.CoursePlan;
import Dao.CoursePlanDao;
import DaoImpl.CoursePlanDaoImpl;
import Exception.MyException;

public class GetAllCoursePlanDetails {

	public static void main(String[] args) {
		
		
		CoursePlanDao dao=new CoursePlanDaoImpl();
		try {
			List<CoursePlan> courses=dao.getAllCoursePlanDetails();
			courses.forEach(s->System.out.println(s));
		} catch (MyException e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
