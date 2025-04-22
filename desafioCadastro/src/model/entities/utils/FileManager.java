package model.entities.utils;

import model.entities.Pet;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    public void salvarFormulario(Pet pet,String pathForm,List perguntas){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("[yyyyMMdd'T'HHmm");
        String dateFormatado = date.format(dateFormat);

        pathForm += dateFormatado + " - "+pet.getNome().toUpperCase()+".txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathForm))) {
            for (int i = 0;i<perguntas.size();i++){
                bw.write(i+1+" - "+pet.getNome());
                bw.newLine();
            }

            } catch (IOException e ) {
            System.out.println("Erro ao salvar no arquivo "+e.getMessage());

        }
    }
}
