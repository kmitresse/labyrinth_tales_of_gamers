package app;

public class Npc extends Entity{

  private String helloSentence;
  private String validPropositionSentence;
  private String invalidPropositionSentence;
  private String discoveredSentenceNpc;
  private String discoveredSentenceHint;
  private Hint hint;
  private Boolean discovered;
  public Npc(String name,Hint hint, String helloSentence, String validPropositionSentence, String invalidPropositionSentence, String discoveredSentenceNpc, String discoveredSentenceHint) {
    super(name);
	this.hint = hint;
    this.helloSentence = helloSentence;
    this.validPropositionSentence = validPropositionSentence;
    this.invalidPropositionSentence = invalidPropositionSentence;
    this.discoveredSentenceNpc = discoveredSentenceNpc;
    this.discoveredSentenceHint = discoveredSentenceHint;
    this.discovered = false;
  }

  public Boolean getDiscovered(){
	return discovered;
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
      TextManager.print(pseudo() + "L'indice se trouve dans la pièce " + hint.getCurrentRoom().getName(), TextManager.BLUE);
    } else {
      TextManager.print(pseudo() + " " + this.discoveredSentenceHint, TextManager.BLUE);
    }
  }
  public String pseudo() {
    if(discovered){
      return this.getName() + " > ";
    }
    return "??? > ";
  }

  public Hint getHint() {
	return this.hint;
  }

  public String getdiscoveredSentenceNpc(){
	return this.discoveredSentenceNpc;
  }
}
