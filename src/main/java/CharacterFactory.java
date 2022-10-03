public class CharacterFactory {
    public static Character createCharacter() {
        int power = Math.random() > 0.5 ? 5 : 15;
        int hp = Math.random() > 0.5 ? 5 : 15;
        return new Character(power, hp);
    }
}
