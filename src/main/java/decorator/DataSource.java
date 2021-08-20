package decorator;

public interface DataSource {
    void writeData(Person data);
    Person readData();
}
