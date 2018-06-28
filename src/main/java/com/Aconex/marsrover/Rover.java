package com.Aconex.marsrover;

import static com.Aconex.marsrover.Direction.*;

class Rover {

    private Grid grid;
    
    Direction direction = NORTH;
    Coordinate coordinate = new Coordinate(0,0);


    public Rover(Grid grid) {
        this.grid = grid;
    }



    String execute(String commands) {
        for(char c : commands.toCharArray()) {
            if (c == 'R') {
                direction = direction.right();

            }
            if (c == 'L') {
                direction = direction.left();
            }
            if(c == 'M'){
                coordinate = grid.nextCoordinateFor(coordinate, direction);
            }
        }
       return coordinate.x() + ":" + coordinate.y() + ":" + direction.value();
    }
}
