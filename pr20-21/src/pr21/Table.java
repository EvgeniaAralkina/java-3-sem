package pr21;

public class Table extends Furniture{
    String typeOfWood;
    int high;
    public Table(String name, int price, String typeOfWood, int high ) {
        super(name, price);
        this.typeOfWood = typeOfWood;
        this.high = high;
    }

    public String toString() {
        return "name: "+getName() + ", price: " + getPrice() +
                ", made of "+ typeOfWood+
                ", high: "+high+" (cm)";
    }

    public String getTypeOfWood() {
        return typeOfWood;
    }

    public void setTypeOfWood(String typeOfWood) {
        this.typeOfWood = typeOfWood;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
