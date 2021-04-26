package oopGun2Odev;

public class CourseManagement {
	
	public void goToCourse(Courses course) {
		System.out.println(course.name+" açıldı");
	}
	
	public int getId(Courses course) {
		return course.id;
	}

}
