public class Tiger extends Animal{

    @Override
     public void animalSound(){
        System.out.println(getClass().getName() + " says: Roar!");
    }
}
