//WishMessageGenerator.java(Target Class)
package com.nt.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired //Field Injection
	private LocalTime lt; // HAS-Property (Composition)
	
	
	
	
	
	
	
	//b.method
	public String generateMessage(String user) {
		// get current hour of the day
		int hour=lt.getHour(); //24 hours format
		//generate the wish message
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good Afternoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
		
			
	}
	
	
	
	

}
