import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Character {
    int power;
    int hp;

    public Character() {
        Character character = CharacterFactory.createCharacter();
        this.power = character.getPower();
        this.hp = character.getHp();
    }

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public void kick(Character c) {
        c.hp = 0;
        System.out.println("Character kicked");
    }

    public boolean isAlive() {
        if (this.hp > 0) {
            System.out.println("Character is alive");
            return true;
        } else {
            System.out.println("Character is dead");
            return false;
        }
    }

    public String toString() {
        return "{hp=" + this.hp + ", power=" + this.power + "}";
    }
}
