package collectionFramework.CollectionCapC.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> userIds = new HashSet<>();

        userIds.add("CSE-01105819");
        userIds.add("CSE-01105811");
        userIds.add("CSE-01105813");
        userIds.add("CSE-01105819");

        System.out.println("User Ids: "+userIds);

        if (userIds.contains("CSE-01105819")) {
            System.out.println("User id is in the set.");
        } else {
            System.out.println("user id is not in the set.");
        }

        userIds.remove("CSE-01105813");
        System.out.println("Updated user ids: " + userIds);
    }
}
