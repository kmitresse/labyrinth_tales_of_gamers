package app;

import java.util.ArrayList;

public class Game {
  boolean terminated = false;
  private MainCharacter player;
  private ArrayList<Room> rooms;

  private String title;
  private String prologue;
  private String epilogue;

  private int nbNpc;

  public Game(String name, Room currentRoom, int nbNpc, String title, String prologue, String epilogue) {
    this.player = new MainCharacter(name, this, currentRoom);
    this.rooms = new ArrayList<>();
    this.nbNpc = nbNpc;
    this.title = title;
    this.prologue = prologue;
    this.epilogue = epilogue;
  }

  public MainCharacter getPlayer() {
    return player;
  }

  public void introduce(){
    TextManager.print(title);
    TextManager.print(prologue);
  };

  public Room getRoom(String name) {
    for (Room room : rooms) {
      if (room.getName().equals(name)) {
        return room;
      }
    }
    return null;
  }
  public void addRoom(Room room) {
    rooms.add(room);
    room.setGame(this);
    if (room.getNpc() != null) nbNpc++;
  }

  public void terminate() {
    TextManager.print(epilogue);
  }

  public int getNbNpc() {
    return nbNpc;
  }

  public boolean isTerminated() {
    return terminated;
  }

  public void setTerminate() {
    this.terminated = true;
  }
}

