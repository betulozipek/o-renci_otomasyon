package ourProject;

public abstract class University {
	
	private String name_Surname;
	private String id;
	
	
	//Constructor
	
	public University(String name_Surname, String id) {
		super();
		this.name_Surname = name_Surname;
		this.id = id;
	}
	
	
	
	
	//Getters and Setters
	public String getName_Surname() {
		return name_Surname;
	}
	
	public void setName_Surname(String name_Surname) {
		this.name_Surname = name_Surname;
	}
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	
	//Methods
	
	/*
	 *This function will print the information of the specified person.
	 */
	public abstract void personalInformation();
	
	
	
}
