package Obstacle;

import Interface.Actions;

public class Track extends Obstacle implements Actions {
    private int speed;

    public Track(String name, int number, int speed, String good, String bad) {
        this.name = name;
        this.number = number;
        this.speed = speed;
        this.good = (good != null) ? good : " прошел дистанцию!";
        this.bad = (bad != null) ? bad : " отстал.";
    }

    public Track(String name, int number, int speed) {
        this(name, number, speed, null, null);
    }

    public Track(String name, int speed) {
        this(name, 0, speed, null, null);
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getHeight() {
        return 0;
    }

}
