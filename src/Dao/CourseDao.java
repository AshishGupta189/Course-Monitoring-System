package Dao;

import java.util.List;

import Bean.Course;
import Exception.MyException;

public interface CourseDao{
	
	public  String registerCourse(Course course);
	public String updateCourseByCourseName(String s1,String s2);
	public List<Course> getAllCourseDetails() throws MyException;

}