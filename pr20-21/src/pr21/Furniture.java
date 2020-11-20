package pr21;

public abstract class Furniture {
    String name;
    int price;
    public Furniture(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
