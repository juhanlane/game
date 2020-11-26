package com.omis;

import java.util.List;

public class World {
    private static int height;
    private static int width;

    private List<WorldCharacter> characters;

    public static int getHeight() {
        return height;
    }

    public static int getWidth() {
        return width;
    }

    public void setCharacters(List<WorldCharacter> characters) {
        this.characters = characters;
    }

    public World(int height, int width) {
        World.height = height;
        World.width = width;

    }

    public void render () {
        String symbol = "";
        for (int y = 0; y <= height; y++) {
            for (int x = 0; x <= width; x++) {
              //  |_________
                if ( y == 0 || y == height ) {
                    symbol = "-";
                } else if (x == 0 || x == width){
                    symbol = "|";
                } else {
                    symbol = " ";
                }
                for (WorldCharacter p: characters ) {
                    if (p.getyCoord() == y && p.getxCoord() == x) {
                        symbol = p.getSymbol();
                    }
                }

                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
