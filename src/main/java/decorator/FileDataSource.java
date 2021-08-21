package decorator;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;

public class FileDataSource implements DataSource {
    private final String path;
    private ObjectMapper objectMapper = new ObjectMapper();

    public FileDataSource(String path) {
        this.path = path;
    }

    @Override
    @SneakyThrows
    public void writeData(Person data) {
        objectMapper.writeValue(new File(path), data);
    }

    @Override
    @SneakyThrows
    public Person readData() {
        return objectMapper.readValue(new File(path), Person.class);
    }
}
