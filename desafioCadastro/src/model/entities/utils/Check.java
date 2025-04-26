package model.entities.utils;
import model.entities.exceptions.PetExceptions;
import static application.Program.sc;

import java.util.Scanner;

public class Check {

    public String checkName(String name){
        Scanner sc = new Scanner(System.in);

        try {
            if(name.isEmpty()){
                return "NÃO INFORMADO";
            }
            if (name.matches(".*\\d.*")) {
                throw new PetExceptions("O nome deve conter apenas caracteres, sem numeros");
            }
            if (name.matches(".*[\\p{P}\\p{S}].*")) {
                throw new PetExceptions("O nome não pode conter caracteres especiais");
            }
            if (!name.matches(".*\\s.*")) {
                throw new PetExceptions("Digite um sobrenome!");
            }

        } catch (PetExceptions e ){
            System.out.println(e.getMessage());
            System.out.println("Insira o nome corretamente");
            return checkName(sc.nextLine());

        }
        return name;
    }

}
