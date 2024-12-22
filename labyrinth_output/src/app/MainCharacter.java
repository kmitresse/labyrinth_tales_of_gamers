package app;
import java.util.Scanner;

public class MainCharacter extends Entity {
	private Room currentRoom;
	private int nbDiscoveries = 0;
	private Game game;

	public MainCharacter(String name,Game game, Room currentRoom) {
		super(name);
		this.game = game;
		this.currentRoom = currentRoom;
	}

	public static String selectAction() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(TextManager.PURPLE + ">>> ");
		String action = scanner.nextLine();
		System.out.print(TextManager.RESET);
		return action;
	}
	
	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room room) {
		this.currentRoom = room;
	}

	public void addDiscoverie(){
		nbDiscoveries++;
		if (nbDiscoveries == this.game.getNbEnigmas()) game.setTerminate();
	}
}
