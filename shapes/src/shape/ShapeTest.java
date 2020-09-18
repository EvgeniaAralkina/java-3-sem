package shape;

public class ShapeTest {
    public static void main(String[] args) {
        Square s = new Square("square",5);
        Rectangle r = new Rectangle("rec", 7,2);
        Circle c = new Circle("circle", 3);
        s.changeS();
        r.changeS();
        c.changeS();
        System.out.println("площадь квадрата "+s.getName()+": "+s.getS()+" (см)");
        System.out.println("площадь прямоугольника "+r.getName()+": "+r.getS()+" (см)");
        System.out.println("площадь круга "+c.getName()+": "+c.getS()+" (см)");
    }
}