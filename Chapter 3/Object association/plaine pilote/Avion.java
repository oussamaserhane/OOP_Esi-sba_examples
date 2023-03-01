public class Avion {
	String regNo;
	String altitude;
	String speed;
	Pilote PILOTES [];
	public Avion(String regNo,  String altitude, String speed, Pilote pilotes []){
		this.regNo = regNo;
		this.altitude = altitude;
		this.speed = speed;
		this.PILOTES = pilotes;
	}
	
	public void fly(){
		// start flying
		System.out.println("Start flying ...");
	}
	public void land(){
		// start landing
		System.out.println("Start landing ...");
	}
}

