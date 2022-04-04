package com.uts.Gamein;

public class Projectile {
    public float speed;
    public int attackPoint;

    public Projectile(float speed, int attackPoint) {
        this.speed = speed;
        this.attackPoint = attackPoint;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }
}
