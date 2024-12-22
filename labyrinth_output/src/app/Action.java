package app;
import java.util.Collections;
import java.util.Map;

public class Action {
  	public final static String MOVE = "Se déplacer";
	public final static String TALK = "";
    public final static String PROPOSE = "Proposer un nom";
    public final static String ASK_HINT = "Demander l'indice";
    public final static String READ = "Lire l'indice";
    public final static String KONAMI_CODE = "↑ ↑ ↓ ↓ ← → ← → B A";;
    private String label;
    private String name;

	public Action(String label){
	    if (existLabel(label)){
	      this.label = label;
	    } else {
	        throw new IllegalArgumentException("Action '"+ label +"' invalide");
	    }
	}
	
	public String getLabel(){
		return label;
	}
	
    public String getName(){
    	return name;
    }
    
    public boolean existLabel(String label) {
    	if (label.equals(MOVE) || label.equals(TALK) || label.equals(PROPOSE) ||label.equals(ASK_HINT) ||label.equals(READ)) return true;
    	return false;
    }
    public static boolean doMove(Room room){
    	TextManager.print("Dans quelle direction souhaitez-vous aller ?");
		Boolean directionSelected = false;
		while (!directionSelected) {
			room.displayDirections();
			String selectedDirection = MainCharacter.selectAction();
			if (room.getNorth() != null && TextManager.compare(selectedDirection, Room.NORTH)) {
				room.getGame().getPlayer().setCurrentRoom(room.getNorth());
			    directionSelected = true;
			} else if (room.getSouth() != null && TextManager.compare(selectedDirection, Room.SOUTH)) {
				room.getGame().getPlayer().setCurrentRoom(room.getSouth());
				directionSelected = true;
			} else if (room.getEast() != null && TextManager.compare(selectedDirection, Room.EAST)) {
				room.getGame().getPlayer().setCurrentRoom(room.getEast());
				directionSelected = true;
			} else if (room.getWest() != null && TextManager.compare(selectedDirection, Room.WEST)) {
				room.getGame().getPlayer().setCurrentRoom(room.getWest());
				directionSelected = true;
			} else {
				TextManager.print("Direction invalide, choisissez en une nouvelle");
			}
		}
		TextManager.print("Vous quittez la pièce.");
	    return true;
    } 
	
	public static boolean doTalk(Room room){
		TextManager.print(room.getNpc().pseudo() + " " + room.getNpc().getEnigmaSentence(), TextManager.BLUE);
		return false;
	}
	
	public static boolean doAskHint(Room room){
		room.getNpc().giveHint();
		return false;
	}
	
	public static boolean doPropose(Room room){
		if (room.getNpc().getDiscoveredEnigma()) {
			  TextManager.print(room.getNpc().pseudo() + " " + room.getNpc().getDiscoveredEnigmaSentence(), TextManager.BLUE);
		} else {
		    TextManager.print(Action.PROPOSE);
		  	String proposition = MainCharacter.selectAction();
		  	if (TextManager.compare(room.getNpc().getEnigmaSolution(),proposition)) {
		        room.getNpc().acceptProposition();
		      	room.getGame().getPlayer().addDiscoverie();
		      	if (room.getGame().isTerminated()) return true;
   	  		} else {
		      	room.getNpc().refuseProposition();
	    	}
	  	}
	  	return false;
	} 
	
	
	public static boolean doRead(Room room){
		room.getHint().getContent();
		return false;
	}
	
	public static boolean doKonamiCode(Room room) {
		TextManager.print("Une personne apparaît dans la pièce.");
		TextManager.print("Konami >>> C'est pas bien de tricher ! Mais bon, le code est là pour ça... \nDans quelle pièce souhaites tu aller ?", TextManager.RED);
		String newRoomName = MainCharacter.selectAction();
		Room newRoom = room.getGame().getRoom(newRoomName);
		if (newRoom != null) {
			room.getGame().getPlayer().setCurrentRoom(newRoom);
	        return true;
	     } else {
		    TextManager.print("Konami >>> Ah Ah ! Non seulement ça triche, mais en plus ça ne triche pas correctement ! Cette salle n'existe pas !", TextManager.RED);
	        return false;
	     }
	}
	
	private static boolean isRightAnswer(String answer, String proposition) {
		return answer.toLowerCase().replaceAll("\\s", "").equals(proposition.toLowerCase().replaceAll("\\s", ""));
	}; 
}
