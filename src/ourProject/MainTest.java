package ourProject;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		
		
	
		
		Courses BM101 = new Courses("Bilgisayar programlama 1","BM101",5,false);
		Courses BM102 = new Courses("Bilgisayar programlama 2","BM102",4,false);
		Courses muzik = new Courses("Muzik Tarihi","tech1",2,false);
		Courses lec = new Courses();
		Courses muzi = new Courses("Muzik Tarihi","tech1",2,false);
		Courses muz = new Courses("Muzik Tarihi","tech1",2,false);
		
		Courses mu = new Courses("Muzik Tarihi","tech1",2,false);
		Courses m = new Courses("Muzik Tarihi","tech1",2,false);
		Courses bm = new Courses("Muzik Tarihi","tech1",2,false);
		Courses yüksek = new Courses("Muzik Tarihi","tech1",1,true);
		Courses muik = new Courses("Muzik Tarihi","tech1",2,false);
		Courses muk = new Courses("Muzik Tarihi","tech1",2,false);
		
		BM101.setClassroomLoc("414");
		
		
		
		Student s1 = new Student("Ozgur Ertekin","521","Muhendislik","2020", 1,false );
		Student s2 = new Student("Betul Ozipek","654","Muhendislik","2020",1,true);
		Student s3 = new Student("Bahadır xxx","123","Muhendislik","2021",1,false);
		
			
		Lecturers l1 = new Lecturers("Omer Hayyam","1123","Muhendislik","A blok 123");
		l1.setObCourse(muk);
		l1.setObCourse(muik);l1.setObCourse(mu);l1.setObCourse(m);l1.setObCourse(muz);l1.setObCourse(lec);//l1.setObCourse(muzik);l1.setObCourse(BM101);l1.setObCourse(BM102);l1.setObCourse(bm);
		
		
		//Scanner zort = new Scanner(System.in);
		

		
		
		s1.setObCourse(yüksek);
		s1.setObCourse(BM101);
		s1.setObCourse(BM102);
		s1.setObCourse(muzik);
		s1.setCourseClassroom("400", 0);
		s1.setCourseClassroom("Kesit kafe", 1);
		s1.setVisaNote(60, 0); //BM101 
		s1.setFinalNote(80, 0); //BM101
		s1.setVisaNote(70, 1); //BM102
		s1.setFinalNote(90, 1); //BM102
		s1.setVisaNote(100, 2); //Muzik
		s1.setFinalNote(95, 2); //Muzik
		
		
		
		
		/*System.out.println(s1.getCourseCount());
		System.out.println(s1.getFinalNote(2));
		System.out.println(s1.getVisaNote(1));*/
		
		
		
		
		
		
		
		
		
		//s3.setObCourse(randomCourse);
		//s3.setObCourse(randomCourse);
		
		 PresidentDep pr1 = new PresidentDep("Muhammet Ali AKÇAYOl","357951456","Bilgisayar Mühendisliği");
		
		
	
		
		Areas areas = new Areas();
		areas.setOffice("108");
		Scanner scanner = new Scanner(System.in);
        Secretary secretary = new Secretary("Aybüke Yıldız", "1111", 50 , "sekreter",areas);
	    
        Announcements a1 = new Announcements();
	  
        
        
        while (true) {
	      System.out.println("");
	      System.out.println("Main Menu:");
	      System.out.println("1. Sekreter Giriş : ");
	      System.out.println("2. Eğitmen Giriş : ");
	      System.out.println("3. Öğrenci Giriş : ");
	      System.out.println("4. President Giriş : ");
	      System.out.println("5. Çıkış");
	      System.out.println("Seçimiz : ");
	      int choice = Integer.parseInt(scanner.nextLine());
	      

	      
	      if (choice == 1) {
	          
	    	  
	    	  System.out.print("Kullanıcı Adı giriniz : " );
	    	  String UserName= scanner.nextLine();
	    	  System.out.print("Şifre giriniz : ");
	    	  String UserPassword = scanner.nextLine();
	    	  
	    	  if(UserPassword.equals(secretary.getPassword())) {
	    		 
	    		  System.out.print("\033[H\033[2J");
	    		  System.out.flush();
	    		  
	    		  while (true) {
	    	 
	    	  System.out.println("*   Sekreter Ekranı  *");
	    	  System.out.println("**********************");
	    	  System.out.println("1. Derse Eğitmen Görüntüle");
	          System.out.println("2. Öğrenci ders ata");
	          System.out.println("3. Duyuru - Event  Yayınla");
	          System.out.println("4. Öğrenci Listesi");//çok da onemli değil olmasa da olur
	          System.out.println("5. Ana Menüye Dön");
	          System.out.print("Seçiminiz ");
	          int subchoice = Integer.parseInt(scanner.nextLine());
             //next line ile alıp parse ile convert edilecek
	          
	          if (subchoice == 1) {
	          
	        	  
	        	
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	          } 
	          
	          else if (subchoice == 2) {
	            
	        	  
	        	  s1.setCourse();
	      		
	      		s2.setCourse();
	      		
	      		s3.setCourse();
	      		
	      		s1.displaySelCourse(0);
	      		System.out.println("Diger ders");
	      		s1.displaySelCourse(1);
	      		System.out.println("Diger ders");
	      		s2.displaySelCourse(0);
	      		
	      		s3.displaySelCourse(0);
	      		s3.displaySelCourse(1);
	        	  
	        	  
	        	  
	        	  
	        	  //System.out.println("You chose option 2 in submenu 2.");
	          } 
	          
	          else if (subchoice == 3) {
	            
	        	
	        	  
	        	  while (true) {
			          System.out.println("** Duyuru Paneli **");
			          System.out.println("1. Event  oluştur");
			          System.out.println("2. Event sil ");
			          System.out.println("3. Event Güncelle ");
			          System.out.println("4. Event listesi ");
			          System.out.println("5. Ana Menüye Dön");
			          System.out.print("Seçiminiz ");
			          int subchoice1 = Integer.parseInt(scanner.nextLine());
			          
			          if (subchoice1 == 1) {
			               
			        	  a1.addEventName();
			        	  a1.addEventText();
			        	  
			        	  
			        	  
			          } 
			          
			          else if (subchoice1 == 2) {
			        	  
			        	  a1.removeEvent();
			        	  
			          } 
			          
                      else if (subchoice1 == 3) {
			        	  
			        	  a1.updateEventName();
			        	  
			          } 
			         
			          
			          else if (subchoice1 == 4) {
			            
			        
			        	  a1.showEventList();
			        	  a1.showEventText();
			        	  
			          } 
			          
			          else if (subchoice1 == 5) {
				            
			        	  break;
			          } 
			          
			          else {
				          
			        	  System.out.println("Hatalı Seçim ! Lütfen Tekrar Deneyin");
			          }
			          
			        }
	        	  
	        
	        	  
	          } 
	          
	          
	          else if (subchoice == 4) {
		            
		        	
	        	  
		        	s1.displaySelCourse(0);
		      		s1.displaySelCourse(1);
		      		s1.displaySelCourse(2);
		        	  
		        	 
		      		//System.out.println("You chose option 2 in submenu 3.");
		        	  
		          } 
	          
	          
	          else if (subchoice ==5 ) {
		            
	        	  break;
	          
	          } 
	          else {
	            
	        	  System.out.println("Hatalı Seçim ! Lütfen Tekrar Deneyin");
	          
	          }
	        }
	      }
	     
	    	  else {
	    		  
	    		  
	    		  System.out.println(" Hatalı Şifre !!");
	    		  
	    	  }
	      
	      
	      
	      
	      
	      }     
	         
	      else if (choice == 2) {
	    	  
	    	  
	    	  
	    	  while (true) {
		          System.out.println("** Eğitmen Ekranı **");
		          System.out.println("1. seçilen öğrenciye vize-final gir");
		          System.out.println("2. kişisel bilgileri görüntüle ");
		          System.out.println("3. ders oluştur ");
		          System.out.println("4. Ana Menüye Dön");
		          System.out.print("Seçiminiz ");
		          int subchoice = Integer.parseInt(scanner.nextLine());

		          
		          if (subchoice == 1) {
		          
		        	  System.out.println("You chose option 1 in submenu 1.");
		          } 
		          
		          else if (subchoice == 2) {
		            
		        	  
		        	  
		            System.out.println(l1.getName_Surname() + " " + l1.getID() + " " + l1.getGivenCourseNumber() + " " + l1.getLecturerLocation());
		      		System.out.println();
		      		System.out.println();
		      		System.out.println();
		        	
		      		System.out.print("dersler");
		      		l1.listGivenCourses();
		        	  
		        
		          } 
		          
		          else if (subchoice == 3) {
		            
		        	  lec.courseInformation();
		        	  
		          } 
		          
		          
		          else if (subchoice == 4) {
			            
		        	  break;
		          } 
		          
		          
		          else {
		          
		        	  System.out.println("Hatalı Seçim ! Lütfen Tekrar Deneyin");
		         
		          }
		        }
	      }
	    	  
	    	  else if (choice == 3) {
		    	  
		    	  
		    	  while (true) {
			          System.out.println("** Öğrenci Ekranı **");
			          System.out.println("1. Bilgileri Görüntüleri");
			          System.out.println("2. Ortalama Gör - Gpa Görüntüle");
			          System.out.println("3. Ana Menüye Dön");
			          System.out.print("     Seçiminiz");
			          int subchoice = Integer.parseInt(scanner.nextLine());

			          
			          if (subchoice == 1) {
			          
			        	  
			            s1.personalInformation();
			      		System.out.println("BM101 sinif: " + s1.getCourseClassroom(0));
			      		System.out.println("BM101 sinif: " + s1.getCourseClassroom(1));
			      		
			      		
			      		System.out.println("BM101: " +s1.getLetterNote(0));
			      		System.out.println("BM102: " +s1.getLetterNote(1));
			      		System.out.println("BM103: " +s1.getLetterNote(2));
			      		System.out.println();
			      		System.out.println("Ogrencinin GPA notu : " + s1.getGPA());
			      		
			      		System.out.println(s1.getCourseNote(0));
			        	  
			        	  
			        	  
			      		System.out.println("----------------------------");
			    		s1.calcCourseNote(0);
			    		s1.calcCourseNote(1);
			    		s1.calcCourseNote(2);
			    		s1.calcGPA();
			    		System.out.println();
			    		System.out.println(s1.getGPA());
			    		
			        	  
			        	  
			        	  
			        	  
			        	//  System.out.println("You chose option 1 ");
			          } 
			          
			          else if (subchoice == 2) {
			            
			        	   
			        	s1.calcCourseNote(0);
			      		s1.calcCourseNote(1);
			      		s1.calcCourseNote(2);
			      		s1.calcGPA();
			      		System.out.println();
			      		System.out.println(s1.getGPA());
			        	  
			        	  
			        	  
			        	} 
			          
			          else if (subchoice == 3) {
			            
			        	  break;
			          }
			          
			          else {
			            
			        	  
			        	  System.out.println("Hatalı Seçim ! Lütfen Tekrar Deneyin");
			          
			          }
			        }

	    	  }
	        
	    	  else if(choice == 4) {
	    		  
	    		  
	    		  
	    		  
	    		  while (true) {
			          System.out.println("** President Ekranı **");
			          System.out.println("1. Mezuniyet İşlemleri");
			          System.out.println("2. kişisel bilgileri görüntüle ");
			          System.out.println("3. Ana Menüye Dön");
			          System.out.print("Seçiminiz ");
			          int subchoice = Integer.parseInt(scanner.nextLine());

			          
			          if (subchoice == 1) {
			          
			        	  System.out.print("student "+s1.getName_Surname());
			        	  pr1.giveDegree(s1);
			        	  System.out.print("student"+s2.getName_Surname()); 
			        	  pr1.giveDegree(s2);
			        	  System.out.print("student"+s3.getName_Surname());
			        	  pr1.giveDegree(s3);
			          } 
			          
			          else if (subchoice == 2) {
			            
			        	  
			        	pr1.personalInformation();
			            System.out.println(pr1.getName_Surname() + " " + pr1.getID() + " " +  pr1.getDepartment() );
			      		System.out.println();
			      		System.out.println();
			      		System.out.println();
			        	  
			        	  
			        	  
			        	  
			        	  
			        	  
			        	  
			        	  
			        	 // System.out.println("You chose option 2 in submenu 1.");
			          } 
			          
			          else if (subchoice == 3) {
			            
			        	  break;
			          } 
			          
			          else {
			          
			        	  System.out.println("Hatalı Seçim ! Lütfen Tekrar Deneyin");
			         
			          }
			        }
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    	  }
	    	  
	    	  else if (choice == 5) {
	    		  
	    		  break;
	    	  }
                
		
	    	  else {
		            
	        	  
	        	  System.out.println("Hatalı Seçim ! Lütfen Tekrar Deneyin");
	          
	          }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Tüm nesneler oluşturulduktan sonra final sekreter ve başkan şifresi ve bilgileri burada yazılacak.
		//Sistemin çalışma yeri burasıdır.

				
	    }		
	}

}
