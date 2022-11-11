package Dao;

import java.util.List;

import Bean.Batch;
import Exception.MyException;

public interface BatchDao {
	
	public String registerBatch( Batch batch);
	public String updateBatchByBatchId(int n1,int n2);
	public List<Batch> getAllBatchDetails() throws MyException;
	public String dayWiseUpdateOfBatch();
	
}
