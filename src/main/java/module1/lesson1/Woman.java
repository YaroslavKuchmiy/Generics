package module1.lesson1;


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
