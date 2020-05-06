import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 * Demonstrate the use of abstract classes
 * @Author  RIAN KILGORE
 *
 * Do the following steps:
 *
 * Step 0: Add YOUR NAME above /
 *
 * Step 1: Run the code and notice how it works /
 *
 * Step 2:  For our purposes, the Animal class is abstract, high-level idea that should not be used to create objects.
 * Make the class and abstract class /
 *
 * Step 3:  Notice how our animalSound method in class Animal doesn't make sense.  What animal makes a default sound?
 * Make this method abstract, forcing all derived classes to implement it but leaving it unimplemented in the base/Animal class //
 *
 * Step 4: Run it. Does everything still work? yes /
 *
 * Step 5: Add another Animal subclass of your choice.  Remember it MUST implemenent all abstract methods in its parent class.
 * What does the fox say?
 *
 * Step 6: Instantiate a new animal using your new class and add it to your zoo.  Run it. Does everything work?
 * Notice how any subclass that you create and add to your zoo will not break your zoo code! /
 *
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        ArrayList<Animal> petStore = new ArrayList<Animal>();
        petStore.add(new Tiger());
        zoo.add(new Pig());
        zoo.add(new Tiger());
        for (Animal animal: zoo) {
            animal.animalSound();
            animal.sleep();
        }
        for (Animal animal : petStore){
            animal.animalSound();
            System.out.println("\"Tiger Awake! Run!!\"");
        }
    }
}
