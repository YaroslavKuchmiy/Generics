package module1.lesson0;

import java.util.List;

/*
"Обобщенные типы на уровне байт кода

Сегодня мы с Вами окунемся в историю. Представьте себя в том далеком времени, когда король Артур восседал за своим круглым
 столом, а его придворные все еще были вынуждены использовать Java без generics. Печальное было время, но так как Java
  обратная совместимость это священная корова, которую нельзя трогать, то приходится и сегодня писать код с оглядкой на то время.
   Так что в задании нужно будет написать код, который не использует generics, но при этом прекрасно работает,
   если на вход подадут обобщенный класс.

Итак, написать нужно обобщенный метод: findIndex, который к тому же статистический, который выполняет простое задание,
он в листе находит первое вхождение заданного элемента (элемент задается вторым входящим аргументом метода) и
возвращает индекс данного элемента в листе. Если элемент не найден в листе, то возвращается -1.

Все банально и просто;) Дерзайте!
 */
public class CollectionsHelper {

    public static int findIndex(final List list, final Object target) {

        // Решение учителя
        for (int i = 0; i < list.size(); i++) {
            final Object element = list.get(i);
            if (element.equals(target)) {
                return i;
            }
        }
        return -1;

        // Мое решение
        //return list.lastIndexOf(target);

    }

}
