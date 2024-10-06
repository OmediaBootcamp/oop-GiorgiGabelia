package dev.omedia.section11.exc48;

import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon = "Sword";

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return List.of(name,
                String.valueOf(hitPoints),
                String.valueOf(strength),
                weapon);
    }

    @Override
    public void read(List<String> savedValues) {

        if (savedValues == null || savedValues.size() <= 0) return;
        name = savedValues.get(0);
        hitPoints = Integer.parseInt(savedValues.get(1));
        strength = Integer.parseInt(savedValues.get(2));
        weapon = savedValues.get(3);
    }

    @Override
    public String toString() {
        return "Player{name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + ", weapon='Sword'}";
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


}
