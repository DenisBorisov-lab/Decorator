package decorator;


import concretedecorators.EquipSneakers;
import concretedecorators.EquipSocks;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        DataSourceDecorator dataSourceDecorator = new EquipSneakers(
                        new EquipSocks(
                        new FileDataSource("./src/main/resources/data.json")));
        dataSourceDecorator.writeData(person);
    }
}
