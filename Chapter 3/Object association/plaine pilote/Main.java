public class Main{
	
	public static void main(String args[]){
		Pilote p1 = new Pilote("ahmed", 55, "g1", "1000");
		Pilote p2 = new Pilote("amine", 25, "c1", "200");
		p1.Print_infos();
		p2.Print_infos();
		
		Pilote pilotes []= {p1, p2};
		Avion ourAvion = new Avion("boeing 737-800",  "41,000 feet", "530 mph", pilotes);
		ourAvion.fly();
		ourAvion.land();
	}
}