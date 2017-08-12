package module1.lesson4;


import module1.lesson1.Human;
import module1.lesson1.Sex;

public class Woman implements Human {

    private final String name;

    public Woman(String name) {
        this.name = name;
    }


    public Sex getSex() {
        return Sex.F;
    }


    public String getName() {
        return name;
    }
}
