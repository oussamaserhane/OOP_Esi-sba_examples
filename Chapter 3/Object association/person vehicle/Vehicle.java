public class Vehicle{
		 
	 String regNo;
	 String marke;
	 String Type;
	 int yearOfManif;
	 double value;
	 Person dirver;

	// constructor
	public Vehicle(String RegNo, String CarMarke, 
				String CarType, int ManifactureYear, double CarValue, Person dirver){
	   this.regNo = RegNo;
	   this.marke = CarMarke;
	   this.Type = CarType;
	   this.yearOfManif = ManifactureYear;
	   this.value = CarValue;
	   this.dirver = dirver;
	}
	
	public int calculateAge(int currentYear){  
		return (currentYear - yearOfManif); 
	}
	public int getYear(){ 
		return yearOfManif;
	}
	
	public void setValue(double newValue){  
		value = newValue;
	}

	public static void main(String[] args) {
		
		Person driver = new Person("Amine", 25, "11 rue sba", "0777777777");
		Person driver1 = new Person("Mahmoud", 31, "12 rue sba", "055555555");
		Person driver2 = new Person("Aek", 55, "35 rue sba", "06666666666");
		
		Vehicle vehicle_01 = new Vehicle("FXZ", "Honda", "Simple", 2003, 120.0, driver);
		Vehicle vehicle_02 = new Vehicle("WER", "Peugeot", "Race", 2015, 170.0, driver1);
		Vehicle vehicle_03 = new Vehicle("BGT", "Volkswagen", "Simple", 2022, 220.0, driver2);
		
		vehicle_02.dirver.Print_infos();
		vehicle_02.dirver.name = "Mustapha";
		System.out.println("After modification");
		vehicle_02.dirver.Print_infos();
	}
}







