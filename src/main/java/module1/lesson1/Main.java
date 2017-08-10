package module1.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String... args) {
        final CollectionsHelper<Man> collectionsHelper = new CollectionsHelper<>();

        final Man slava = new Man("Slava");
        final Man gleb = new Man("Gleb");
        final List<Man> mans = new ArrayList<>();
        mans.add(slava);
        mans.add(gleb);
        final Human expectedResult = slava;
        final Human actualResult = collectionsHelper.findFirst(mans, "Sl", Sex.M);
        if (actualResult != expectedResult) {
            throw new RuntimeException(String.format("CollectionsHelper.findFirs returns incorrect result for: " +
                            "target: %d. " +
                            "Incorrect result is: %d, expected: %d", "Sl/Sex.M", actualResult.getName(),
                    expectedResult.getName()));
        }
        final Human expectedResult2 = null;
        final Human actualResult2 = collectionsHelper.findFirst(mans, "Sl", Sex.F);
        if (actualResult != expectedResult) {
            throw new RuntimeException(String.format("CollectionsHelper.findFirs returns incorrect result for: " +
                            "target: %d. " +
                            "Incorrect result is: %d, expected: %d", "Sl/Sex.F", actualResult2.getName(),
                    expectedResult2.getName()));
        }
    }

}
