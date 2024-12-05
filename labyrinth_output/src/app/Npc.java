package app;

public class Npc extends Entity{

  private String helloSentence;
  private String validPropositionSentence;
  private String invalidPropositionSentence;
  private Room currentRoom;
  private Room hintPosition;
  private Boolean discovered;
  public Npc(String name, String helloSentence, String validPropositionSentence, String invalidPropositionSentence) {
    super(name);
    this.helloSentence = helloSentence;
    this.validPropositionSentence = validPropositionSentence;
    this.invalidPropositionSentence = invalidPropositionSentence;
    this.discovered = false;
  }

  public void salute() {
    TextManager.print(pseudo()+helloSentence, TextManager.BLUE);
  }

  public void acceptProposition() {
    discovered = true;
    TextManager.print(pseudo()+validPropositionSentence, TextManager.GREEN);
  }

  public void refuseProposition() {
    TextManager.print(pseudo()+invalidPropositionSentence, TextManager.RED);
  }
  public void giveHint() {
    if (!discovered) {
      TextManager.print(pseudo() + "L'indice se trouve dans la pièce " + hintPosition.getName(), TextManager.BLUE);
    } else {
      TextManager.print(pseudo() + "Pourquoi aurais-je besoin de vous donner un indice? Vous avez déjà découvert mon identité!", TextManager.BLUE);
    }
  }
  public String pseudo() {
    if(discovered){
      return this.getName() + " > ";
    }
    return "??? > ";
  }

  public void setHintPosition(Room room) {
    this.hintPosition = room;
  }
}
