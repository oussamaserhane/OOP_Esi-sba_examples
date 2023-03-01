public class Pilote {
	String name;
	int age;
	String Grade;
	private String piloteHours;
	public Pilote(String name, int age, String Grade, String piloteHours){
		this.name = name;
		this.age = age;
		this.Grade = Grade;
		this.piloteHours= piloteHours;
	}
	
	public void Print_infos(){
		System.out.println("This pilote name is:"+name);
		System.out.println("His Grade is:"+Grade);
		System.out.println("He flys for :"+piloteHours + " hours");
	}
	public void Update_piloteHours(String newHours){
		piloteHours = newHours;
	}
}



