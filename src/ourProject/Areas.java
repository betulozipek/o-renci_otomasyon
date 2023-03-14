package ourProject;

public class Areas {

	private String studentClass = "Not assigned.";
	private String office ="Not assigned.";
	private String socialArea = "Not assigned.";
	
	//Constructor
	// constructor does not get any value because it will set when it call.
	public Areas() {
		
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSocialArea() {
		return socialArea;
	}

	public void setSocialArea(String socialArea) {
		this.socialArea = socialArea;
	}
	
	
	
	
}
