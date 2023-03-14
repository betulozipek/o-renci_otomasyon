package ourProject;


public abstract class Akademic extends University {

	
	private String department;
	private double GPA= 0;
	//Constructor
	public Akademic(String name_Surname, String id, String department) {
		super(name_Surname, id);
		this.department = department;
	}
	
	
	//Getters and setters
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public double getGPA()
	{
		return GPA;
	}
	public void setGPA(double GPA)  //this block just use by presidentdep
	{
		this.GPA = GPA;
	}
	
	
	
	
}
