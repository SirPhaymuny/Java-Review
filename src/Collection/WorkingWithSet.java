package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSet {
    //Set is just a collection that allow duplication of value in it.
         /* | Class           | Features                                            |
            | --------------- | --------------------------------------------------- |
            | `HashSet`       | Fast, **unordered**, allows 1 null, uses hash table |
            | `LinkedHashSet` | Ordered by **insertion order**                      |
            | `TreeSet`       | Sorted **natural order** (or custom comparator)     | */

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add(null);
        fruits.add("Apple"); // duplicate, will be ignored
        System.out.println(fruits.contains("App"));
        System.out.println(fruits); // Unordered, no duplicates
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits.contains(null));
        //fruits.clear();
        System.out.println(fruits);
        fruits.remove(null);
        TreeSet<String> sortedFruits = new TreeSet<>(fruits);
        System.out.println(sortedFruits);
    }
}
