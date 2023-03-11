package Runners;

import Interface.Actions;

public class Robot extends Opponent implements Actions{
    public Robot(String name, int number, int maxSpeed, int maxJump) {
        this.name = name;
        this.number = number;
        this.maxSpeed = maxSpeed;
        this.maxJump = maxJump;
    }
    
}
