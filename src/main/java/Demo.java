import lotr.Character;
import org.reflections.Reflections;

import java.util.Random;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character >> subTypes = reflections.getSubTypesOf(lotr.Character.class);
        System.out.println(subTypes.toArray()[new Random().nextInt(subTypes.size())]);
    }
}
