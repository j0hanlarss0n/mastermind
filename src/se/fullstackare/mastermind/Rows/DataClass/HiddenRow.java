package se.fullstackare.mastermind.Rows.DataClass;

import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Rows.SkinClass.RowSkin;
import se.fullstackare.mastermind.Spheres.DataClass.ColoredSphere;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Spheres.DataClass.HiddenSphere;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HiddenRow extends Row{

    private List<Color> colors;

    private Map<Integer, Color> colorMap = Map.of(
            0, Color.WHITE,
            1, Color.DARKSEAGREEN,
            2, Color.GREEN,
            3, Color.YELLOW,
            4, Color.ORANGE,
            5, Color.PURPLE,
            6, Color.ROYALBLUE,
            7, Color.RED);

    public HiddenRow(Game game) {
        super(game);
        colors = getRandomColors(game.getUniqueColors());
        for(int i = 0; i < 4; i++) {
            System.out.println("Color: " + colors.get(2));
            rowItems.add(new HiddenSphere(game, Color.ANTIQUEWHITE, colors.get(i), 20));
        }
        skin = new RowSkin(this, "HiddenRow");
    }

    //TODO-Johan add function that calls the speere and make them change their color to hiddenColor when checkbox is toggled

    public List<Color> getRandomColors(boolean uniqueColors) {
        System.out.println("UniqueCOlors in getRandomColors is: " + uniqueColors);
        List<Color> colorsList = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            colorsList.add(colorMap.get(Integer.valueOf((int)(Math.random() * 8))));
        }
        System.out.println("ColorsList size: " + colorsList.size());
        System.out.println("Color: " + colorsList);
        return colorsList;
    }
}
