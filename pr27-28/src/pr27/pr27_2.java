package pr27;

import java.util.StringTokenizer;

public class pr27_2 {
    static class Address {
        String country, reg, city, street, h, build, apartament;

        public Address(String ad) {
            String[] arr = new String [7];
            int i =0;
            for( String s: ad.split(",", 7)) {
                arr[i] = s;
                i++;
            }
            country = arr[0]; reg = arr[1]; city = arr[2]; street = arr[3]; h = arr[4]; build = arr[5]; apartament = arr[6];
        }

        public Address(String ad, String s) {
            String[] arr = new String [7];
            int i =0;
            StringTokenizer st = new StringTokenizer(ad, s);
            while (st.hasMoreTokens()) {
                arr[i] = st.nextToken();
                i++;
            }
            country = arr[0]; reg = arr[1]; city = arr[2]; street = arr[3]; h = arr[4]; build = arr[5]; apartament = arr[6];
        }

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", reg='" + reg + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", h='" + h + '\'' +
                    ", build='" + build + '\'' +
                    ", apartament='" + apartament + '\'' +
                    '}'+'\n';
        }
    }

    public static void main(String[] args) {
        Address ad0 = new Address("Россия,МО,Подольск,Молодежня,8/3,стр3,9");
        Address ad1 = new Address("Россия;МО;Серпухов.Ленина;323,стр1с-422", ",.;-");
        Address ad2 = new Address("Россия,МО;Чехов.Московская-653-стр5a-5", ",.;-");
        Address ad3 = new Address("Россия;МО;Подольск;Строителей;32/5;стр1;42", ",.;-");
        System.out.print(ad0.toString()+ ad1.toString()+ ad2.toString()+ ad3.toString());
    }
}
