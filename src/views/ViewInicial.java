package views;

import java.util.Scanner;

public class ViewInicial {
    Scanner read = new Scanner(System.in);
    ViewUsuario usuario = new ViewUsuario();
    ViewProduto produto = new ViewProduto();
    String decisao;

    public void menuInicial () {

        do {
            System.out.println("\n-- [MENU] --");
            System.out.println("1. Cadastro de cliente");
            System.out.println("2. Cadastro de produto");
            System.out.println("0. Sair");
            System.out.println("-----------------------");
            System.out.print("Digite opção: ");
            decisao = read.next();
            switch (decisao) {
                case "1":
                    usuario.menuUsuario();
                    break;
                case "2":
                    produto.menuProduto();
                    break;
                case "0":
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("\nPor favor, digite opção válida\n");
                    break;
            }
        }while(decisao != "0");
        return;
    }
}
