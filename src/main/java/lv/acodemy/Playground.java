package lv.acodemy;

public class Playground {
    public static void main(String[] args) {


        Dog rex = new Dog();
        rex.setName("Rex");
        rex.setAge(1);
        rex.bark();
        rex.feed();

        System.out.println(rex.getName());
        System.out.println(rex.getAge());

        Dog zhulj = new Dog ("Taksa");
        zhulj.setName("Zhulj");
        zhulj.setAge(1);

        System.out.println(zhulj.getName());
        System.out.println(zhulj.getAge());
        System.out.println(zhulj.getBreedName());

        //All argument constructor
        Dog bratuxa = new Dog("Bratuxa", 1, "Alabai");
        System.out.println(bratuxa);

        Car jeep = new Car("Jeep");
        System.out.println(jeep);
        jeep.drive();
        System.out.println(jeep);
        jeep.drive();
        System.out.println(jeep);
        jeep.drive();
        jeep.drive();
        jeep.drive();
        jeep.drive();
        System.out.println(jeep);
        jeep.drive();
        System.out.println(jeep);
        jeep.refuel();
        System.out.println(jeep);
        jeep.service();
        System.out.println(jeep);
        jeep.service();
        System.out.println(jeep);
        jeep.service();
        System.out.println(jeep);














    }
}
