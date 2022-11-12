package usecases;

import java.util.List;

import Bean.Faculty;
import Dao.FacultyDao;
import DaoImpl.FacultyDaoImpl;
import Exception.MyException;

public class GetAllFacultyDetails {

	public static void main(String[] args) {
		
		
		FacultyDao dao=new FacultyDaoImpl();
		try {
			List<Faculty> faculties=dao.getAllFacultyDetails();
			faculties.forEach(s->System.out.println(s));
		} catch (MyException e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
