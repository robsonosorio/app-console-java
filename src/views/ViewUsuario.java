package views;

import data.metodoUsuario;
import entities.Usuario;

import java.util.Scanner;

public class ViewUsuario {
    Scanner read = new Scanner(System.in);
    metodoUsuario metodo = new metodoUsuario();



    public void menuUsuario () {
        String decisao;


        System.out.println("\n-- [Usuário] --");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Buscar");
        System.out.println("3 - Alterar");
        System.out.println("4 - Deletar");
        System.out.println("-----------------------");
        System.out.print("[Digite opção] ");
        decisao = read.next();
        switch (decisao) {

            case "1":
                System.out.println("-- [Cadastrar usuário] --\n");
                System.out.print("ID: ");
                int idUsuario = read.nextInt();
                System.out.print("Nome: ");
                String nome = read.next();
                System.out.print("Email: ");
                String email = read.next();
                Usuario us1 = new Usuario(idUsuario, nome, email);
                metodo.cadastraUsuario(us1);
                break;
            case "2":
                System.out.println("-- [Buscar usuários] --\n");
                metodo.buscaUsuario();
                break;
            case "3":
                System.out.println("-- [Alterar usuário] --\n");
                System.out.print("ID: ");
                idUsuario = read.nextInt();
                System.out.print("Nome: ");
                nome = read.next();
                System.out.print("Email: ");
                email = read.next();
                Usuario us2 = new Usuario(idUsuario, nome, email);
                metodo.alteraUsuario(us2);
                break;
            case "4":
                System.out.println("-- [Deletar usuário] --\n");
                System.out.print("ID: ");
                idUsuario = read.nextInt();
                metodo.deletaUsuario(idUsuario);
                break;
            default:
                System.out.println("\nPor favor, digite opção válida\n");
                break;
        }
    }
}
