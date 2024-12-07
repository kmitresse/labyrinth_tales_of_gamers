package app;

public class Hint extends Entity{
  private String content;

  public Hint(String name, String content) {
    super(name);
    this.content = content;
  }

  public void getContent() {
    TextManager.print(this.content, TextManager.YELLOW);
  }
}
