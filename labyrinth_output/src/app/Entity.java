package app;

public abstract class Entity {
  private String name;
	private Room currentRoom;

  public Entity(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }

	public Room getCurrentRoom(){
		return this.currentRoom;
	}
	
	public void setCurrentRoom(Room room){
		this.currentRoom = room;
	}
}
