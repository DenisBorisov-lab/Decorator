package decorator;


import concretedecorators.EquipSneakers;
import concretedecorators.EquipSocks;

public class Demo {

    private static final String path = "./src/main/resources/data.json";

    public static void main(String[] args) {
        Person person = new Person();
        DataSourceDecorator dataSourceDecorator = new EquipSneakers(
                new EquipSocks(
                        new FileDataSource(path)));
        dataSourceDecorator.writeData(person);
    }
}
