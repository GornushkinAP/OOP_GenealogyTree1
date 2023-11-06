import java.io.IOException;
import java.util.List;

public interface FileIO {
    void writeToFile(String fileName, List<Person> people) throws IOException;
    List<Person> readFromFile(String fileName) throws IOException;
}

