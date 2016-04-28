package PacMan.objekty.postavicky;

import PacMan.okna.Hra;
import javafx.geometry.Pos;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Hrac extends Postavicka {
    private Color barva = Color.WHITE;

    public Hrac() {
        super(130, 230, Smery.stop);
    }

    public void vykresliSe(Graphics g) {
        g.setColor(barva);
        g.fillOval(x, y, velikost, velikost);
        g.setColor(Color.black);
        g.drawOval(x, y, velikost, velikost);
    }
}
