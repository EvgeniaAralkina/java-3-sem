package dogs;

public class Dog {
    String name;
    int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int toHumanAge(){
        return age*7;
    }
    public String toString(){
        return ("dog's name is "+ name+", gog's age is "+ age+" (in human age: "+ toHumanAge()+" )");
    }
}
