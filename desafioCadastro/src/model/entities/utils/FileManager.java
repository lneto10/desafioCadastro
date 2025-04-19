package model.entities.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {



    public FileManager() {
    }


    public List<String> lerFormulario (String pathForm){
        List<String> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(pathForm))){
            String line = br.readLine();
            while(line != null){
                list.add(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error "+e.getMessage());
            return null;
        }

        return list;


    }
}
