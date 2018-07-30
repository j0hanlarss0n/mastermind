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
import java.util.stream.Collectors;

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
            rowItems.add(new HiddenSphere(game, Color.LIGHTSTEELBLUE, colors.get(i), 20));
        }
        skin = new RowSkin(this, "HiddenRow");
    }

    public List<Color> getRandomColors(boolean uniqueColors) {
        System.out.println("UniqueCOlors in getRandomColors is: " + uniqueColors);
        List<Color> colorsList = new ArrayList<>();
        int rand;
        while(colorsList.size() < 4) {
            rand = Integer.valueOf((int) (Math.random() * 8));
            if (uniqueColors) {
                if (colorsList.contains(colorMap.get(rand))) {
                    System.out.println("In getRandomColors, ColorsList already contains color");
                } else {
                    colorsList.add(colorMap.get(rand));
                }
            } else {
                colorsList.add(colorMap.get(rand));
            }
        }
        System.out.println("ColorsList size: " + colorsList.size());
        System.out.println("Color: " + colorsList);
        return colorsList;
    }

    public List<Color> getSphereColors() {
        List<Color> colors = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            colors.add(((HiddenSphere) rowItems.get(i)).getHiddenColor());
        }
        return colors;
    }

    public void showColors (List<Integer> match) {
        for (Integer integer : match) {
            ((HiddenSphere) rowItems.get(integer.intValue())).showHiddenColor();
        }
    }

    public void showAllColors () {
        List<HiddenSphere> hiddenSpheres = filter(HiddenSphere.class, rowItems);
        hiddenSpheres.forEach(sphere -> sphere.showHiddenColor());
    }

    static <T> List<T> filter(Class<T> clazz, List<?> items) {
        return items.stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .collect(Collectors.toList());
    }

}
