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
    this.actions.add(Main.move);
	this.npc = npc;
    if (npc != null) {
	  this.npc.setCurrentRoom(this);
      this.actions.add(Main.propose);
      this.actions.add(Main.talk);
    }
    this.hint = hint;
    if (this.hint != null){
	  this.hint.setCurrentRoom(this);
	  this.actions.add(Main.hint);
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
	  if (actionLabel.equals(action.getLabel())) {
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
      System.out.print(action.getLabel() + "\t -");
    }
    System.out.println(TextManager.RESET);
  }

  public boolean manageAction(String action) {
    if (this.containAction(action)){
	  if (action.equals(Action.MOVE)) {
    	TextManager.print("Dans quelle direction souhaitez-vous aller?");
      	Boolean directionSelected = false;
	    while (!directionSelected) {
	      this.displayDirections();
	      String selectedDirection = MainCharacter.selectAction();
	      if (this.north != null && selectedDirection.equals(NORTH)) {
	        game.getPlayer().setCurrentRoom(this.north);
	        directionSelected = true;
	      } else if (this.south != null && selectedDirection.equals(SOUTH)) {
	        game.getPlayer().setCurrentRoom(this.south);
	        directionSelected = true;
	      } else if (this.east != null && selectedDirection.equals(EAST)) {
	        game.getPlayer().setCurrentRoom(this.east);
	        directionSelected = true;
	      } else if (this.west != null && selectedDirection.equals(WEST)) {
	        game.getPlayer().setCurrentRoom(this.west);
	        directionSelected = true;
	      } else {
	        TextManager.print("Direction invalide, choisissez en une nouvelle");
	      }
	    }
	    TextManager.print("Vous quittez la pièce.");
	    return true;
	  } else if (action.equals(Action.HINT)) {
	    this.hint.getContent();
	    return false;
	  } else if (action.equals(Action.NPC)) {
	    this.npc.giveHint();
	    return false;
	  } else if (action.equals(Action.PROPOSE)) {
	    if (this.npc.getDiscovered()) {
		  TextManager.print(this.npc.pseudo() + " " + this.npc.getdiscoveredSentenceNpc(), TextManager.BLUE);
	    } else {
		  TextManager.print("Proposez un nom");
		  String proposition = MainCharacter.selectAction();
		  if (proposition.equals(this.npc.getName())) {
	        this.npc.acceptProposition();
	        this.game.getPlayer().addDiscoverie();
	        if (this.game.isTerminated()) {
	          return true;
	        }
          } else {
            this.npc.refuseProposition();
          }
        }
	    return false;
	    } 
    } else if (action.equals(Action.KONAMI_CODE)){
	  TextManager.print("Une personne apparaît dans la pièce.");
	  TextManager.print("Konami >>> C'est pas bien de tricher ! Mais bon, le code est là pour ça... \nDans quelle pièce souhaites tu aller ?", TextManager.RED);
	  String newRoomName = MainCharacter.selectAction();
      Room newRoom = game.getRoom(newRoomName);
	  if (newRoom != null) {
        game.getPlayer().setCurrentRoom(newRoom);
        return true;
      } else {
	    TextManager.print("Konami >>> Ah Ah ! Non seulement ça triche, mais en plus ça ne triche pas correctement ! Cette salle n'existe pas !", TextManager.RED);
        return false;
      }
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
