package secondpractecal;

public class Animal {



    private int age;
    private String name;


    public Animal(int age, String name ) {
        this.age = age;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", firstname='" + name + '\'' +
                ", lastname='" +
                '}';
    }
}
