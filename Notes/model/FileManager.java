package Notes.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class FileManager implements FileOperations {
    private String filename;

    public FileManager(String filename) {
        this.filename = filename;
        try (FileWriter fw = new FileWriter(filename, false)) {
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<String> readALLdata() {

        List<String> lines = new ArrayList<>();
        try {
            File file = new File(filename);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            if (line != null) {
                lines.add(line);
            }
            while ((line = br.readLine()) != null) {
                line = br.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public void saveAlldata(List<String> lines) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            for (String line : lines) {
                writer.write(line);
                writer.append('\n');

            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
