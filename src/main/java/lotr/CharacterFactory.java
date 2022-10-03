package lotr;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(lotr.Character.class);

        Object randomCharacter = subTypes.toArray()[new Random().nextInt(subTypes.size())];

        return (Character) randomCharacter.getClass().getConstructor().newInstance();
    }
}
