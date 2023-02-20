## Builder
## Design patterns. Builder
Develop a program to create arbitrary houses. Create a House class with several properties, such as the number of rooms, the presence of a pool, etc. Use the Builder design pattern to create a House object. In the Main class, create several House objects with different characteristics using different ConcreteBuilder and HouseDirector options. Output information about the House objects to the console.

Requirements for implementation:

- Create the HouseBuilder interface with methods for setting each House property.

- Create the ConcreteHouseBuilder class, which implements the HouseBuilder interface and contains a House instance. The methods of ConcreteHouseBuilder set the House properties.

- Create the HouseDirector class, which contains methods for step-by-step creation of a House object. The methods of HouseDirector use the methods of ConcreteHouseBuilder to set the House properties.

- Create the House class, which contains properties set using HouseBuilder methods.

- In the Main method, create several ConcreteHouseBuilder and HouseDirector objects using different options to set the characteristics of the houses.

- Output information about the House objects to the console.

## Задание

Разработать программу для создания произвольных домов. Необходимо создать класс House с несколькими свойствами, такими как количество комнат, наличие бассейна и т.д. Для создания объекта House используйте паттерн Строитель (Builder). В классе Main создайте несколько объектов House с различными характеристиками, используя разные варианты ConcreteBuilder и HouseDirector. Выведите информацию об объектах House в консоль.

Требования к реализации:

- Создайте интерфейс HouseBuilder с методами для установки каждого свойства House.

- Создайте класс ConcreteHouseBuilder, который реализует интерфейс HouseBuilder и содержит экземпляр House. Методы ConcreteHouseBuilder устанавливают свойства House.

- Создайте класс HouseDirector, который содержит методы для пошагового создания объекта House. Методы HouseDirector используют методы ConcreteHouseBuilder для установки свойств House.

- Создайте класс House, который содержит свойства, задаваемые с помощью методов HouseBuilder.

- В методе Main создайте несколько объектов ConcreteHouseBuilder и HouseDirector, используя различные варианты для установки характеристик домов.

- Выведите информацию об объектах House в консоль.
