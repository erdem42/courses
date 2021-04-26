package oopGun2Odev;

public class Main {

	public static void main(String[] args) {
		
		Courses course1=new Courses(1,"C#-Angular",20);
		Courses course2=new Courses(2,"Java-React",35);
		Courses course3=new Courses(3,"Programlamaya Giriş",0);
		
		Courses courses[]= {course1,
							course2,
							course3				
						};

		for (Courses course : courses) {
			System.out.println(course.id+" "+course.name);
		}
		
		CourseManagement courseManagement=new CourseManagement();
		
		courseManagement.goToCourse(course1);
		courseManagement.goToCourse(course2);
		courseManagement.goToCourse(course3);
		
		for (Courses course : courses) {
		  System.out.println(course.name+" id: "+courseManagement.getId(course));

		}
		
	}

}
