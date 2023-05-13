import java.util.*;
public class MainStudentChallenge{
	
	public static void main(String [] args){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Amine", 123564, 13.5));
		students.add(new Student("Ahmed", 45565, 13.2));
		students.add(new Student("Med", 785455, 14.0));
		students.add(new Student("Yacine", 785455, 8.0));
		Collections.sort(students);
		//Collections.reverse(students);
		for (Student student : students) {
			System.out.println(student.name + " " + student.id + " " + student.gpa);
		}

	}
}