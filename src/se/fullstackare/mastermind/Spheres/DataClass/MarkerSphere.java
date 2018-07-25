
package se.fullstackare.mastermind.Spheres.DataClass;



import javafx.scene.Node;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.MarkerSphereSkin;

public class MarkerSphere extends Sphere implements Skinnable {

    public MarkerSphere(Game game) {
        super(game);
        skin = new MarkerSphereSkin(this);
    }

    public void pressed() {
        System.out.println("Color in pressed: " + color);
    }

    public Node getSkin() {
        return skin;
    }
}
