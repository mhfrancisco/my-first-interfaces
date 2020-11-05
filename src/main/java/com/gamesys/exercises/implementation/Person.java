package com.gamesys.exercises.implementation;

public class Person implements Biker, Golfer, Runner, Singer {

    @Override
    public void rideBike() {

    }

    @Override
    public void playGold() {

    }

    @Override
    public void run() {
        System.out.println("I'm running!!!");
    }

    @Override
    public void sing() {

    }
}
