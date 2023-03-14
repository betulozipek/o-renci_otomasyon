package ourProject;

import java.util.Scanner;

public class Announcements {

	private String eventName;
	private String eventText;
	
	private int eventCounter=0;
	private int eventTextCounter=0;
	private String[] eventNames= new String[10];
	
	private String[] eventTexts= new String[10];
	
	
	
	
	
	
	//Getters and Setters
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventText() {
		return eventText;
	}
	public void setEventText(String eventText) {
		this.eventText = eventText;
	}
	
	
	//Methods
	public void addEventName() //to add events
	{  
		
	    if(eventTextCounter==10) {
	    	System.out.println("FULL");
	    	
	    }
	    else {
		System.out.println("Add Event Name");
	Scanner scan=new Scanner(System.in);
	String event =scan.nextLine();
	
	eventNames[eventCounter]=(event);
	
	++eventCounter;
	
	    }
		
	}
	public void addEventText() {
		
	if(eventTextCounter==10) {
		
		System.out.println("FULL");
	}
	else {
		System.out.println("Add Event Text");
		Scanner scan=new Scanner(System.in);
		String eventtext =scan.nextLine();
		
		eventTexts[eventCounter]=(eventtext);
		
		++eventTextCounter;
	}}
	
	public void removeEvent() //to delete event the selected one
	{
		System.out.println("Which number");
		Scanner reader=new Scanner(System.in);
		int num=reader.nextInt();
		
		 if(eventTexts[num - 1]== null){
			 
			 System.out.println("Wrong Choice");
		 }
		 else {
		for(int i=num-1;i<eventCounter;i++) {

		eventNames[num-1]=eventNames[num];
		eventTexts[num-1]=eventTexts[num];
	
		
		 --eventTextCounter;
		 --eventCounter;
		
		} 
		}
	}
	
	public void updateEventName() //to update the event's name
	{   
		
			
			
			System.out.println("Which number");
			Scanner reader=new Scanner(System.in);
			int num=reader.nextInt();
			
			if(eventTexts[num - 1]== null){
				 
				 System.out.println("Wrong Choice");
			 }
			else {
			System.out.println("Update Event Name");
			Scanner scan=new Scanner(System.in);
			String event =scan.nextLine();
			
			setEventName(event);
			eventNames[num-1]=getEventName();
		
			}
		
		 
	}
	
	
	public void showEventList() {
		for(int i=0;i<eventCounter;i++) {
			
		 System.out.println(eventNames[i]);
		
		
	}
		}
		
		public void showEventText() {
			System.out.println("Which number");
			Scanner reader=new Scanner(System.in);
			int num=reader.nextInt();
			
			if(eventTexts[num - 1]== null){
				 
				 System.out.println("Wrong Choice");
			 }
			else {
			 System.out.println(eventTexts[num-1]);
			 
			}
}
		}
