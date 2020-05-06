public class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println(getClass().getName() + " says: wee wee");
    }
}
