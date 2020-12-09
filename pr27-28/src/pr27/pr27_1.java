package pr27;

public class pr27_1 {
    static class Person{
        String name1, name2, name3;

        public Person(String name1, String name2, String name3) {
            this.name1 = name1;
            this.name2 = name2;
            this.name3 = name3;
        }

        public String getName(){
            return name1 + " " + name2.charAt(0) + "." + name3.charAt(0) + ".";
        }

    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        System.out.print(person1.getName());
    }
}
