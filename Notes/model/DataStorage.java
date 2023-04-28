package Notes.model;

import java.util.ArrayList;
import java.util.List;

public class DataStorage implements DataOperations {
    private FileManager fm;
    Mapper mapper = new Mapper();

    public DataStorage(FileManager fm) {
        this.fm = fm;
    }

    @Override
    public void createNote(Note note) {
        List<Note> notes = readAll();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        note.setId(String.format("%d", newId));
        notes.add(note);
        save(notes);

    }

    @Override
    public List<Note> readAll() {
        List<String> lines = fm.readALLdata();
        List<Note> notes = new ArrayList<>();
        for (String item : lines) {
            notes.add(mapper.map(item));
        }
        return notes;

    }

    @Override
    public void updateNote(Note note) {
        List<Note> notes = readAll();
        for (Note item : notes) {
            if(item.getId().equals(note.getId())){
                item.setTitle(note.getTitle());
                item.setText(note.getText());
            }
            
        }
        save(notes);
    }

    @Override
    public void deleteNote() {
        // TODO Auto-generated method stub

    }

    @Override
    public void readNote() {
        // TODO Auto-generated method stub

    }

    public void save(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(mapper.map(item));

        }
        fm.saveAlldata(lines);
    }

}
