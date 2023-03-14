package ourProject;
import java.util.Scanner;


public class Student extends Akademic {

	
	private boolean isOverGraduate;
	private int studentType; // 1-> under 2-> Master 3->Doctoral
	// WE GET THE STUDENT TYPE IN THIS WAY SO THAT COURSE MATCHING IS MADE WHILE DETERMINING THE TYPES OF THE COURSES.
	private String enterYear;
	
	private int courseCount = 0; //courseCount will be an int that will count the maximum course a student can take. It will be supervised by a control system.
	
	private  Scanner input = new Scanner(System.in);
	
	private Courses[] courseList = new Courses[50];  //I set the maximum number of courses to 50. It can be changed according to the situation.
	
	
	
	
	

	//Constructor
	public Student(String name_Surname, String id, String department,String enterYear,int studentType, boolean isOverGraduate ) {
		super(name_Surname, id, department);
		this.isOverGraduate = isOverGraduate;
		this.enterYear = enterYear;
		this.studentType = studentType ;
	}
	
	
	
	//Getters and setters
	
	public String getEnterYear() {
		return enterYear;
	}



	public void setEnterYear(String enterYear) {
		this.enterYear = enterYear;
	}
	
	public int getStudentType() {  //numerical convert
		return studentType;
	}



	public void setStudentType(int studentType) {
		this.studentType = studentType;
	}

	
	public Courses getCourse(int i) {
		return courseList[i];
	}
	
	public int getCourseCount() 
	{
		return courseCount;
	}

	//Methods
	
	//HAZIR
	public void setCourse() { //This function is used for lessons that will be entered and created manually.
		
		String name;
		String courseCode = "NA"; //NOT Annonced
		int credit;
		int b;
		boolean isOverGraduate;
		
		System.out.println(getName_Surname() + " Ogrencisine:");
		System.out.println("Girilecek dersin adi: ");   //The nextLine command is a command that runs until it finds the /n escape operator.
		name = input.nextLine(); 					  //If I used it as input.nextInt, it would take the nextint method as /n and go to get the other input.
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
			System.out.println("Ogrenci alacagi maksimim ders sayisini aliyor");
		}
		else
		{
			courseList[courseCount] = new Courses(name,courseCode,credit,isOverGraduate);
			courseCount++;
		}
		
		
		
	}
	//HAZIR
	public void setObCourse(Courses course) //This directly assigns the Courses Class to the Student Class object after the Courses Class is created on the Main.
	{
		if(isOverGraduate == course.isOverGraduate()) //Code showing whether or not you can take the course according to student type.
		{
			if(courseCount > 10)
			{
				System.out.println("Ogrenci alacagi maksimim ders sayisini aliyor");
			}
			else
			{
				courseList[courseCount] = course;
				courseCount++;
				
			}
		}
		else
		{
			System.out.println("Ogrencinin almaya calistigi ders ögrenim programina uymuyor.");
		}
		
		
	}
	
	public void setCourseClassroom(String location, int i)
	{
		courseList[i].setClassroomLoc(location);
	}
	
	public String getCourseClassroom(int i)
	{
		return  courseList[i].getClassroomLoc();
	}
	
	//HAZIR
	public void displaySelCourse(int i) //HAZIR
	{
		System.out.println(getName_Surname() +" Ogrencisinin aldigi ders bilgisi: ");
		System.out.println("Course name: "+courseList[i].getCourseName());
		System.out.println("Course code: "+courseList[i].getCourseCode());
		System.out.println("Course credit: "+courseList[i].getCredit());
		System.out.println("Course visa note: "+courseList[i].getVisaNote());
		System.out.println("Course credit: "+courseList[i].getFinalNote());
		System.out.println("General note:  "+courseList[i].getGeneralNote());
		System.out.println("Is this course OverGraduate: "+courseList[i].isOverGraduate());
		System.out.println();
	}
	
	public void setVisaNote(int note, int i) //HAZIR //Sets the student's visa grade.
	{
		courseList[i].setVisaNote(note);
	}
	
	public double getVisaNote(int i) //HAZIR
	{
		return courseList[i].getVisaNote();
	}
	
	public void setFinalNote(int note, int i) //HAZIR
	{
		courseList[i].setFinalNote(note);
	}
	
	public double getFinalNote(int i)  //HAZIR
	{
		return courseList[i].getFinalNote();
	}
	
	public void calcCourseNote(int i) //HAZIR //The value i is an integer that specifies the elements of the course object array named courseList. A number to be retrieved from this user. 
	{
		double genNote = courseList[i].getVisaNote() * 0.6 + courseList[i].getFinalNote() * 0.4;
		courseList[i].setGeneralNote(genNote);
		courseList[i].calcletterNote();
	}
	
	public double getCourseNote(int i) //HAZIR
	{
		return courseList[i].getGeneralNote();
	}
	
	public String getLetterNote(int i) //HAZIR
	{
		return courseList[i].getLetterNote();
	}
	
	public void calcGPA() //HAZIR //If you want President dep to use up-to-date GPA every time, you can also send it.
	{
		double totalPoints = 0;
		double totalCredits = 0;
		double tempGPA = 0;
		
		for(int i =0; i< courseCount;i++)
		{
			totalPoints += courseList[i].getSuccessNote() * courseList[i].getCredit();
			totalCredits += courseList[i].getCredit();
		}
		
		if(totalCredits != 0)
		{
			tempGPA = totalPoints/totalCredits;
			setGPA(tempGPA);
		}
		else
		{
			setGPA(tempGPA);
		}
		
	
	}
	
	
	




	//Methods
	@Override
	public void personalInformation() //HAZIR
	{
		System.out.println("Name and Surname: "+getName_Surname());
		System.out.println("ID: "+ getID());
		System.out.println("Total number of courses taken: " +getCourseCount()); 
		System.out.println("GPA: "+getGPA());
		System.out.println("Department: "+getDepartment());
	}
	
	
	public void listStudentNotes() // It shows everything about the student's lesson.
	{
		System.out.println("Student "+getName_Surname() +"'s Taken Courses and grades: ");
		System.out.println();
		System.out.println("Course \t Visa \t Final \t Average \t Letter \t");
		for(int i = 0; i <= courseCount;i++)
		{
			System.out.println(getCourse(i) + " \t " + getVisaNote(i) + " \t " + getFinalNote(i) + " \t " + getCourseNote(i) + " \t " +getLetterNote(i)) ;
			
		}
	}

	public void listStudentCourse()
	{
		System.out.println("List of Student " +getName_Surname() +"'s taken Courses and Classroom Number");
		System.out.println();
		for(int i = 0; i <=courseCount;i++)
		{
			System.out.println(getCourse(i) + "\t" +getCourseClassroom(i));
		}
	}


	
}
