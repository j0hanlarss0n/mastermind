
package se.fullstackare.mastermind.Spheres.DataClass;



import javafx.scene.Node;
import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;

public class MarkerSphere extends Sphere implements Skinnable {

    public MarkerSphere(Game game) {
        super(game);
        skin = new SphereSkin(this, Color.TRANSPARENT,"MarkerSphere");
        skin.ignoreDragging();
    }
//TODO-Johan fix the problem with nondisapearing

    public void pressed() {
        System.out.println("Marker pressed! Changing row");
        game.changeToNextRow();
    }

    public Node getSkin() {
        return skin;
    }
}
