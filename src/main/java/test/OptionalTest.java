package test;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        String s = "name";
        Optional<String> name  = Optional.of(s);
        System.out.println(name.get());
    }

}
