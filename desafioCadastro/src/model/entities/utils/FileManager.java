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

    public void salvarFormulario(Pet pet,String pathForm){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("[yyyyMMdd'T'HHmm");
        String dateFormatado = date.format(dateFormat);

        pathForm += dateFormatado + " - "+pet.getNome().toUpperCase()+".txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathForm))) {
            bw.write("1 - " + pet.getNome() + "\n");
            bw.write("2 - " + pet.getTipo() + "\n");
            bw.write("3 - " + pet.getSexo() + "\n");
            bw.write("4 - " + pet.getEndereco() + "\n");
            bw.write("5 - " + Math.round(pet.getIdade()) + ((pet.getIdade() < 1) ? "meses" : " anos") + "\n");
            bw.write("6 - " + pet.getPeso() + "\n");
            bw.write("7 - " + pet.getRaça() + "\n");

            System.out.println("Formulário salvo com sucesso no caminho "+pathForm);


            } catch (IOException e ) {
            System.out.println("Erro ao salvar no arquivo "+e.getMessage());

        }
    }
}
