package module0.lesson2;

/*
"Параметризация несколькими типами"

В данном задании Вам необходимо реализовать класс Tuple<T1, T2>,
который обобщен по двум типам: Т1 и Т2. Как, думаю, Вы уже догадались, класс должен иметь два поля:
left (с типом Т1) и right (с типом Т2). Оба поля должны быть устанавливаемые через конструктор.
Также класс должен иметь два "getter" для каждого поля соответственно:

getLeft()
getRight()
 */
public class Tuple<T1, T2> {

    private final T1 left;
    private final T2 right;

    public Tuple(final T1 left, final T2 right) {
        this.left = left;
        this.right = right;
    }

    public T1 getLeft() {
        return left;
    }

    public T2 getRight() {
        return right;
    }

}
