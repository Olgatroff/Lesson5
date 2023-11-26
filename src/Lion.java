public class Lion extends AbstractAnimal {
    @Override
    void voice() {
        System.out.println("Я лев и я рычу");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Я лев, я умею ходить и быстро бегать");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Я лев и я хищник, ем мясо");
    }
}