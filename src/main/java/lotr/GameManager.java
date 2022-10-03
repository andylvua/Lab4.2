package lotr;

public class GameManager {
    void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            if (Math.random() > 0.5) {
                System.out.println("c1 kick c2");
                c1.kick(c2);
            } else {
                System.out.println("c2 kick c1");
                c2.kick(c1);
            }
        }
    }

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        gameManager.fight(c1, c2);
    }
}
