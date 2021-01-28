package game;

import java.awt.*;

public abstract class Figure {
     int row;
     int col;
     int currPositionRow;
     int currPositionCol;

     public boolean isMoveValid(int moveRow, int moveCol) {

          int rowCoeficient = Math.abs(moveRow - this.row);
          int colCoeficient = moveCol - this.col;

          return  rowCoeficient <=1 &&
                  colCoeficient <=1;
     }

}
