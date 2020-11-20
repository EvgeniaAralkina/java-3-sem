package pr21;

public class Sofa extends Furniture{
    String material, color;
    public Sofa(String name, int price, String material, String color) {
        super(name, price);
        this.material = material;
        this.color = color;
    }

    public String toString() {
        return "name: "+getName() + ", price: " + getPrice() +
                ", color: "+color+", made of "+ material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
