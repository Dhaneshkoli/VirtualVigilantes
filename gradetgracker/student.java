package gradetgracker;
import java.util.*;

public class student {
	Scanner sc= new Scanner(System.in);
    int id;
    String name;
    ArrayList<course>course;
    
	public student(int id, String name) {
		this.id = id;
		this.name = name;
		this.course = new ArrayList<>();
	}
	public void addcourse() {
		System.out.println("enter your course name");
		String coursename=sc.next();
		System.out.println("enter your grade");
		int grade=sc.nextInt();
		course.add(new course(coursename, grade));
		
	}
	public void changegrade() {
		System.out.println("enter your course name");
		String coursename=sc.next();
		for (course course2 : course) {
			if(course2.coursename.equalsIgnoreCase(coursename))
			{
				System.out.println("enter your grade");
				int newgrade=sc.nextInt();
				course2.grade=newgrade;
			}
		}
	}
	public void displayaveragegrades() {
		int grade=0;
		for (course course2 : course) {
			grade+=course2.grade;
			
		}
		int average=grade/course.size();
		System.out.println("your average garde is"+average);
	}
    public void displaygarde() {
    	for (course course2 : course) {
    		System.out.println("your garde is"+course2.grade);
		}
    }
}

