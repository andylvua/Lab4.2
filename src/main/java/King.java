public class King extends Character {
    public King() {
        super();
    }

    public void kick(Character c) {
        System.out.println("King kicked");
        c.hp -= Math.random() > 0.5 ? 0 : this.power;
    }

    public String toString() {
        return "King" + super.toString();
    }
}
