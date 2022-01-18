package org.console.hippodrome;

public class Horse {

    // NAME
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // SPEED
    private double speed;
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // DISTANCE
    private double distance;
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }

    // CONSTRUCTOR
    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    //METHODS
    public void move() {
        double speed = getSpeed() * Math.random();
        setDistance(getDistance() + speed);
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < (int)getDistance(); i++) {
            stringBuilder.append(".");
        }
        System.out.println(stringBuilder + getName());
    }
}
