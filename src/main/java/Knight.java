public class Knight extends Character {
    public Knight() {
        super();
    }

    public void kick(Character c) {
        System.out.println("Knight kicked");
        c.hp -= Math.random() > 0.5 ? 0 : this.power;
    }

    public String toString() {
        return "Knight" + super.toString();
    }
}
