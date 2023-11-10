package org.example;

public class Main {
    public static void main(String[] args) {
        Player hero = new Player("John",100,25,5);
        Enemies wiln = new Enemies("Mob",20,5,2);
        hero.Attack(wiln);
        System.out.println(wiln.getHp());
        System.out.println("test1");

        System.out.println("test2");

    }
}