public class Zookeeper {
    void makeVoid(AbstractAnimal abstractAnimal){
        System.out.println("Я смотритель зоопарка и сейчас я попрошу животное выполнить команду ГОЛОС");
        abstractAnimal.voice();
    }
    void makeWalk(AbstractAnimal abstractAnimal){
        System.out.println("Я смотритель зоопарка и сейчас я поведу животное на прогулку");
        abstractAnimal.walk();
    }
    void makeEat(AbstractAnimal abstractAnimal){
        System.out.println("Я смотритель зоопарка и сейчас я покормлю животное");
        abstractAnimal.eat();
    }
}
