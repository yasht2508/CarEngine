package CarEngine;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception{

        // Car c = new Car(new DieselEngine());
        // c.CarStart();
        
        // Now we will use Refelection to create object of DieselEngine and inject it into Car class.

        Class<?> clz =  Class.forName("CarEngine.Car"); // loading the class Car using forName() method.

        // Making the object of class Car, and typecasting it.
        Object obj = clz.getDeclaredConstructor().newInstance();
        Car carObj = (Car)obj;

        Field engField = clz.getDeclaredField("eng"); // getting the eng field.
        engField.setAccessible(true); // setting the accessibility of eng to true.

        engField.set(carObj, new PetrolEngine());
        carObj.CarStart();


    }
}
