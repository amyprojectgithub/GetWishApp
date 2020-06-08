package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishMessageServiceImpl implements WishMessageService {

	@Override
	public String getWishMsg() {
	     Calendar cal=null;
	     int hour=0;
	     //get the current hoiur of the day
	     cal=Calendar.getInstance();
	     hour=cal.get(Calendar.HOUR_OF_DAY);
	    		 //b.logic
	     if(hour<12)
	    	 return "Good Morning";
	     else if(hour<17)
	    	 return "Good Afternoon";
	     else if(hour<=19)
	    	 return "Good Evening";
	     else 
	    	 return "Good Night";
	}

}
