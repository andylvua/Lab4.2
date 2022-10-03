package lotr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Character {
    int power;
    int hp;

    public Character() {
        this.power = 10;
        this.hp = 10;
    }

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public void kick(Character c) {
        c.hp = 0;
        System.out.println("lotr.Character kicked");
    }

    public boolean isAlive() {
        if (this.hp > 0) {
            System.out.println("lotr.Character is alive");
            return true;
        } else {
            System.out.println("lotr.Character is dead");
            return false;
        }
    }

    public String toString() {
        return "{hp=" + this.hp + ", power=" + this.power + "}";
    }
}
