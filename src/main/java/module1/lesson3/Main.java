package module1.lesson3;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String... args) {
        final Man slava = new Man("Slava");
        final Man gleb = new Man("Gleb");
        final List<Man> mans = new ArrayList<>();
        mans.add(slava);
        mans.add(gleb);
        mans.add(gleb);
        mans.add(slava);
        final int expectedResult = 0;
        final int actualResult = CollectionHelper.<Man>findFirstIndex(mans, slava);
        if (actualResult != expectedResult) {
            throw new RuntimeException(String.format("CollectionsHelper.findFirstIndex returns incorrect result for: " +
                            "target: %s. " +
                            "Incorrect result is: %d, expected: %d", "slava", actualResult,
                    expectedResult));
        }
        final int expectedResult2 = 3;
        final int actualResult2 = CollectionHelper.<Man>findLastIndex(mans, slava);
        if (actualResult != expectedResult) {
            throw new RuntimeException(String.format("CollectionsHelper.findLastIndex returns incorrect result for: " +
                            "target: %s. " +
                            "Incorrect result is: %d, expected: %d", "slava", actualResult2,
                    expectedResult2));
        }
    }

}
