public class Duck extends Animal{
    public Duck() {
    }

    public Duck(String name, Double weight, Integer age) {
        super(name, weight, age);
    }

    public void move(){
        System.out.println("Утка по кличке " + name + " летит в облаках");
    }
}
