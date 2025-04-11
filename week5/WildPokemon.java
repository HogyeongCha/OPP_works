package week5;

public class WildPokemon {
    String name;
    int maxHP;
    int hp;
    int attackPower;

    public WildPokemon(String name, int maxHP, int attackPower) {
        this.name = name;
        this.maxHP = maxHP;
        this.hp = maxHP;
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }

    public void attack(PlayerPokemon playerPokemon) {
        playerPokemon.takeDamage(this.attackPower);
    }
}
