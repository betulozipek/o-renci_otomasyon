package ourProject;

public class Secretary extends Staff {
	
	Areas socialAreas;
	OtherStaff staffs;
	
	String UserName = "anonim";
	String Password = "123456";

	public Secretary(String name_surname, String id, int workingHour, String staffType, Areas staffLocation) {
		super(name_surname, id, workingHour,staffType,staffLocation);		
	}
	
	@Override
	public void personalInformation()
	{
		System.out.println("Name and Surname: "+getName_Surname());
		System.out.println("ID: "+getID());
		System.out.println("Working hours: "+getWorkingHour());
		System.out.println("Staff type: " +getStaffType());
		System.out.println("Office No: "+ staffLocation.getOffice() ); //I have assigned the value getOffice for Secretary for now
	}
	
	//When the secretary authenticates itself on main, it will use the get and set functions in Student and Lecturer.
	
	
	public String getUserName() {
		
		return UserName;
		
		
	}
	
	public void getUserName(String UserName) {
		
		this.UserName=UserName;
		
	}
	
public String getPassword() {
		
		return Password;
		
		
	}
	
	public void getPassword(String Password) {
		
		this.Password=Password;
		
	}
	
	
	
}
