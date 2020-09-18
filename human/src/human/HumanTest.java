package human;

public class HumanTest {
    public static void main(String[] args) {
        Human Sam = new Human("Sam", 14, "right", "small", "run", "left", "small", "up", "blond", "grey");
        Human Kate = new Human("Kate", 17,"right", "small", "run", "left", "small", "up", "blond", "grey");
        Sam.look();
        Kate.whatIsHeDoing();
    }
}
