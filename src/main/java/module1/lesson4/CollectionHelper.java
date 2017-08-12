package module1.lesson4;


import java.util.ArrayList;
import java.util.List;

public class CollectionHelper {

    // findFirstIndex
    public int findFirstIndex(
            // BEGIN (write your solution here)
            final List<? extends Human> humans, final String namePrefix
            // END
    ) {
        // BEGIN (write your solution here)
        for (int i = 0; i < humans.size(); i++) {
            final Human human = humans.get(i);
            if (human.getName().contains(namePrefix)) {
                return i;
            }
        }
        return -1;
        // END
    }

}
