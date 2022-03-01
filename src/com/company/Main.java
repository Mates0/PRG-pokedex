package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("pokemon.csv"));
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            arr.add(line);
        }
        for (int i = 1; i < arr.size(); i++) {
            String[] split = arr.get(i).split(",");
            pokemonList.add(new Pokemon(Integer.parseInt(split[0]), split[1], split[2], split[3], Integer.parseInt(split[5]), Integer.parseInt(split[11]), Boolean.parseBoolean(split[12]), Integer.parseInt(split[6])));
        }
        var streamAverage = pokemonList.stream()
                .filter(i -> i.getGeneration() == 1)
                .mapToInt(i -> i.getAttack())
                .average()
                .getAsDouble();
        var streamNamesOfLegendary = pokemonList.stream()
                .filter(i -> i.getGeneration() == 2)
                .filter(i -> i.isLegendary() == true)
                .map(i -> i.getName())
                .collect(Collectors.toList());
        var streamFirstGeneration = pokemonList.stream()
                .filter(i -> i.getGeneration() == 1)
                .max((o1, o2) -> o1.getHp() - o2.getHp())
                .get();

        var streamNamesFirstGeneration = pokemonList.stream()
                .filter(i -> i.getGeneration() == 1)
                .filter(i -> i.getType2() == "")
                .map(i -> i.getName())
                .collect(Collectors.toList());
        System.out.println(streamAverage);
        System.out.println(streamNamesOfLegendary);
        System.out.println("("+ streamFirstGeneration.getName() + " " + streamFirstGeneration.getHp() + "HP)");
        System.out.println(streamNamesFirstGeneration);
    }
}

