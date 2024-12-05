// This class was generated with Acceleo
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

public class TextManager {

    public static void print(Ansi.Color couleur, String texte) {
        for (char c : texte.toCharArray()) {
            System.out.print(Ansi.ansi().fg(couleur).a(c).reset());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}
