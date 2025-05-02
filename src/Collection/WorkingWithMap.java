package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class WorkingWithMap {
    //A Map is a collection that maps keys to values.
    // Unlike a List or Set, which store only values, a Map stores key-value pairs.
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        Map<String, Integer> linkedScores = new LinkedHashMap<>();
        Map<String, Integer> treeScores = new TreeMap<>();

        //add entries
        scores.put("Aly",1);
        scores.put("Alice",2);
        scores.put("Alo",3);
        System.out.println(scores);
        System.out.println("the score and things : "+scores.get("Aly"));
        scores.put("Bob",4);
        scores.remove("Alice");
        for (Map.Entry<String, Integer> entry: scores.entrySet()){
            System.out.println("Key : "+entry.getKey()+" => Value : "+entry.getValue());
        }
        linkedScores.put("Aly",1);
        linkedScores.put("Alice",2);
        linkedScores.put("Alo",3);
        System.out.println(linkedScores);

        treeScores.put("Aly",1);
        treeScores.put("Alice",2);
        treeScores.put("Alo",3);
        System.out.println(treeScores);

    }
}
