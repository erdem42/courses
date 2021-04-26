package oopGun2Odev;

public class Main {

	public static void main(String[] args) {
		
		Courses course1=new Courses(1,"C#-Angular",20);
		Courses course2=new Courses(2,"Java-React",35);
		Courses course3=new Courses(3,"Programlamaya Giriþ",0);
		
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
		
		String[] alanlar1= {"alan1","alan2"};
		Category category1=new Category(1,"Kurslarým",alanlar1);
		
		String[] alanlar2= {"alan1","alan2"};
		Category category2=new Category(2,"Tüm Kurslar",alanlar2);
		
		String[] alanlar3= {"alan1","alan2"};
		Category category3=new Category(3,"SSS",alanlar3);
		
		Category[] categories= {
				category1,
				category2,
				category3
		};
		
		
		CategoryManagement categoryManagement=new CategoryManagement();
		
		for (Category category : categories) {
			System.out.println(category.id+" "+category.name+" "+category.alanlar[0]+" "+category.alanlar[1]);
		
			categoryManagement.goToCategory(category);
			categoryManagement.deleteCategory(category);
		
		}
		
		
		
		
		
	}

}
