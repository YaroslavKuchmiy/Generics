package module1.lesson1;

import java.util.List;

/*
"Ограничения по типам"

В этом задании нам предстоит реализовать метод, который находит первый интересующий нас элемент из коллекции любого типа,
 который унаследован от Human. Сигнатура метода выглядит следующим образом:

public T findFirst(final List<T> humans, final String namePrefix, final Sex sex);
В коллекции humans метод должен найти первый элемент, который имеет имя, которое начинается с namePrefix и пол sex,
 и вернуть результат. При этом метод должен корректно работать с любым типом, который унаследован от Human, например: Man/Woman.
 */
public class CollectionsHelper<T extends Human> {


        public T findFirst(final List<T> humans, final String namePrefix, final Sex sex) {
            for (int i = 0; i < humans.size(); i++){
                T ob = humans.get(i);
                if (ob.getName().contains(namePrefix) && ob.getSex().equals(sex)){
                    return ob;
                }
            }
            return null;
            /*
            Решение учителя:
             for (T h : humans) {
                if (h.getSex() == sex && h.getName().startsWith(namePrefix)) {
                    return h;
                }
             }
             return null;
             */

        }

}
