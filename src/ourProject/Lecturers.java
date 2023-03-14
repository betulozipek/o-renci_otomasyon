package ourProject;
import java.util.Scanner;

public class Lecturers extends Akademic {

	private Areas lecturerLocation = new Areas();
	private Areas lecturerClassroom[];
	private Student student;
	private int courseCount = 0; //Added counter to calculate the maximum amount of lessons teachers can take. It must be set within the codes.
	Scanner input = new Scanner(System.in);
	
	private Courses courseList[] = new Courses[10];
	
	
	//Constructor
	public Lecturers(String name_Surname, String id, String department, String lecturerOffice) {
		super(name_Surname, id, department);
		setLecturerLocation(lecturerOffice);
		
	}
	
	
	//Getters and setters
	public String getLecturerLocation() { //shows the lecturer offices
		return lecturerLocation.getOffice();
	}

	public void setLecturerLocation(String location) { //set the lecturers offices
		lecturerLocation.setOffice(location);
	}
	
	public String getLecturerClassroom(int i)
	{
		return lecturerClassroom[i].getStudentClass();
	}
	
	public void setLecturerClassroom(String classroom, int i) //When a while loop is created, the course order will be selected, i will be determined, and the string will be written.
	{
		lecturerClassroom[i].setStudentClass(classroom); //Lessons will be created in the main and then assigned to the teacher from there.
		
	}

	
	public int getGivenCourseNumber()  //What I am thinking here is to print the lessons given by the teacher inside the for loop.
	{
		return courseCount;
	}


	

	//Methods
	@Override
	public void personalInformation()
	{
		System.out.println("Name and Surname: "+getName_Surname());
		System.out.println("ID: "+ getID());
		System.out.println("Total number of courses given: "+ getGivenCourseNumber()); 
		System.out.println("Department: "+getDepartment());
		System.out.println("Office room number: "+lecturerLocation.getOffice()); //to call offices
	}
	
	
	
	public void setCourse() { //This function is used for lessons that will be entered and created manually.
		
		String name;
		String courseCode;
		int credit;
		int b;
		boolean isOverGraduate;
		
		System.out.println(getName_Surname() + " Ogrencisine:");
		System.out.println("Girilecek dersin adi: ");   //The nextLine command is a command that runs until it finds the /n escape operator. i wish i used it as input.nextInt
		name = input.nextLine(); 					  //It would take the nextint method as /n and go to get the other input.
		System.out.println("Girilecek dersin kodu: ");
		courseCode = input.nextLine();
		System.out.println("Dersin Kredisi: ");
		credit =Integer.parseInt(input.nextLine()); //input.nextLine();
		System.out.println("Lisans(1) YüksekLisans(2)");
		
		b = Integer.parseInt(input.nextLine()); //input.nextLine();
		
		if(b == 1){ isOverGraduate = false; }
		else {isOverGraduate = true;}
		
		if(courseCount > 10)
		{
			System.out.println("Ogretmen verebilecegi maksimum dersi vermektedir.");
		}
		else
		{
			courseList[courseCount] = new Courses(name,courseCode,credit,isOverGraduate);
			courseCount++;
		}
		
	}
	
	public void setObCourse(Courses course) //After creating the Courses Class directly on Main, it assigns the element of the Courses Class to the Lecturers Class object.
	{
		
		
		if(courseCount >= 3)
		{
			System.out.println("Ogretmen verecegi maksimim ders sayisini veriyor");
		}
		else
		{
			courseList[courseCount] = course;
			courseCount++;
			
		}
	}
	
	public void listGivenCourses() //A function to be used when the teacher's lessons are listed. //21.12.2022
	{
		System.out.println("List of courses of lecturer " +getName_Surname()+ " is giving:");
		
		for(int i = 0; i<= courseCount; i++ )
		{
			System.out.println("Course: " +i +": " +courseList[i].getCourseName() + "\t Classroom: " +courseList[i].getClassroomLoc());
		}
	}
	
	
	
	/*
	 * Most processes are stopped inside the Student object. Adding and removing courses here are reserved for the secretary.
	 * 
	 * 
	 */
	
	
	//public void

	
	
	

}
