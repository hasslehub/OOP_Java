package Runners;

import Interface.Actions;

public class Cat extends Opponent implements Actions{
    public Cat(String name, int number, int maxSpeed, int maxJump) {
        this.name = name;
        this.number = number;
        this.maxSpeed = maxSpeed;
        this.maxJump = maxJump;
    }
}
