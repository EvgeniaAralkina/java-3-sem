package shape;

class Rectangle extends Shape{
    int a;
    int b;
    public Rectangle(String a, int c, int d) {
        super(a, 0);
        this.a=c;
        this.b=d;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }
    public void changeS(){
        setS(a*b);
    }
}
