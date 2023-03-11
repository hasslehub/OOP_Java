package Runners;

import Interface.Actions;

public class Human extends Opponent implements Actions{
    public Human(String name, int number, int maxSpeed, int maxJump) {
        this.name = name;
        this.number = number;
        this.maxSpeed = maxSpeed;
        this.maxJump = maxJump;
    }
}
