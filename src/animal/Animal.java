package animal;

public class Animal {

    private String name;

    public Animal( String name){
        this.name= name;

    }
    public void speak(){
        System.out.println("HAW HAW");
    }
    public void running(){
        System.out.println(" while running he is making sounds");
    }
    public String getName(){
        return name;
    }
}
