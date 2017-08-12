package module1.lesson3;

import java.util.List;

public class CollectionHelper {

    public static<T> int findFirstIndex(List<T> list, T human) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(human)) {
                return i;
            }
        }
        return -1;
    }

    public static<T> int findLastIndex(List<T> list, T human) {
        int size = list.size() - 1;
        for (int i = size; i > 0; i--) {
            if (list.get(i).equals(human)) {
                return i;
            }
        }
        return -1;
    }

}
