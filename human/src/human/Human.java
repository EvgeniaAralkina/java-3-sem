package human;

public class Human {
    String name;
    int age;
    Hand hand;
    Head head;
    Leg leg;
    public Human(String nam, int ag,String lfL,String sizL, String act, String lfH, String sizH, String pos, String colH,String colE ){
        name = nam;
        age = ag;
        hand = new Hand(sizH, lfH, pos);
        head = new Head(colE, colH);
        leg = new Leg (sizL,lfL, act);
    }
    public void newActions(String han, String le){
        hand.setPosition(han);
        leg.setAction(le);
    }
    public void whatIsHeDoing(){
        System.out.println(name+"'s " +hand.getLeftOrRight()+ " hand are "+ hand.getPosition());
        System.out.println(name+ "'s "+ leg.getLeftOrRight() + " leg are "+ leg.getAction());
    }
    public void look(){
        System.out.println(name+"'s eyes are "+ head.colorOfEyes +" and hair are "+ head.colorOfHair);
    }
}
