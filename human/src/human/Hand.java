package human;

public class Hand {
    String size;
    String leftOrRight;
    String position;
    public Hand(String a,String b, String c){
        size=a;
        leftOrRight=b;
        position=c;
    }

    public String getSize() {
        return size;
    }

    public String getLeftOrRight() {
        return leftOrRight;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setLeftOrRight(String leftOrRight) {
        this.leftOrRight = leftOrRight;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
