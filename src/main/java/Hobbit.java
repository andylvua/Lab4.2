public class Hobbit extends Character {
    public void setHp (int hp) {
        if (hp >= 0 && hp <= 3) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public Hobbit() {
        this.power = 0;
        this.hp = 3;
    }

    private void toCry() {
        System.out.println("Hobbit cries in the corner");
    }

    public void kick(Character c) {
        this.toCry();
    }

    public String toString() {
        return "Hobbit" + super.toString();
    }
}
