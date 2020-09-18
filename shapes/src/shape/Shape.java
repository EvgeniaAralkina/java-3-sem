package shape;

public class Shape {
    String name;
    float s;
    public Shape(String a, float b){
        name=a;
        s=b;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getS() {
        return s;
    }

    public void setS(float s) {
        this.s = s;
    }

    public String getName() {
        return name;
    }
}
