package views;

import data.metodoUsuario;
import entities.Usuario;

import java.util.Scanner;

public class ViewUsuario {
    Scanner read = new Scanner(System.in);
    metodoUsuario metodo = new metodoUsuario();


    public void menuUsuario () {
        String decisao;


        System.out.println("-- [Usuário] --\n");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Buscar usuários");
        System.out.println("3 - Alterar usuário");
        System.out.println("4 - Deletar usuário");
        System.out.println("-----------------------");
        System.out.print("[Digite opção] ");
        decisao = read.nextLine();
        switch (decisao) {

            case "1":
                System.out.println("-- Cadastrar usuário --\n");
                System.out.print("ID: ");
                int idUsuario = read.nextInt();
                System.out.print("Nome: ");
                String nome = read.next();
                System.out.print("Email: ");
                String email = read.next();
                Usuario us1 = new Usuario(idUsuario, nome, email);
                metodo.cadastraUsuario(us1);
                System.out.println(us1);
                break;
            case "2":
                System.out.println("-- Buscar usuários --\n");
                metodo.buscaUsuario();
                break;
            case "3":
                System.out.println("-- Alterar usuário --\n");
                System.out.print("ID: ");
                idUsuario = read.nextInt();
                System.out.print("Nome: ");
                nome = read.next();
                System.out.print("Email: ");
                email = read.next();
                Usuario us2 = new Usuario(idUsuario, nome, email);
                metodo.alteraUsuario(us2);
                System.out.println(us2);
                break;
            case "4":
                System.out.println("-- Deletar usuário --\n");
                System.out.print("ID: ");
                int id = read.nextInt();
                metodo.deletaUsuario(id);
                break;
            default:
                System.out.println("Por favor, digite uma opção válida");
                break;
        }
    }
}
