package lotr;

public class Knight extends Character {
    public Knight() {
        super(Random.randomInt(2, 12), Random.randomInt(2, 12));
    }

    public void kick(Character c) {
        System.out.println("Knight kicked");
        c.hp -= Math.random() > 0.5 ? 0 : this.power;
    }

    public String toString() {
        return "lotr.Knight" + super.toString();
    }
}
