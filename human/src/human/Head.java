package human;

public class Head {
    String colorOfEyes;
    String colorOfHair;
    public Head (String a, String b){
        colorOfEyes=a;
        colorOfHair = b;
    }

    public String getColorOfEyes() {
        return colorOfEyes;
    }

    public String getColorOfHair() {
        return colorOfHair;
    }

    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }

    public void setColorOfHair(String colorOfHair) {
        this.colorOfHair = colorOfHair;
    }
}
