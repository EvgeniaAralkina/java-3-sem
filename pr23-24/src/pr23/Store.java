package pr23;

import java.io.File;
import java.util.ArrayList;

public class Store <V> {
    V[] mas;

    public Store(V[] mas) {
        this.mas = mas;
    }

    public V show(int i) {
        return mas[i];
    }

    public ArrayList<String> S(String s) {
        ArrayList<String> names = new ArrayList<String>();
        File dir = new File(s);
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                names.add(item.getName());
            }
        }
        return names;
    }
}
