package org.example;

import java.util.Random;

public class Character {
    public String name;
    protected double hp;
    public double maxDamage;
    public double minDamage;

    public Character(String name, double hp, double maxDamage, double minDamage) {
        this.name = name;
        this.hp = hp;
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
    }


    public void Attack(Character name) {
        Random random = new Random();
        double damage = random.nextDouble(this.maxDamage - this.minDamage +1) + this.minDamage;
        name.setHp(name.getHp()-damage);

    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}
