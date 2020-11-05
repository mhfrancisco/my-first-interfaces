package com.gamesys.exercises.implementation;

public class Coach {

    public void tellPersonToPlayGold(Person person) {
         Golfer golfer = person; // casting
        // declaration // assignment
    }

    public void tellGolferToRideBike(Golfer golfer) {
        Person person = (Person) golfer; // downcasted
        person.rideBike();

        Biker biker = person; // casted
        biker.rideBike();
    }

    public void tellPersonToSing(Person person) {
        Singer singer = person;
        singer.sing();
    }

    public void tellGolferToRun(Golfer golfer) {
        Runner runner = (Runner) golfer;
        runner.run();
    }

}
