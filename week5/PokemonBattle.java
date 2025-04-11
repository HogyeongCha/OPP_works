package week5;

import java.util.Scanner;

public class PokemonBattle extends GameMessage {
    WildPokemon wildPokemon;
    PlayerPokemon playerPokemon;
    GameMessage gameMessage;
    Scanner scanner = new Scanner(System.in);

    public PokemonBattle(WildPokemon wildPokemon, PlayerPokemon playerPokemon, GameMessage gameMessage) {
        this.wildPokemon = wildPokemon;
        this.playerPokemon = playerPokemon;
        this.gameMessage = gameMessage;
    }

    public void displayEncounter() {
        displayEncounter(wildPokemon, playerPokemon);
        displayStatus(playerPokemon, wildPokemon);
    }

    public void battleStart() {
        boolean continuous = true;

        while (continuous && wildPokemon.isAlive() && playerPokemon.isAlive()) {
            System.out.println("Do you want to (1) attack, (2) run away, or (3) use a Poketball?");
            int select = scanner.nextInt();

            if (select == 1) {
                playerPokemon.attack(wildPokemon);

                if (!wildPokemon.isAlive()) {
                    displayDefeat(wildPokemon);
                    continuous = false;
                } else {
                    displayAttacked(wildPokemon);
                    wildPokemon.attack(playerPokemon);
                    if (!playerPokemon.isAlive()) {
                        displayPlayerDefeat(playerPokemon);
                        continuous = false;
                    } else {
                        displayStatus(playerPokemon, wildPokemon);
                    }

                }
            } else if (select == 2) {
                System.out.println("You run away.");
                continuous = false;
            } else if (select == 3) {
                double s = (double) wildPokemon.hp / wildPokemon.maxHP;
                if (s > 0.2) {
                    displayStatus(playerPokemon, wildPokemon);
                    wildPokemon.attack(playerPokemon);
                    displayEscape(wildPokemon);
                } else {
                    displayCapture(wildPokemon);
                    continuous = false;
                }
            }
        }
    }
}
