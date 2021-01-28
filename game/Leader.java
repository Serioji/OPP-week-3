package game;

import java.awt.*;


public class Leader  extends Figure{
    public Color color;
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
    /**
     *
     * @author Vasil
     * @param  "това е визуализирането на една от пешките на име Guard върху бойното поле със нейните параметри и цвят"
     */
    public Leader(int row, int col ,Color color) {
        this.color = color;
        this.row = row;
        this.col = col;
        this.currPositionRow = row;
        this.currPositionCol = col;


    }
    /**
     *
     * @author Vasil
     * @param "проверка дали хода е допустим или не"
     */
    public boolean isMoveValid(int moveRow, int moveCol) {

        int rowCoeficient = Math.abs(moveRow - this.row);
        int colCoeficient = moveCol - this.col;
        if(rowCoeficient == 0 || colCoeficient == 0){
            return true;
        }
       return false;
    }
    /**
     *
     * @author Vasil
     * @param "рендерирането на лидера"
     */
    public void render(Graphics g) {

        int x = this.col * GameTile.TILE_SIZE;
        int y = this.row * GameTile.TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(x+25,y+26,50,50);
    }
    /**
     *
     * @author Vasil
     * @param "движение на лидера по матрицата"
     */
    public void move(int row, int col) {
        this.row = row;
        this.col = col;
    }


}