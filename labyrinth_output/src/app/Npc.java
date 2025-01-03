package app;

public class Npc extends Entity{

  	private Hint hint;
  	private String helloSentence;
  	private String enigmaSentence;
  	private String hintSentence;
  	private String validPropositionSentence;
  	private String invalidPropositionSentence;
  	private String discoveredEnigmaSentence;
  	private String discoveredSentenceHint;
  	private String enigmaSolution;
  	private Boolean discoveredEnigma;
  	private Boolean discovered;
  
  	public Npc(String name, Hint hint, String helloSentence, String enigmaSentence, String enigmaSolution, String hintSentence, String validPropositionSentence, String invalidPropositionSentence, String discoveredEnigmaSentence, String discoveredSentenceHint) {
    	super(name);
		this.hint = hint;
    	this.helloSentence = helloSentence;
    	this.enigmaSentence = enigmaSentence;
		this.hintSentence = hintSentence;
    	this.validPropositionSentence = validPropositionSentence;
    	this.invalidPropositionSentence = invalidPropositionSentence;
    	this.discoveredEnigmaSentence = discoveredEnigmaSentence;
    	this.discoveredSentenceHint = discoveredSentenceHint;
    	this.discovered = false;
    	this.discoveredEnigma = false;
    	this.enigmaSolution = enigmaSolution;
  	}

  	public Hint getHint() {
		return hint;
  	}
  
  	public String getHelloSentence() {
		return helloSentence;
  	}
	
  	public String getEnigmaSentence() {
		return enigmaSentence;
  	}
	
  	public String getHintSentence() {
		return hintSentence;
  	}
	
  	public String getValidPropositionSentence() {
		return validPropositionSentence;
  	}
	
  	public String getInvalidPropositionSentence() {
		return invalidPropositionSentence;
  	}
	
  	public String getDiscoveredEnigmaSentence() {
		return discoveredEnigmaSentence;
  	}
	
  	public String getDiscoveredSentenceHint() {
		return discoveredSentenceHint;
  	}
	
  	public Boolean getDiscoveredEnigma() {
		return discoveredEnigma;
  	}
	
  	public Boolean getDiscovered() {
		return discovered;
  	}

  	public String getEnigmaSolution() {
		return enigmaSolution;
  	}
	
  	public void salute() {
    	TextManager.print(pseudo()+helloSentence, TextManager.BLUE);
  	}

  	public void acceptProposition() {
    	discovered = true;
    	discoveredEnigma = true;
    	TextManager.print(pseudo()+validPropositionSentence, TextManager.GREEN);
  	}

  	public void refuseProposition() {
    	TextManager.print(pseudo()+invalidPropositionSentence, TextManager.RED);
  	}
  
  	public void giveHint() {
    	if (!discovered) {
      		TextManager.print(pseudo() + hintSentence.replaceAll("X", this.hint.getCurrentRoom().getName()), TextManager.BLUE);
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
}
