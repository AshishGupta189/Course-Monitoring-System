package usecases;

import java.util.List;

import Bean.Course;
import Dao.CourseDao;
import DaoImpl.CourseDaoImpl;
import Exception.MyException;

public class GetAllCourses {

	public static void main(String[] args) {
		
		CourseDao dao=new CourseDaoImpl();
		try {
			List<Course> courses=dao.getAllCourseDetails();
			courses.forEach(s->System.out.println(s));
		} catch (MyException e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
