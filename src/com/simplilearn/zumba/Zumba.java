package com.simplilearn.zumba;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Zumba {

	public static void main(String[] args) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		Participant participant = new Participant();
		Batch batch = new Batch();
		
        try(Scanner scan = new Scanner(System.in)){
			
			System.out.println(" Enter First Name : ");
			participant.setFirstName(scan.nextLine());
			
			System.out.println(" Enter last name : ");
			participant.setLastname(scan.nextLine());
			
			
			System.out.println(" Enter Date of birth (yyyy-MM-dd): ");
			participant.setBirth(formatter.parse(scan.nextLine()));
			
			System.out.println(" Enter gender ");
			participant.setgender(scan.nextLine());
			
			System.out.println(" Enter Batch :Morning / Evening ");
			participant.setBatch(scan.nextLine());
			
		
			
	      } catch (ParseException ex) {
			System.err.println(" Error while reading input: " +ex.getMessage());
			System.exit(-1);
		}
        
        System.out.println(participant);
        
        if(participant.getBatch()== "Morning") {
        	
        	batch.morningBatch.add(participant);
        	batch.morning();
        }else
        {
        	batch.eveningBatch.add(participant);
        	batch.evening();
        	
        }
        
       
     }

}
