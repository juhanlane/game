package com.omis;

public class Player extends WorldCharacter {
    private static  double health = 10.0;
//    private int xCoord = (int)(Math.random() * World.getWidth() - 1) + 1;
//    private int yCoord = (int)(Math.random() * World.getHeight() - 1) + 1;
    private Direction direction = Direction.UP;



    public String getSymbol() {
        return "0";
    }

    public void move() {
       switch (this.direction) {
           case UP -> { if (getyCoord() > 1) { setyCoord(getyCoord()-1); } }
           case DOWN -> { if (getyCoord() < World.getHeight()-1) { setyCoord(getyCoord()+1); } }
           case LEFT -> { if (getxCoord() > 1) { setxCoord(getxCoord()-1); } }
           case RIGHT -> { if (getxCoord()  < World.getWidth()-1)  { setxCoord(getyCoord()+1); } }
       }
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
