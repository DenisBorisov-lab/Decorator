package decorator;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.io.File;

@AllArgsConstructor
public class FileDataSource implements DataSource {
    private String path;


    @Override
    @SneakyThrows
    public void writeData(Person data) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(path), data);
    }

    @Override
    @SneakyThrows
    public Person readData() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(path), Person.class);
    }
}
