public class Animal {
    protected String name;
    protected Double weight;
    protected Integer age;

    public Animal() {
    }
    public Animal(String name, Double weight, Integer age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void walk(){
        System.out.println("Животное идет по земле");
    }
    public void move(){
    }
}
