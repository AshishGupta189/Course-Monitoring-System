package Dao;

import java.util.List;

import Bean.CoursePlan;
import Exception.MyException;

public interface CoursePlanDao {

	public  String registerCoursePlan(CoursePlan courseplan);
	public List<CoursePlan> getAllCoursePlanDetails() throws MyException;
}
