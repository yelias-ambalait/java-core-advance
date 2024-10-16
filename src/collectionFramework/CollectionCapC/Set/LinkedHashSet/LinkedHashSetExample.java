package collectionFramework.CollectionCapC.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Abdullah");
        linkedHashSet.add("Baitullah");
        linkedHashSet.add("Cairo");
        linkedHashSet.add("Double");
        linkedHashSet.add("Enam");
        linkedHashSet.add("Amatullah");
        System.out.println("LinkedHashSet size: " + linkedHashSet.size());
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("LinkedHashSet Remove: " + linkedHashSet.remove("Double"));
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("LinkedHashSet contain: " + linkedHashSet.contains("Enam"));
        System.out.println("LinkedHashSet isEmpty: " + linkedHashSet.isEmpty());
    }
}
