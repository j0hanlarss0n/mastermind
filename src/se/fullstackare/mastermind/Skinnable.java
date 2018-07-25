package se.fullstackare.mastermind;

import javafx.scene.Node;

public interface Skinnable {
    <T extends Node> T getSkin();
}
