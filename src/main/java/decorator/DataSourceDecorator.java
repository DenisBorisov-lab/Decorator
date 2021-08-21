package decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DataSourceDecorator implements DataSource {
    private DataSource wrap;

    @Override
    public void writeData(Person data) {
        wrap.writeData(data);
    }

    @Override
    public Person readData() {
        return wrap.readData();
    }
}
