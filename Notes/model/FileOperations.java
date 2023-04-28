package Notes.model;

import java.util.List;

public interface FileOperations {
    List<String> readALLdata();
    void saveAlldata(List<String> lines);
}
