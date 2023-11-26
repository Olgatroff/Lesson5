public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Lion lion = new Lion();
        Monkey monkey = new Monkey();
        Penguin penguin = new Penguin();

        System.out.println("Сейчас смотритель зоопарка попросит животных подать голос");
        zookeeper.makeVoid(lion);
        zookeeper.makeVoid(monkey);
        zookeeper.makeVoid(penguin);
        System.out.println("Сейчас смотритель зоопарка выведет животное на прогулку");
        zookeeper.makeWalk(lion);
        zookeeper.makeWalk(monkey);
        zookeeper.makeWalk(penguin);
        System.out.println("Сейчас смотритель зоопарка покормит животное");
        zookeeper.makeEat(lion);
        zookeeper.makeEat(monkey);
        zookeeper.makeEat(penguin);
    }
}
