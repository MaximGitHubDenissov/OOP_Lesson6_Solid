package Notes.model;

import java.util.List;

public interface DataOperations {
    void createNote(Note note);
    List<Note>readAll();
    void updateNote(Note note);
    void deleteNote();
    void readNote();
}
