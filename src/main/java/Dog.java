import org.w3c.dom.ls.LSOutput;

public class Dog {
    private String name;
    private String breed;
    private String health;
    private int age;

    public Dog(String name,String breed,String health,int age) {
        this.name=name;
        this.breed=breed;
        this.health=health;
        this.age=age;
    }

    public Dog(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDog() {
        System.out.println(name +" " +breed + " "+health +" "+ age);
    }

}
