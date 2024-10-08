package dev.omedia.section11.exc48;

import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return List.of(name,
                String.valueOf(hitPoints),
                String.valueOf(strength));
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues == null || savedValues.size() <= 0) return;
        name = savedValues.get(0);
        hitPoints = Integer.parseInt(savedValues.get(1));
        strength = Integer.parseInt(savedValues.get(2));
    }

    @Override
    public String toString() {
        return "Monster{name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength;
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
}
