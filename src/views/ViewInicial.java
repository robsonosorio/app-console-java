package views;

import java.util.Scanner;

public class ViewInicial {
    Scanner read = new Scanner(System.in);
    ViewUsuario view = new ViewUsuario();
    String decisao;

    public void menuInicial () {

        do {
            System.out.println("-- MENU --\n");
            System.out.println("1. Cadastro de cliente");
            System.out.println("2. Cadastro de produto");
            System.out.println("0. Sair");
            System.out.println("-----------------------");
            System.out.print("Digite opção: ");
            decisao = read.nextLine();
            switch (decisao) {

                case "1":
                    view.menuUsuario();
                    break;

                case "2":
                    System.out.println("");
                    break;

                case "0":
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Por favor, digite uma opção válida");
                    break;
            }
        }while(decisao != "0");
    }
}
