package com.ingenicomovement.fieldserviceagent.pojo;

import java.util.List;

public class AssignShopeeResponse{
	private String total;
	private List<DataItem> data;
	private String success;
	private Object message;

	public void setTotal(String total){
		this.total = total;
	}

	public String getTotal(){
		return total;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setSuccess(String success){
		this.success = success;
	}

	public String getSuccess(){
		return success;
	}

	public void setMessage(Object message){
		this.message = message;
	}

	public Object getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"AssignShopeeResponse{" + 
			"total = '" + total + '\'' + 
			",data = '" + data + '\'' + 
			",success = '" + success + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}