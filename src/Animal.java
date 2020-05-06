public abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println(getClass().getName() + " is catching some Zzz's. Let' all envy " + getClass().getName());
    }
}
