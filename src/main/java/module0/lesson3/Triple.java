package module0.lesson3;

import module0.lesson2.Tuple;

/*
"Наследование от обобщенных классов"

В данном задании Вам необходимо реализовать класс Triple<T1, T2, T3> который наследуется от Tuple, который уже реализован за Вас.
 Как, думаю, Вы уже поняли, класс должен иметь три поля:

left (с типом Т1)
middle (с типом Т2)
и right (с типом Т3)

Все три поля должны быть устанавливаемые через конструктор. Так же класс должен иметь три "getter" для каждого поля соответственно:

getLeft();
getMiddle();
getRight();
 */
public class Triple<T1, T2, T3> extends Tuple<T1, T3> {

    private final T2 middle;

    public Triple(final T1 left, final T2 middle, final T3 right) {
        super (left, right);
        this.middle = middle;
    }

    public T2 getMiddle() {
        return this.middle;
    }

}