package com.simplilearn.zumba;

import java.util.ArrayList;
import java.util.List;

interface Myinterface {
	void sendMessage() ;

}
	
 
public class Batch implements Myinterface {
	
 Participant p = new Participant();
	
	List<Participant> eveningBatch = new ArrayList<>();
	List<Participant> morningBatch = new ArrayList<>();
	
	public void morning () {
		
		System.out.println("Participant added to Morning batch" + morningBatch);
		sendMessage();
	}
		
	public void evening() {
		System.out.println("Participant added to Evening batch" + eveningBatch);
		sendMessage();
			
		}

	@Override
	public void sendMessage() {
		
		System.out.println("The Batch has started");
	}
	
}	

	
	
	
	

/*
 * 	int idBatch;
 
	String time;
	String Duration;
	String days;
	
	List<Participant> participants = new ArrayList<>();
	
	
	public int getIdBatch() {
		return idBatch;
	}
	public void setIdBatch(int idBatch) {
		this.idBatch = idBatch;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "Batch [idBatch=" + idBatch + ", time=" + time + ", Duration=" + Duration + ", days=" + days + "]";
	}
	
	
	
	
}*/

