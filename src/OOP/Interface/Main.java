package OOP.Interface;

import OOP.Interface.AbractClass.Cat;

public class Main {
    public static void main(String[] args) {
        Rabit rabit = new Rabit();
        rabit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
        Cat cat = new Cat();
        cat.makeNoise();
    }
}
