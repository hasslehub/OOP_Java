package Obstacle;

import Interface.Actions;

public class Wall extends Obstacle implements Actions {
    private int height;

    public Wall(String name, int number, int height, String good, String bad) {
        this.name = name;
        this.number = number;
        this.height = height;
        this.good = (good != null) ? good : " взял высоту";
        this.bad = (bad != null) ? bad : " высоту не взял";
    }

    public Wall(String name, int number, int height) {
        this(name, number, height, null, null);
    }

    public Wall(String name, int height) {
        this(name, 0, height, null, null);
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getSpeed() {
        return 0;
    }
}