package lotr;

public class Elf extends Character {
    public Elf() {
        this.power = 10;
        this.hp = 10;
    }

    public void kick(Character c) {
        if (c.power < this.power) {
            System.out.println("Elf kicked");
            c.hp = 0;
        } else {
            System.out.println("Elf didn't kick");
            c.hp -= 1;
        }
    }

    public String toString() {
        return "Elf" + super.toString();
    }
}
