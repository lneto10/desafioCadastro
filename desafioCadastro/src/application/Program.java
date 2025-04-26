package application;

import model.entities.Pet;
import model.entities.enums.Sexo;
import model.entities.enums.TipoPet;
import model.entities.utils.Check;
import model.entities.utils.FileManager;
import model.entities.utils.Menu;

import java.util.List;
import java.util.Scanner;

public class Program {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws InterruptedException {
        FileManager fl = new FileManager();
        Menu menu = new Menu();
        Check check = new Check();
        int resposta;
        String pathForm = "//Users//luizneto//Documents//desafioCadastro//desafioCadastro//files//";



        do {
            menu.menuCadastro();
            resposta = sc.nextInt();
        } while (resposta < 1  || resposta > 6);
        switch(resposta){
            case 1:
                List<String> perguntas = fl.lerFormulario(pathForm+"formulario.txt");
                String nome = null;
                TipoPet tipo = null;
                Sexo sexo = null;
                String endereco = null;
                Double idade = 0.0;
                Double peso = 0.0;
                String raca = null;
                System.out.println("Preencha o formulário abaixo: ");
                sc.nextLine();
                for (int i = 0; i<perguntas.size();i++){
                    System.out.println(perguntas.get(i));
                    if (i == 0){
                        //System.out.print(">> ");
                        nome = check.checkName(sc.nextLine());
                    }
                    else if (i == 1){
                        //System.out.print(">> ");
                        String aux = sc.nextLine();
                        tipo = TipoPet.valueOf(aux.toUpperCase());
                    }
                    else if (i == 2 ){
                        //System.out.print(">> ");
                        String aux = sc.nextLine();
                        sexo = Sexo.valueOf(aux.toUpperCase());
                    }
                    else if (i == 3){
                        //System.out.print(">> ");
                        endereco = sc.nextLine();
                    }
                    else if (i == 4 ){
                        //System.out.print(">> ");
                        idade = sc.nextDouble();
                    }
                    else if (i == 5){
                       // System.out.print(">> ");
                        peso = sc.nextDouble();
                    }
                    else if (i == 6){
                        //System.out.print(">> ");
                        raca = sc.next();
                    }

                }
                Pet pet = new Pet(nome,endereco,idade,peso,raca,sexo,tipo);
                fl.salvarFormulario(pet,pathForm);



        }


    }
}
