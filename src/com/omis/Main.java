package com.omis;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        World world = new World(10, 10);
        Player player = new Player();
        world.setCharacters(Arrays.asList(player));

        world.render();
    }
}