/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Program;

/**
 *
 * @author choirul.huda
 */
public class Player {
    private String name;
    private String club;
    private String position;
    private int speed;
    private int finishing;
    private int passing;
    private int dribble;
    private int intercept;
    private int strength;
    private double target;

    public Player() {
    }

    public Player(String name, String club, String position, int speed, int finishing, int passing, int dribble, int intercept, int strength) {
        this.name = name;
        this.club = club;
        this.position = position;
        this.speed = speed;
        this.finishing = finishing;
        this.passing = passing;
        this.dribble = dribble;
        this.intercept = intercept;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFinishing() {
        return finishing;
    }

    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getDribble() {
        return dribble;
    }

    public void setDribble(int dribble) {
        this.dribble = dribble;
    }

    public int getIntercept() {
        return intercept;
    }

    public void setIntercept(int intercept) {
        this.intercept = intercept;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }
    
    
}
