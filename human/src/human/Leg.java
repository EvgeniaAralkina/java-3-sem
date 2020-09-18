package human;

public class Leg {
    String size;
    String leftOrRight;
    String action;
    public Leg(String a, String b, String c){
        size=a;
        leftOrRight=b;
        action=c;
    }

    public void setLeftOrRight(String leftOrRight) {
        this.leftOrRight = leftOrRight;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLeftOrRight() {
        return leftOrRight;
    }

    public String getSize() {
        return size;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
