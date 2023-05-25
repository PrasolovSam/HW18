public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, Double weight, Integer age) {
        super(name, weight, age);
    }
    public void move(){
        System.out.println("Собака по кличке " + name + " бежит по земле");
    }
}
