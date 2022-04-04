package com.uts.Gamein;

public class Enemy extends Actor {
    String Isboss;
    Integer healthpoint;
    String moveSpeed;
    Integer Attack;
    Integer hitTaken;

    public Enemy(Integer attack, Integer hitTaken) {
        Attack = attack;
        this.hitTaken = hitTaken;
    }

    public void setHealthpoint(Integer healthpoint) {
        this.healthpoint = healthpoint;
    }

    public void setMoveSpeed(String moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public Integer getHealthpoint() {
        return healthpoint;
    }

    public String getMoveSpeed() {
        return moveSpeed;
    }
}
