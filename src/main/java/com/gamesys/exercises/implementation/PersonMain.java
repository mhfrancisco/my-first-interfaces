package com.gamesys.exercises.implementation;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person();
        Coach coach = new Coach();

        ConcreteGolfer golfer = new ConcreteGolfer();
        coach.tellGolferToRun(golfer);
    }

}
