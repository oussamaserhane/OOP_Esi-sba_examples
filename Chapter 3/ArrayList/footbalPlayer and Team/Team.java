import java.util.ArrayList;
public class Team {
	String Team_Name;
	String Team_Title;
	String Stadium;
	public Team(String Team_Name, String Team_Title, 
				String Stadium){
		this.Team_Name = Team_Name;
		this.Team_Title=Team_Title;
		this.Stadium=Stadium;
		 
	}
 
	public void Tournament(){}
	public static void main(String args []){
		ArrayList<footbalPlayer> FCB_Players = new ArrayList<footbalPlayer>();
		footbalPlayer player01 = new footbalPlayer("Robert Lewandowski", 9, 0, 0 );
		FCB_Players.add(player01);
		FCB_Players.add(new footbalPlayer("Ousmane Dembele", 11, 0, 0 ));
		
		for(int i =0 ; i<FCB_Players.size(); i++){
			String playerName = FCB_Players.get(i).Name;
			int playerNumber = FCB_Players.get(i).Number;
			System.out.println("player name is " + playerName);
			System.out.println("player number is " + playerNumber);
		}
	}
}