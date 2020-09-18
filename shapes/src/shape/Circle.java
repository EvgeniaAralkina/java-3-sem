package shape;

class Circle extends Shape {
    float r;

    public Circle(String a, int c) {
        super(a, 0);
        r = c;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }
    public void changeS(){
        setS(3.14f*r*r);
    }
}
