package module0.lesson1;


public class Box<T> {
    private final T value;

    public Box(final T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
