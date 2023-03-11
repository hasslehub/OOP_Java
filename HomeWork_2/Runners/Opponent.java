package Runners;

abstract public class Opponent {
    public String name;
    public int number;
    public int maxSpeed;
    public int maxJump;

    
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getSpeed() {
        return maxSpeed;
    }

    public int getHeight() {
        return maxJump;
    }

    
}
