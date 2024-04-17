package Main;

import java.util.Locale;
import processing.core.PApplet;

/**
 * @author CPZ
 */

public class Launcher extends PApplet {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("es-US"));
        PApplet.main(new String[] {"Main.Sketch"});
        //PApplet.main(new String[] {"--present", "Main.Sketch"});
    }
}
