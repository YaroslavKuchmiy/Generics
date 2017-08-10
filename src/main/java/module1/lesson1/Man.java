package module1.lesson1;


public class Man implements Human {

    private final String name;

    public Man(String name) {
        this.name = name;
    }


    public Sex getSex() {
        return Sex.M;
    }


    public String getName() {
        return name;
    }
}