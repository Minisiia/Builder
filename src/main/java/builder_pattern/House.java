package builder_pattern;

public class House {
    private int numberRooms;
    private boolean hasPool;

    public int getNumberRooms() {
        return numberRooms;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberRooms=" + numberRooms +
                ", hasPool=" + hasPool +
                '}';
    }
}
