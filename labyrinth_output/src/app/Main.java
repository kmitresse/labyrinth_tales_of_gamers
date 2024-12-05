package app;
import java.util.ArrayList;

public class Main { 
	public static Action move = new Action(Action.MOVE);
 	public static Action talk = new Action(Action.NPC);
 	public static Action propose = new Action(Action.PROPOSE);
 	public static Action hint = new Action(Action.HINT);
	public static void main(String[] args){
		
	    //Creation des Personnages
		ArrayList<Npc> npcs = new ArrayList<>();
		Npc Mario = new Npc("Mario","Salut", "Bien joué","Bien joué");
		npcs.add(Mario);
		
		
	    //Création des Indices
		ArrayList<Hint> hints = new ArrayList<>();
		Hint marioHint = new Hint("marioHint","Je saute de chamignons en champignons");
		hints.add(marioHint);
		
		
		
	    //Création des Pièces
	    ArrayList<Room> rooms = new ArrayList<>();
	    Room A0 = new Room("A0",null, null);
	    rooms.add(A0);
	    Room B0 = new Room("B0",null, marioHint);
	    rooms.add(B0);
	    Room A1 = new Room("A1",Mario, null);
	    rooms.add(A1);
	    
	
	    //Liaison des pièces
	    A0.setNorth(A1).setWest(B0);
	    B0.setEast(A0);
	    A1.setSouth(A0);
	    

	    //Création de la game
	    Game game = new Game("Player", A0, "Ceci est le titre du jeu", "Vous pouvez commencer le jeu ", "Bravo, vous avez fini le jeu");
	    for (Room room : rooms) {
	      game.addRoom(room);
	    }
	    //Management de la game
	    game.introduce();
	    while (!game.isTerminated()) {
	      System.out.println("\n--------------------------------------------------\n");
	      game.getPlayer().getCurrentRoom().introduce();
	      game.getPlayer().getCurrentRoom().selectAction();
	    }
	    game.terminate();
	  }
	}
