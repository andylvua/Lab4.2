package lotr;

public class King extends Character {
    public King() {
        super(Random.randomInt(5, 15), Random.randomInt(5, 15));
    }

    public void kick(Character c) {
        System.out.println("King kicked");
        c.hp -= Math.random() > 0.5 ? 0 : this.power;
    }

    public String toString() {
        return "lotr.King" + super.toString();
    }
}
