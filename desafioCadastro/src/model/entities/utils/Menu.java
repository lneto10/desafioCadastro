package model.entities.utils;

import java.util.Scanner;

public class Menu {

    public Menu (){

    }

    public void menuCadastro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("## Bem vindo ao sistema de Cadastro de PETs ##");
        System.out.println("Presionte ENTER para continuar...");
        sc.nextLine();
        System.out.println("[1] Cadastrar um novo PET");
        System.out.println("[2] Alterar os dados do pet cadastrado");
        System.out.println("[3] Deletar um pet cadastrado");
        System.out.println("[4] Listar todos os pets cadastrados");
        System.out.println("[5] Listar pets por algum critério (idade, nome, raça)");
        System.out.println("[6] Sair");

    }
}
