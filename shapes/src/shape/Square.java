package shape;

public class Square extends Shape{
    int a;
    public Square(String a, int c) {
        super(a, 0);
        this.a=c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
    public void changeS(){
        setS(a*a);
    }
}
