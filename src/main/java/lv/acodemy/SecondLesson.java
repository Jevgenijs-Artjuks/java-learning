package lv.acodemy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class SecondLesson {
    public static void main(String[] args) {
        //Array
        int[] numbers = new int[5]; //[0, 0, 0, 0, 0]
        String[] names = {"John", "Andrey", "Mark"}; //{John, Andrey, Mark}

        int[] ages = {19, 20, 30, 41, 50};
        //index: [0] - 19
        //index: [1] - 20
        //index: [2] - 30
        //index: [3] - 41
        //index: [4] - 50
        String[] fruitBasket = new String [10];

        //Element access
        System.out.println(numbers[0]);
        numbers[0] = 10;
        System.out.println(Arrays.toString(numbers));
        numbers[1] = 21;
        numbers[2] = 32;
        numbers[3] = 86;
        numbers[4] = 12;
        System.out.println(Arrays.toString(numbers));
        fruitBasket[0] = "apple";
        fruitBasket[1] = "banana";
        fruitBasket[2] = "pineapple";
        fruitBasket[3] = "orange";
        fruitBasket[4] = "strawberry";
        fruitBasket[5] = "grape";
        fruitBasket[6] = "watermellon";
        fruitBasket[7] = "mango";
        fruitBasket[8] = "peach";
        fruitBasket[9] = "cherry";
        System.out.println(Arrays.toString(fruitBasket));

        //Loops
        //Print "Hello World" 5 times:
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        // for loop
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello World" + " index: " + i);
        }
        for(int i = 0; i < fruitBasket.length; i++) {
            System.out.println(fruitBasket[i]);
        }

        //for each;
        for(String fruit : fruitBasket) {
            System.out.println(fruit);
        }
        //for(counter; condition_is_true; i++;)
        //Print in reverse order:

        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = nums.length -1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("n");


        //Concatenation
        String myName = "Jevgenijs";
        String mySurname = "Artjuks";
        int myAge = 37;
        //My name is Jevgenijs Artjuks. I am 37 years old.
        System.out.println("My name is " + myName + " " + mySurname + ". I am " + myAge + " years old. ");
        // String.format();
        System.out.printf("My name is %s %s. I am %d years old%n", myName, mySurname, myAge);

        String template = """
                My name is %s %s. I am %d years old""";
        System.out.printf((template) + "%n", myName, mySurname, myAge);

        //while loops
        /*
        while(condition) {
        //loop body
        }
         */

        int i = 0;
        while(i <5) {
            System.out.println("Number: " + i);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        String password = "";

        while (!password.equals("secret")) {
            System.out.println("Enter your password:");
            password = scanner.nextLine();
        }
        System.out.println("Access granted!");

        int guessedNumber = 10;
        int guess;
        Scanner myScanner = new Scanner(System.in);
        do{
            System.out.println("Guess number from 1 to 10");
            guess = myScanner.nextInt();
            } while (guess != guessedNumber);

        System.out.println("Guessed!");

        //while: chisla ot 10 do 1;
        int q = 10;
        while (q >= 1) {
            System.out.print(q + " ");
            q--;
        }
        System.out.println(" ");



        //summa chisel ot 1 do 100;
        int summa = 0;
        for(int o = 1; o <=100; o++) {
            summa = summa +o;
        }
        System.out.println("Summa:" + summa);

        //tablica umnozhenija na 5;
        int a = 1;
        while(a <= 10) {
            System.out.println("5 x " + a + " = " + (5 * a ));
            a++;
        }



        }



        }



