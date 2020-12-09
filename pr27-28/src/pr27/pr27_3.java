package pr27;

public class pr27_3 {
    static class Shirt {
        String num, name, colour, size;

        Shirt(String num, String name, String colour, String size) {
            this.num = num;
            this.name = name;
            this.colour = colour;
            this.size = size;
        }

        @Override
        public String toString() {
            return "Shirt{" +
                    "num='" + num + '\'' +
                    ", name='" + name + '\'' +
                    ", colour='" + colour + '\'' +
                    ", size='" + size + '\'' +
                    '}'+'\n';
        }
    }


    public static void main(String[] args) {
        String [] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirt = new Shirt[11];
        int j = 0;
        for (String i: shirts){
            String [] s = i.split(",", 4);
            shirt[j]= new Shirt(s[0], s[1], s[2], s[3]);
            ++j;
        }
        for (Shirt i: shirt){
            System.out.print(i.toString());
        }
    }
}