package src;

import src.businesslogic.MyLife;

public class Application {

    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        String favoriteFlavor = "chocolate";
        String favoriteActivity = "running";
        MyLife JohnsLive = new MyLife(age, name , favoriteFlavor, favoriteActivity);
        System.out.println("Testcase 1 starts");
        JohnsLive.start();
        System.out.println("Testcase 1 finished");
        System.out.println("");
        String name2 = "Tim";
        int age2 = 8;
        String favoriteFlavor2 = "strawberry";
        String favoriteActivity2 = "playing table tennis";
        MyLife timsLive = new MyLife(age2, name2 , favoriteFlavor2, favoriteActivity2);
        System.out.println("Testcase 2 starts");
        timsLive.start();
        System.out.println("Testcase 2 ends");
    }
}
