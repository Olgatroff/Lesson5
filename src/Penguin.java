public class Penguin extends AbstractAnimal{
    @Override
    void voice(){
        System.out.println("Я пингвин и я кричу");
    }

    @Override
    void walk() {System.out.println("Я пингвин, я умею ходить и плавать");}

    void eat() {System.out.println("Я пингвин и ем рыбу");}
}
