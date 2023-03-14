package ourProject;

public class PresidentDep extends Akademic {

	//Constructor
	public PresidentDep(String name_Surname, String id, String department) {
		super(name_Surname, id, department);
		
	}
	
	
	@Override
	public void personalInformation()
	{
		System.out.println("Name and Surname: "+getName_Surname());
		System.out.println("ID: "+ getID());
		System.out.println("Type: President of Department");
		System.out.println("Department: "+getDepartment());
	}
	
	public void giveDegree(Student student) //The President will award diplomas to students who meet the requirements.
	{ 
		
		student.calcGPA();
		
		if(student.getStudentType()==1) {
			
			if(student.getCourseCount()>=3 && student.getGPA()>=1.00)
			{
				System.out.println(" Congratulations you graduated");
			}
			else {
				
				System.out.println(" Condition are not met for the graduation");
			}
		}
		
		
		if(student.getStudentType()==2) {
			
		
			if(student.getCourseCount()>=7 && student.getGPA()>=2.5)
			{
				System.out.println(" Congratulations you graduated");
			}
			else {
				
				System.out.println(" Condition are not met for the graduation");
			
		}
			}
			
			if(student.getStudentType()==3) {
				
			
				if(student.getCourseCount()>=8 && student.getGPA()>=3.00)
				{
					System.out.println(" Congratulations you graduated");
				}
				else {
					
					System.out.println(" Condition are not met for the graduation");
				}
			}
	}
}
