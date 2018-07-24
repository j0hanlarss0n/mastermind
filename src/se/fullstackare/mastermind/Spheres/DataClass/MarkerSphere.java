
package se.fullstackare.mastermind.Spheres.DataClass;



import javafx.scene.Node;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.MarkerSphereSkin;

public class MarkerSphere implements Skinnable {
    private Game game;
    private final MarkerSphereSkin skin;

    public MarkerSphere(Game game) {
        this.game = game;
        skin = new MarkerSphereSkin(this);
    }

    public void pressed(String color) {
        System.out.println("Color in pressed: " + color);
    }

    public Node getSkin() {
        return skin;
    }
}
