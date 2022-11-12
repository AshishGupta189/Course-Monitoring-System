package usecases;

import java.util.Scanner;

import Bean.Course;
import Dao.CourseDao;
import DaoImpl.CourseDaoImpl;

public class RegisterCourse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter courseID");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter course Name");
		String name=sc.next();
		sc.nextLine();
		System.out.println("Enter fee");
		int fee=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter courseDescription");
		String desc=sc.nextLine();
	
		CourseDao dao=new CourseDaoImpl();
		Course course= new Course();
		course.setCourseid(id);
		course.setCoursename(name);
		course.setFee(fee);
		course.setCoursedesc(desc);
		String res=dao.registerCourse(course);
		System.out.println(res);

	}

}