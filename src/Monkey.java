public class Monkey extends AbstractAnimal {
    @Override
    void voice(){
        System.out.println("Я oбезьяна и кричу");
    }

    @Override
    void walk(){
        super.walk();
            System.out.println("Я обезьяна, я умею ходить и лазить по деревьям");
        }

    @Override
    void eat() {
        super.eat();
            System.out.println("Я обезьяна и ем бананы");
        }
    }
