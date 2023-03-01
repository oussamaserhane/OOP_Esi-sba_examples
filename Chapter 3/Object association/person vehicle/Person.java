public class Person {
	String name;
	int age;
	String adress;
	String PhoneNumber;
	public Person(String name, int age, String adress, String PhoneNumber){
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.PhoneNumber= PhoneNumber;
	}
	
	public void Print_infos(){
		System.out.println("This person name is:"+name);
		System.out.println("This person age is:"+age);
	}
}


