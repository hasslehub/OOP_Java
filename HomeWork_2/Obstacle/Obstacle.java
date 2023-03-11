package Obstacle;

import Interface.Actions;
import Runners.Opponent;

abstract public class Obstacle {
    public String name;
    public int number;
    public int speed;
    public int height;

    protected String good = "Справился.";
    protected String bad = "Упал.";

    public String Good() {
        return good;
    }

    public String Bad() {
        return bad;
    }

    public boolean done(Opponent runner) {
        if (runner instanceof Actions){
            return runner.getSpeed() >= ((Actions)this).getSpeed();
        }
        else if (runner instanceof Actions){
            return runner.getHeight() >= ((Actions) this).getHeight();
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }
}
