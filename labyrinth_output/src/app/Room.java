package app;

import java.util.ArrayList;

public class Room {

	public static final String NORTH = "Nord";
	public static final String SOUTH = "Sud";
	public static final String EAST = "Est";
	public static final String WEST = "Ouest";
	private String name;
	private Room north;
	private Room south;
	private Room east;
	private Room west;
	private Game game;
	private Hint hint;
	private Npc npc;
	private ArrayList<Action> actions = new ArrayList<>();
	private String description;

	public Room(String name, Npc npc, Hint hint) {
		this.name = name;
		if (!Action.MOVE.equals("")) this.actions.add(Main.move);
		this.npc = npc;
		if (npc != null) {
			this.npc.setCurrentRoom(this);
			if (!Action.TALK.equals("")) this.actions.add(Main.talk);
			if (!Action.ASK_HINT.equals("")) this.actions.add(Main.ask_hint);
			if (!Action.PROPOSE.equals("")) this.actions.add(Main.propose);
		}
		this.hint = hint;
		if (this.hint != null){
			this.hint.setCurrentRoom(this);
			this.actions.add(Main.read);
		}
	}

	public String getName() {
		return name;
	}
	
	public Room getNorth() {
		return north;
	}
	
	public Room setNorth(Room north) {
		this.north = north;
		return this;
	}
	
	public Room getSouth() {
		return south;
	}
	
	public Room setSouth(Room south) {
		this.south = south;
		return this;
	}
	public Room getEast() {
		return east;
	}

	public Room setEast(Room east) {
		this.east = east;
		return this;
	}

	public Room getWest() {
	  return west;
	}

	public Room setWest(Room west) {
		this.west = west;
		return this;
	}

	public Hint getHint() {
		return hint;
	}

	public void setHint(Hint hint) {
		this.hint = hint;
	}

	public Npc getNpc() {
		return npc;
	}

	public void setNpc(Npc npc) {
		this.npc = npc;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public void addAction(Action action) {
		this.actions.add(action);
	}

	public void introduce(){
		generateDescription();
		if (this.npc != null) this.npc.salute();
	}
	
	public boolean containAction(String actionLabel){
		for(Action action : this.actions){
			if (TextManager.compare(actionLabel, action.getLabel())) {
				return true;
			}
		}
		return false;
	}
	
	public void generateDescription(){
		TextManager.print("Vous entrez dans la pièce '" + this.name + "'. Vous voyez une sortie:");
		if (this.north != null){
			TextManager.print("\t - au nord;");
		}
		if (this.east != null){
			TextManager.print("\t - à l'est;");
		}
		if (this.south != null){
			TextManager.print("\t - au sud;");
		}
		if (this.west != null){
			TextManager.print("\t - à l'ouest;");
		}
		
		if (this.hint != null){
			TextManager.print("Vous voyez un écrit gravé au mur.");
		}
		if (this.npc != null){
			TextManager.print("Une personne est présente dans la pièce, elle vous salue");
		}
	}
	
	public void selectAction() {
		boolean validAction = false;
		while (!validAction) {
			TextManager.print("Que voulez-vous faire?");
			this.displayActions();
			validAction = this.manageAction(MainCharacter.selectAction()); ;
		}
	}

	public void displayActions() {
		System.out.print(TextManager.YELLOW);
		for (Action action : this.actions) {
			System.out.print(action.getLabel() + "\t - \t");
		}
		System.out.println(TextManager.RESET);
	}
	
  	public boolean manageAction(String action) {
    	if (this.containAction(action)){
    		if (TextManager.compare(action, Action.MOVE)) {
    			return Action.doMove(this);
	  		} else if (TextManager.compare(action, Action.READ)) {
	  			return Action.doRead(this);
	  		} else if (TextManager.compare(action, Action.ASK_HINT)) {
	  			return Action.doAskHint(this);
		  	} else if (TextManager.compare(action, Action.PROPOSE)) {
		  		return Action.doPropose(this);
		  	}
	  	} else if (TextManager.compare(action, Action.KONAMI_CODE)){
	  		return Action.doKonamiCode(this);
		} else {
	      TextManager.print("Action invalide, selectionnez une nouvelle action");
	      return false;
	    }
		return false;
	}

  	public void displayDirections() {
    	System.out.print(TextManager.YELLOW);
    	if (this.north != null) {
      		System.out.print( "Nord\t-\t");
    	}
    	if (this.south != null) {
      	System.out.print("Sud\t-\t");
    	}
    	if (this.east != null) {
      		System.out.print("Est\t-\t");
    	}
    	if (this.west != null) {
      		System.out.print("Ouest\t-\t");
    	}
    	System.out.println(TextManager.RESET);
  	}
}
