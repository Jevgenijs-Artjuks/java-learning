package lv.acodemy;

public class ThirdLesson {
    public static void main(String[] args) {

        //Conditional operators in Java

        //If (is, has -> isRaining, isRandomNumber, hasEvenValue)
        boolean isRaining = true;

        if(isRaining) {
            System.out.println("Take an umbrella!");
        }

        int temperature = 30;
        if(temperature > 29) {
            System.out.println("It is not too hot!");
        }
        //AND (&&)
        if(4 > 2 && 10 > 5) {
            System.out.println("Both are quals!");
        }
        //OR (||)
        if(4 < 2 || 10 > 11){
            System.out.println("Execute this code");
        }

        // if-else ...
        boolean isWekDay = true;

        if(isWekDay) {
            System.out.println("Working today....");
        } else {
            System.out.println("Will stay at home!");
        }

        int number = 10;
        // %
        // + - / * (

        if(number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // If age => 18 -> Access granted
        // In all other cases -> Access denied

        int age = 18;
        if(age >= 18) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied!");
        }

        // if-else-if-else

        int hour = 7;
        if(hour == 5) {
            System.out.println("Will go for run!");
        } else if (hour == 7) {
            System.out.println("Will have breakfast!");
        }else if (hour ==9) {
            System.out.println("Wil start work!");
        } else {
            System.out.println("Free time!");
        }

        int score = 90;
        if(score ==50) {
            System.out.println("OK");
        } else if (score ==70) {
            System.out.println("Good");
        } else if (score ==90) {
            System.out.println("Perfect");
        } else {
            System.out.println("NOT OK");
        }
        int ages = 37;
        if (ages >=0 && ages <=6) {
            System.out.println("Baby");
        }else if (ages >=7 && ages <=17) {
            System.out.println("Shkilla");
        } else if (ages >=18 && ages <=65) {
            System.out.println("Adult");
        } else if (ages >= 66) {
            System.out.println("pens");}

        for(int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Number:" + i + "is even number!");
            }
        }
            int[] numbers = {-2, -10, 5, 6, -100, 3, 0, 20};
            int sum = 0;

            for (int i1 = 0; i1 < numbers.length; i1++) {
                if (numbers[i1] > 0) {
                    sum = sum + numbers[i1];
                }
            }
                    System.out.println("Sum of positive numbers: " + sum);

        System.out.println("Chisla, kotorie deljatsa na 3 i na 5:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nChisla, kotorie deljatsa na 3:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nChisla, kotorie dejatsa na 5:");
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nOstajnie chisla:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }








    }
}
