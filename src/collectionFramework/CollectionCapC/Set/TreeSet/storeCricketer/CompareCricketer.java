package collectionFramework.CollectionCapC.Set.TreeSet.storeCricketer;

import java.util.Comparator;

public class CompareCricketer implements Comparator<Cricketer> {
    @Override
    public int compare(Cricketer b1, Cricketer b2) {
        if (b1.getBattingPosition() > b2.getBattingPosition()) {
            return 1;
        } else if (b1.getBattingPosition() < b2.getBattingPosition()) {
            return -1;
        } else {
            return 0;
        }
    }
}
