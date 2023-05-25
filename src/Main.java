public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Pluto", 4.5, 12);
        Duck duck = new Duck("Donald", 2.3, 2);

        duck.move();
        dog.move();
        dog.walk();
    }
}
