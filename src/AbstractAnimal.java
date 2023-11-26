public abstract class AbstractAnimal {
    abstract void voice();

    void walk() {
        System.out.println("Я животное и умею ходить");
    }

    void eat() {
        System.out.println("Я животное, и чтобы жить мне нужно кушать");
    }

}