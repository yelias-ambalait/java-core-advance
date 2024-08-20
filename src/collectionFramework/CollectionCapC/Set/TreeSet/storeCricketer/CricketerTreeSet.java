package collectionFramework.CollectionCapC.Set.TreeSet.storeCricketer;

import java.util.Iterator;
import java.util.TreeSet;

public class CricketerTreeSet {
    public static void main(String[] args) {
        TreeSet<Cricketer> cricketers = new TreeSet<>( new CompareCricketer());

        cricketers.add(new Cricketer("Ashraful", 1));
        cricketers.add(new Cricketer("Imrul Kayes", 4));
        cricketers.add(new Cricketer("Tamim Iqbal", 2));
        cricketers.add(new Cricketer("Anamul Haque", 3));
        cricketers.add(new Cricketer("Mashrafee Mortoza", 5));

        Iterator<Cricketer> it = cricketers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }


    }
}
