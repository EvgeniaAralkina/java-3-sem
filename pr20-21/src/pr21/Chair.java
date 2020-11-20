package pr21;

public class Chair extends Furniture{
    String childOrNot, material;
    public Chair(String name, int price, String childOrNot, String material) {
        super(name, price);
        this.childOrNot= childOrNot;
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String getChildOrNot() {
        return childOrNot;
    }

    public void setChildOrNot(String childOrNot) {
        this.childOrNot = childOrNot;
    }

    @Override
    public String toString() {
        return "name: "+getName() + ", price: " + getPrice() +
                ", "+childOrNot+ ", made of "+ material;
    }
}