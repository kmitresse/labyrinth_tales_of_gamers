package app;

public class Action {
  public final static String MOVE = "Se déplacer";
  public final static String NPC = "Demander l'indice";
  public final static String PROPOSE = "Proposer un nom";
  public final static String HINT = "Lire l'indice";
  public final static String KONAMI_CODE = "↑ ↑ ↓ ↓ ← → ← → B A";
  private String label;

  public Action(String label){
    if (label.equals(MOVE) || label.equals(NPC) || label.equals(PROPOSE) || label.equals(HINT)){
      this.label = label;
    } else {
      throw new IllegalArgumentException("Action invalide");
    }
  }

  public String getLabel(){
    return label;
  }

}

