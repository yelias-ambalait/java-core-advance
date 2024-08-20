package collectionFramework.CollectionCapC.Set.TreeSet.storeCricketer;

public class Cricketer {
    private String name;
    private int battingPosition;
    public Cricketer(String name, int battingPosition) {
        this.name = name;
        this.battingPosition = battingPosition;
    }

    public String getName() {
        return name;
    }

    public int getBattingPosition() {
        return battingPosition;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "name='" + name + '\'' +
                ", battingPosition=" + battingPosition +
                '}';
    }
}
