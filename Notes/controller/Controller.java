package Notes.controller;

import java.util.List;

import Notes.model.DataStorage;
import Notes.model.Note;

public class Controller {
    private final DataStorage dataStorage;
    

    public Controller(DataStorage dataStorage){
        this.dataStorage = dataStorage;
    }
    public void SaveNote(Note note){
        dataStorage.createNote(note);
    }

    public List<Note> ShowAll(){
        return dataStorage.readAll();
    }
    public Note readNote(String id) throws Exception{
        List<Note> notes = dataStorage.readAll();
        for (Note item : notes) {
            if(item.getId().equals(id)){
                return item;
            }
        }
        throw new Exception("Note not found");
    }
    public void updateNote(Note note){
        dataStorage.updateNote(note);
    }




}
