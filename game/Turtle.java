package game;

import java.awt.*;

public class Turtle extends Figure{

    public Color color1;
    public Color color;

    /**
     *
     * @author Vasil
     * @param  "това е визуализирането на една от пешките на име Guard върху бойното поле със нейните параметри и цвят"
     */
    public Turtle(int row, int col ,Color color,Color color1) {
        this.color = color;
        this.row = row;
        this.col = col;
        this.color1 = color1;
        this.currPositionRow = row;
        this.currPositionCol = col;


    }

    /**
     *
     * @author Vasil
     * @param "рендериране на гарда с неговия outline като един клас"
     */
    public void render(Graphics g) {

        int x = this.col * GameTile.TILE_SIZE;
        int y = this.row * GameTile.TILE_SIZE;

        g.setColor(this.color);
        g.fillOval(x+25, y+31, 50, 50);
        g.setColor(this.color1);
        g.fillOval(x+33,y+39 ,35,35);

    }
}
