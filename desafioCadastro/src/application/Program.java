package application;

import model.entities.Pet;
import model.entities.enums.Sexo;
import model.entities.enums.TipoPet;
import model.entities.utils.FileManager;
import model.entities.utils.Menu;

import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        FileManager fl = new FileManager();
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        int resposta;
        String pathForm = "//Users//luizneto//Documents//desafioCadastro//desafioCadastro//files//formulario.txt";


        do {
            menu.menuCadastro();
            resposta = sc.nextInt();
        } while (resposta < 1  || resposta > 6);
        switch(resposta){
            case 1:
                List<String> perguntas = fl.lerFormulario(pathForm);
                String nome = null;
                TipoPet tipo = null;
                Sexo sexo = null;
                String endereco = null;
                Integer idade = 0;
                Double peso = 0.00;
                String raca = null;
                System.out.println("Preencha o formulário abaixo: ");
                for (int i = 0; i<perguntas.size();i++){
                    System.out.println(perguntas.get(i));
                    if (i == 0){
                        System.out.print(">> ");
                        nome = sc.next();
                    }
                    else if (i == 1){
                        System.out.print(">> ");
                        String aux = sc.next();
                        tipo = TipoPet.valueOf(aux.toUpperCase());
                    }
                    else if (i == 2 ){
                        System.out.print(">> ");
                        String aux = sc.next();
                        sexo = Sexo.valueOf(aux.toUpperCase());
                    }
                    else if (i == 3){
                        System.out.print(">> ");
                        endereco = sc.next();
                    }
                    else if (i == 4 ){
                        System.out.print(">> ");
                        idade = sc.nextInt();
                    }
                    else if (i == 5){
                        System.out.print(">> ");
                        peso = sc.nextDouble();
                    }
                    else if (i == 6){
                        System.out.print(">> ");
                        raca = sc.next();
                    }
                    Pet pet = new Pet(nome,endereco,idade,peso,raca,sexo,tipo);

                }
        }


    }
}
