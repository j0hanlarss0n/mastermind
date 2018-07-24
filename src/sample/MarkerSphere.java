
package sample;



import javafx.scene.Node;

public class MarkerSphere {
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
