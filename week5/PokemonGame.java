package week5;

public class PokemonGame {
    public static void main(String[] args) {
        PlayerPokemon playerPokemon = new PlayerPokemon("Pikachu", 100, 35);
        GameMessage gameMessage = new GameMessage();

        while (playerPokemon.isAlive()) {
            WildPokemon wildPokemon = new WildPokemon("Eevee", 80, 15);
            PokemonBattle pokemonBattle = new PokemonBattle(wildPokemon, playerPokemon, gameMessage);

            pokemonBattle.displayEncounter();
            pokemonBattle.battleStart();
            System.out.println();
        }
    }
}
