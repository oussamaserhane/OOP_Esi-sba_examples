public class Vehicle{
		 
	 String regNo;
	 String marke;
	 String Type;
	 int yearOfManif;
	 double value;

	// constructor
	public Vehicle(String RegNo, String CarMarke, 
				String CarType, int ManifactureYear, double CarValue){
	   this.regNo = RegNo;
	   this.marke = CarMarke;
	   this.Type = CarType;
	   this.yearOfManif = ManifactureYear;
	   this.value = CarValue;
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
		Vehicle vehicle_01 = new Vehicle("FXZ", "Honda", "Simple", 2003, 120.0);
		Vehicle vehicle_02 = new Vehicle("WER", "Peugeot", "Race", 2015, 170.0);
		Vehicle vehicle_03 = new Vehicle("BGT", "Volkswagen", "Simple", 2022, 220.0);
	}
}







