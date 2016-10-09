
package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Table {
	private UUID TableID;
	private  ArrayList<Player> players = new ArrayList<Player>();
	
	public Table(UUID TableID){
		this.TableID = TableID;
	}
	public UUID gettableID() {
		return TableID;
	}
	
	public void setGameID(UUID tableID) {
		tableID = TableID;
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	public void addplayer(Player p){
		this.players.add(p);
		
	}
	

}