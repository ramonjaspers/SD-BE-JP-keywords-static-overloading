package nl.novi.javaprogrammeren.four.hidden;

import org.jetbrains.annotations.NotNull;

public class HumanMaker {

    private HumanMaker() {}

    public static @NotNull Human createHuman(String name) {
        return new Human(name);
    }

    public static String getHumanName(@NotNull Human human) {
        return human.getName();
    }
}
