package com.Aconex.marsrover;

import org.omg.CORBA.Object;

class Rover {

    String direction = "N";
    String execute(String commands) {
        for(char c : commands.toCharArray()) {
            if(c == 'R'){
                direction =rotateRight();
            }
            if(c == 'L')
            direction = rotateLeft();
        }
       return "0:0:"+direction;
    }

    private String rotateLeft() {
        if(direction == "N") return "W";
        if(direction == "W") return "S";
        if(direction == "S") return "E";
        return "N";
    }

    private String rotateRight() {
        if (direction == "N") return "E";
        if (direction == "E")  return "S";
        if (direction == "S")  return "W";
        return "Nc";


    }
}
