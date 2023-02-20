package builder_pattern;

import builder_pattern.impl.ConcreteHouseBuilder;

/**
 * Develop a program to create arbitrary houses.
 * Create a House class with several properties, such as the number of rooms, the presence of a pool, etc.
 * Use the Builder design pattern to create a House object.
 * In the Main class, create several House objects with different characteristics using different ConcreteBuilder and HouseDirector options.
 * Output information about the House objects to the console.
 */

public class Main {
    public static void main(String[] args) {
        ConcreteHouseBuilder chb = new ConcreteHouseBuilder();
        Director director = new Director(chb);
        director.buildHouse2Room1Pool();
        House house1 = chb.getHouse();
        System.out.println("House 2 Rooms 1 Pool: " + house1);
        director.buildHouse2RoomNoPool();
        House house2 = chb.getHouse();
        System.out.println("House 2 Rooms No Pool: " + house2);
        director.buildHouse1Room1Pool();
        House house3 = chb.getHouse();
        System.out.println("House 1 Rooms 1 Pool: " + house3);
    }
}
