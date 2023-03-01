public class Student {
	String name;
	String Adress;
	String PhoneNumber;
	
	public Student(String name, String Adress, String PhoneNumber){
		this.name = name;
		this.Adress = Adress;
		this.PhoneNumber = PhoneNumber;
	}
	
	public void print_Student_Infos (){
		System.out.println("-----------------------");
		System.out.println("Student Name :" + name);
		System.out.println("Student Adress :" + Adress);
		System.out.println("Student PhoneNumber: " + PhoneNumber);
	}
	
	public static void main(String ar[]) {  
	   Student student_1 = new Student("Amine", "11 Rue - Sba, Algeria", "077777777");
	   Student student_2 = new Student("Ahmed", "12 Rue - Sba, Algeria", "066666666");
	   Student student_3 = new Student("Amine", "13 Rue - Sba, Algeria", "055555555");
	   student_1.print_Student_Infos();
	   student_2.print_Student_Infos();
	   student_3.print_Student_Infos();
	}
}


