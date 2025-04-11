package week5;

public class GameMessage {

    public void displayEncounter(WildPokemon wildPokemon, PlayerPokemon playerPokemon) {
        System.out.println("You encounter a wild " + wildPokemon.name + "!");
        System.out.println("You choose " + playerPokemon.name + " to battle!");
    }

    public void displayStatus(PlayerPokemon playerPokemon, WildPokemon wildPokemon) {
        System.out.println("Your " + playerPokemon.name + "'s HP: " + playerPokemon.hp + ". Wild " + wildPokemon.name + "'s HP: " + wildPokemon.hp);
    }

    public void displayAttacked(WildPokemon wildPokemon) {
        System.out.println(wildPokemon.name + " attacks back!");
    }

    public void displayDefeat(WildPokemon wildPokemon) {
        System.out.println("You defeated the wild " + wildPokemon.name + "!");
    }

    public void displayPlayerDefeat(PlayerPokemon playerPokemon) {
        System.out.println("Your " + playerPokemon.name + " was defeated...");
    }

    public void displayEscape(WildPokemon wildPokemon) {
        System.out.println(wildPokemon.name + " is too strong. It escaped the Pokeball!");
    }

    public void displayCapture(WildPokemon wildPokemon) {
        System.out.println("You have successfully caught " + wildPokemon.name + "!");
    }
}
