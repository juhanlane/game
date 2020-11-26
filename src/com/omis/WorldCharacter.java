package com.omis;

public class WorldCharacter {
    private int xCoord = (int)(Math.random() * World.getWidth() - 1) + 1;
    private int yCoord = (int)(Math.random() * World.getHeight() - 1) + 1;

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public String getSymbol() {
        return "Error";
    }
}
