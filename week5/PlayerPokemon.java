package week5;

public class PlayerPokemon {
    String name;
    int maxHP;
    int hp;
    int attackPower;

    public PlayerPokemon(String name, int maxHP, int attackPower) {
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

    public void attack(WildPokemon wildPokemon) {
        wildPokemon.takeDamage(this.attackPower);
    }
}
