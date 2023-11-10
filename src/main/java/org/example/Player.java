package org.example;

public class Player extends Character{
    public Player(String name, double hp, double maxDamage, double minDamage) {
        super(name, hp, maxDamage, minDamage);
    }

    public void helling(){
        this.setHp(this.getHp()+5);
    }
}
