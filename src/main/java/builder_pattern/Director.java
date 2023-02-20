package builder_pattern;

import builder_pattern.interfaces.HouseBuilder;

public class Director {
    private HouseBuilder houseBuilder;

    public Director() {
    }

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse1RoomNoPool() {
        houseBuilder.setNumberRooms(1);
        houseBuilder.setHasPool(false);
    }

    public void buildHouse2RoomNoPool() {
        houseBuilder.setNumberRooms(2);
        houseBuilder.setHasPool(false);
    }

    public void buildHouse1Room1Pool() {
        houseBuilder.setNumberRooms(1);
        houseBuilder.setHasPool(true);
    }

    public void buildHouse2Room1Pool() {
        houseBuilder.setNumberRooms(2);
        houseBuilder.setHasPool(true);
    }



}
