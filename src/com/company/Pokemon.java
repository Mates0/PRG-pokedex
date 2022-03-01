package com.company;

public class Pokemon {
    private int id;
    private String name;
    private String type1;
    private String type2;
    private int hp;
    private int generation;
    private boolean isLegendary;
    private int attack;

    public Pokemon(int id, String name, String type1, String type2, int hp, int generation, boolean isLegendary, int attack) {
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = hp;
        this.generation = generation;
        this.isLegendary = isLegendary;
        this.attack = attack;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public int getHp() {
        return hp;
    }

    public int getGeneration() {
        return generation;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public int getAttack() {
        return attack;
    }
}
