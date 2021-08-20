package concretedecorators;


import decorator.DataSource;
import decorator.DataSourceDecorator;
import decorator.Person;

public class EquipSocks extends DataSourceDecorator {

    public EquipSocks(DataSource wrap) {
        super(wrap);
    }

    @Override
    public Person readData() {
        return super.readData();
    }

    @Override
    public void writeData(Person data) {
        super.writeData(equip(data));
    }

    public Person equip(Person data) {
        data.setSocks(true);
        return data;
    }
}
