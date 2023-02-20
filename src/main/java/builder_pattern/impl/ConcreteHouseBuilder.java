package builder_pattern.impl;

import builder_pattern.House;
import builder_pattern.interfaces.HouseBuilder;

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        house = new House();
    }

    public House getHouse() {
        return house;
    }

    @Override
    public void setNumberRooms(int numberRooms) {
        house.setNumberRooms(numberRooms);
    }

    @Override
    public void setHasPool(boolean hasPool) {
        house.setHasPool(hasPool);
    }
}
