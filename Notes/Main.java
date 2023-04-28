package Notes;

import Notes.controller.Controller;
import Notes.model.DataStorage;
import Notes.model.FileManager;
import Notes.views.UserInterface;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager("test.txt");
        DataStorage dataStorage = new DataStorage(fileManager);
        Controller controller = new Controller(dataStorage);
        UserInterface ui = new UserInterface(controller);
        ui.run();
    }
}
