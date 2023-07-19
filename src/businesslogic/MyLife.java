package src.businesslogic;

import java.util.ArrayList;
import java.util.List;

public class MyLife {
    private int age;
    private String name;
    private String favoriteFlavor;
    private String favoriteActivity;


    public MyLife(int age, String name, String favoriteFlavor, String favoriteActivity) {
        this.age = age;
        this.name = name;
        this.favoriteFlavor = favoriteFlavor;
        this.favoriteActivity = favoriteActivity;
    }
    public void start() {

        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
        String favoriteFood = "ice cream";
        if(age < 12) {
            favoriteFood = "Cornflakes";
        } else if(age < 30 ) {
            favoriteFood = "Power Cornflakes";
        } else if(age < 60) {
            favoriteFood = "Power Cornflakes without extra sugar";
        } else if (age > 40) {
            favoriteFood = "Power Cornflakes without extra sugar and with extra vitamins";
        } else {
            favoriteFood = "ice cream";
        }
        System.out.println("I need to wake up in the morning and eat " + favoriteFlavor + " flavored " + favoriteFood);

        String in = "active";

        if(age < 12) {
            in = "powerful";
        } else if(age < 30 ) {
            in = "playfull";
        } else if(age < 60) {
            in = "exhausting";
        } else if (age > 40) {
            in = "motivated";
        } else {
           in = "powerful";
        }

        System.out.println("Then I do my favorite activity: " + favoriteActivity + " with a "+in+" intensity.");

        System.out.println("Then I need to work, currently I am working on a real hard mathematical problem.");
        System.out.println("I think I find a good algorithm for it.");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add (2);
        numbers.add(100);
        numbers.add(29);
        numbers.add(28);
        numbers.add(49);
        numbers.add(1);
        numbers.add(99);
        numbers.add(222);
        int n = numbers.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }

        int result = numbers.get(numbers.size()-1);

        System.out.println("The result of my problem for "+numbers+" is: " + result);


        ArrayList<Integer> secondNumbers = new ArrayList<>();
        secondNumbers.add (2);
        secondNumbers.add(100);
        secondNumbers.add(29);
        secondNumbers.add(500);
        secondNumbers.add(49);
        secondNumbers.add(1);
        secondNumbers.add(99);
        secondNumbers.add(222);
        int nSecond = secondNumbers.size();

        for (int i = 0; i < nSecond - 1; i++) {
            for (int j = 0; j < nSecond - i - 1; j++) {
                if (secondNumbers.get(j) > secondNumbers.get(j + 1)) {
                    int temp = secondNumbers.get(j);
                    secondNumbers.set(j, secondNumbers.get(j + 1));
                    secondNumbers.set(j + 1, temp);
                }
            }
        }

        int secondResult = secondNumbers.get(secondNumbers.size()-1);

        System.out.println("The result of my problem for "+secondNumbers+" is: " + secondResult);

        ArrayList<Integer> thirdNumbers = new ArrayList<>();
        thirdNumbers.add (2);
        thirdNumbers.add(100);
        thirdNumbers.add(609);
        thirdNumbers.add(500);
        thirdNumbers.add(49);
        thirdNumbers.add(1);
        thirdNumbers.add(99);
        thirdNumbers.add(222);

        int nThird = thirdNumbers.size();

        for (int i = 0; i < nThird - 1; i++) {
            for (int j = 0; j < nThird - i - 1; j++) {
                if (thirdNumbers.get(j) > thirdNumbers.get(j + 1)) {
                    int temp = thirdNumbers.get(j);
                    thirdNumbers.set(j, thirdNumbers.get(j + 1));
                    thirdNumbers.set(j + 1, temp);
                }
            }
        }

        int thirdResult = thirdNumbers.get(thirdNumbers.size()-1);

        System.out.println("The result of my problem for "+thirdNumbers+" is: " + thirdResult);

        System.out.println("What do you think is my hard mathematical problem?");

        System.out.println("Afterwards I need to eat again, I am hungry. And then I go to bad");


    }
}
