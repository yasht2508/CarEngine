package CarEngine;

public class Car {
    
    private IEngine eng;
    
    // Constructor Injection
    // public Car(IEngine eng) {
    //     this.eng = eng;
    // }


    // Setter Injection
    // public void setEng(IEngine eng) {
    //     this.eng = eng;
    // }

    public void CarStart()
    {
        eng.start();
        System.out.println("Car Started.");
        System.out.println("Added for checking, merge conflict. In Local");
    }

    
}
