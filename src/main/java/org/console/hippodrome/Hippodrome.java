package org.console.hippodrome;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    // FIELDS
    private List<Horse> horses;
    public List<Horse> getHorses() {
        return horses;
    }
    static Hippodrome game;

    // CONSTRUCTOR
    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    // MAIN
    public static void main(String[] args) throws InterruptedException {
        // create list of horses
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Fakel", 3, 0));
        horses.add(new Horse("Shift", 3, 0));
        horses.add(new Horse("Princes", 3, 0));

        // start game
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    // METHODS
    public void run() throws InterruptedException {
        int index = 0;
        while (index < 100) {
            move();
            print();
            index++;
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse moveHorse : horses) {
            moveHorse.move();
        }
    }

    public void print() {
        for (Horse printHorse : horses) {
            printHorse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse getWinnerHorse : horses) {
            if (getWinnerHorse.getDistance() > winner.getDistance()) {
                winner = getWinnerHorse;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
