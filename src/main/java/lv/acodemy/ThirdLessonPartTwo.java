package lv.acodemy;

public class ThirdLessonPartTwo {
    public static void main(String[] args) {

        int summa = add(10,30);
        System.out.println(summa);
        
        System.out.println(add(20, 10));

        greet("Jevgenijs");

        int add = add(10, 5, 10);
        System.out.println(add);

        var i = maxOfTwo(10, 30);
        System.out.println(i);

        int a = 5;
        int b = 12;
        int c = 7;

        int max = maxOfThree(a, b, c);
        System.out.println("Maksimaljnoe chislo: " + max);
    }

    public static int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }



    }
    public static int add(int a, int b) {
        int result = a + b;
        return result;
        }
        public static int add(int a, int b, int c) {
            return a + b + c;
        }

        public static int maxOfTwo(int a, int b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
public static void greet(String name) {
    System.out.println("Hello," + name + "!");
}

}

