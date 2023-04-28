package Notes.views;

import java.util.List;
import java.util.Scanner;

import Notes.controller.Controller;
import Notes.model.Note;

public class UserInterface {
    Controller controller;
    public UserInterface(Controller controller){
        this.controller = controller;
    }

    public void run(){
        while (true){
            try{
        Commands com = Commands.NONE;
        String command = prompt("Введите комманду");
        com = Commands.valueOf(command.toUpperCase());
        
            if(com == Commands.EXIT){
                return;
            }
            switch(com){
                case ALL:
                list();
                break;
                case CREATE:
                create();
                break;
                case UPDATE:
                update();
                break;
                case DELETE:
                break;
                case READ:
                read();
                break;
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    }
    private String prompt(String message){
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println(message);
        return in.nextLine();
    }
    public void create(){
        String title = prompt("Введите заголовок");
        String text = prompt("Введите текст");
        controller.SaveNote(new Note(title, text));
    }
    public void list(){
        List<Note> notes = controller.ShowAll();
        for (Note note : notes) {
            System.out.println(note);
            System.out.println();
            
        }
    }
    public void update() throws Exception{
        String id = prompt("Введите номер записи");
        Note note = controller.readNote(id);
        System.out.println(note);
        String title = prompt("Новый заголовок");
        String text = prompt("Новый текст");
        note.setTitle(title);
        note.setText(text);
        controller.updateNote(note);


    }
    public void read() throws Exception{
        String id = prompt("Введите номер записи");
        Note note = controller.readNote(id);
        System.out.println(note);
    }
    
}
