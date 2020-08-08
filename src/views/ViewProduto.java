package views;

import data.metodoProduto;
import entities.Produto;

import java.util.Scanner;

public class ViewProduto {
    Scanner read = new Scanner(System.in);
    metodoProduto metodo = new metodoProduto();



    public void menuProduto () {
        String decisao;


        System.out.println("\n-- [Produto] --");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Buscar");
        System.out.println("3 - Alterar");
        System.out.println("4 - Deletar");
        System.out.println("-----------------------");
        System.out.print("[Digite opção] ");
        decisao = read.nextLine();
        switch (decisao) {

            case "1":
                System.out.println("-- [Cadastrar produto] --\n");
                System.out.print("ID: ");
                int idProduto = read.nextInt();
                System.out.print("Nome: ");
                String nome = read.next();
                System.out.print("Preço: R$");
                float preco = read.nextFloat();
                Produto pr1 = new Produto(idProduto, nome, preco);
                metodo.cadastraProduto(pr1);
                break;
            case "2":
                System.out.println("-- [Buscar produto] --\n");
                metodo.buscaProduto();
                break;
            case "3":
                System.out.println("-- [Alterar produto] --\n");
                System.out.print("ID: ");
                idProduto = read.nextInt();
                System.out.print("Nome: ");
                nome = read.next();
                System.out.print("Preço: R$");
                preco = read.nextFloat();
                Produto pr2 = new Produto(idProduto, nome, preco);
                metodo.alteraProduto(pr2);
                break;
            case "4":
                System.out.println("-- [Deletar produto] --\n");
                System.out.print("ID: ");
                idProduto = read.nextInt();
                metodo.deletaProduto(idProduto);
                break;
            default:
                System.out.println("\nPor favor, digite opção válida\n");
                break;
        }
    }
}
