package Collection;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    //List is ordered collection that allow duplicate , maintains insertion order, can access by index.
    /*      | Class        | Description                          |
            | ------------ | ------------------------------------ |
            | `ArrayList`  | Fast random access, resizable array  |
            | `LinkedList` | Faster insert/delete in the middle   |
            | `Vector`     | Like `ArrayList` but thread-safe     |
            | `Stack`      | Extends `Vector`, used as LIFO stack |
      */
    public static void main(String[] args) {
        List<String> listAllName = new ArrayList<>();
        //add
        listAllName.add("apple");
        listAllName.add("orange");
        listAllName.add("mango");
        listAllName.add("banana");

        //show all value in list
        System.out.println(listAllName);

        //Iterating
        for (String item:listAllName){
            System.out.println("each name : "+item);
        }

        //modify the element
        listAllName.set(1,"not a fruit");
        System.out.println(listAllName);
        System.out.println("the value on index 1 : "+listAllName.get(1));

        //removing the element
        listAllName.remove("mango");
        System.out.println("after remove : "+listAllName);

        //checking size
        System.out.println("there are "+listAllName.size()+" items in this array.");

    }
}
