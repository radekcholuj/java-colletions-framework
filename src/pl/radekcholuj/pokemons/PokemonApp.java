package pl.radekcholuj.pokemons;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class PokemonApp {
    private static final int LIMIT = 10;

    public static void main(String[] args) {

        Set<Character> catchedPokemons = new LinkedHashSet<>();
        int[] scoreBoard = new int[5];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int option;

        while (catchedPokemons.size() < LIMIT) {
            System.out.println("----- Pokemon Game -----");
            System.out.println("1 - catch'em!");
            System.out.println("2 - show current scoreboard");
            System.out.println();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    int playerNumber = random.nextInt(5-1)+1;
                    char pokemonName = (char)(random.nextInt(90-65)+65);
                    if (catchedPokemons.size() < 3){
                        int points = 10;
                        toScoreOrNotToScore(catchedPokemons, scoreBoard, playerNumber, pokemonName, points);
                    } else if (catchedPokemons.size() < 6) {
                        int points = 5;
                        toScoreOrNotToScore(catchedPokemons, scoreBoard, playerNumber, pokemonName, points);
                    } else {
                        int points = 1;
                        toScoreOrNotToScore(catchedPokemons, scoreBoard, playerNumber, pokemonName, points);
                    }
                    catchedPokemons.add(pokemonName);
                    break;
                case 2:
                    displayScoreboard(scoreBoard);
                    break;
            }
        }
        System.out.println("----- FINAL RESULTS -----");
        System.out.println();
        System.out.println("Catched pokemons: "+catchedPokemons);
        System.out.println();
        displayScoreboard(scoreBoard);
        scanner.close();
    }

    private static void toScoreOrNotToScore(Set<Character> catchedPokemons, int[] scoreBoard, int playerNumber, char pokemonName, int points) {
        if (!catchedPokemons.contains(pokemonName)){
            scoreBoard[playerNumber -1] += points;
            System.out.println("Player "+ playerNumber +" catched pokemon "+ pokemonName +". "+ points +" points scored.");
            System.out.println();
        } else {
            System.out.println("Player "+ playerNumber +" catched pokemon "+ pokemonName +", but this pokemon was catched previously - no points.");
            System.out.println();
        }
    }

    private static void displayScoreboard(int[] scoreBoard) {
        for (int i = 0; i < scoreBoard.length; i++) {
            System.out.println("Player "+(i+1)+": "+scoreBoard[i]+" points");
        }
    }
}
