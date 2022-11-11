package Dao;

import java.util.List;

import Bean.Faculty;
import Exception.MyException;

public interface FacultyDao {
	
	public  String registerCourse(Faculty faculty);
	public String updateFacultyByName(String name1,String name2);
	public List<Faculty> getAllFacultyDetails() throws MyException;
	public String showFacultyAllocated(String s);
	public Faculty searchByUsernameAndPassword(String username, String password);
	
}