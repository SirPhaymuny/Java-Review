package Lambda;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //lambda expression: is feature for java 8 and above also known as
        //                  an anonymous class with only one method

        /* format of using lambda
            (parameters) -> expression
            (parameters) -> { statements }
         */


        String name = "bro";
        char symbol = '!';
        int strl = name.length();

        MyInterface rawInterface = new MyInterface() {
            @Override
            public void message(String name, char symbol) {
                System.out.println("raw value name : "+name+" symbol : "+symbol);
            }
        };

        MyInterface lamInterface = (nam1,sym1) ->{
            System.out.println("lampada value name : "+nam1+" symbol : "+sym1);
        };
        rawInterface.message("Phaymuny",'#');
        lamInterface.message("Phaymuny",'%');


        List<String> listName = new ArrayList<>(List.of("Phaymuny","Phay","Jonh","Jey"));
        System.out.println("List name size : "+listName.size());
        listName.stream()
                .filter(n->n.startsWith("P"))
                        .map(n->"name start with P "+n)
                                .forEach(System.out::println);








        System.out.println(strl);
        //apply lambda expression using user define:
        MyInterface myInterface = (x,y) -> {
            System.out.println("Hello world!");
            System.out.println("This is a nice day ! "+x + y);
        };
        MyInterface myInterface1 = (x,y) -> {
            System.out.println("Hello "+x+y);
        };
        myInterface.message(name,symbol);
        myInterface1.message(name,symbol);



        MyInterface myInterface2 = (ex,et)-> {
            System.out.println(ex+" "+et);
            System.out.println(et);
        };
        myInterface2.message("this",'@');

        MyInterface myInterface3 = new MyInterface() {
            @Override
            public void message(String name, char symbol) {
                System.out.println("this name: "+name+" "+symbol);
            }
        };
        myInterface3.message("name",'$');

    }
}
