package com.Aconex.marsrover;

import static com.Aconex.marsrover.Direction.*;

public class Grid {
    private static final int MAX_HEIGHT =10;
    private static final int Max_WIDTH = 10;

    Coordinate nextCoordinateFor(Coordinate coordinate, Direction direction) {
        int x= coordinate.x();
        int y= coordinate.y();
        if(direction == NORTH){
            y =(y+1) % MAX_HEIGHT;
        }
        if(direction == EAST){
            x = (x+1)% Max_WIDTH;
        }
        if(direction == WEST){
            x= (x>0) ? x-1 : Max_WIDTH-1;
        }
        if(direction == SOUTH){
            y = (y>0)? y-1 :MAX_HEIGHT-1;
        }
        return new Coordinate(x,y);
    }

}
