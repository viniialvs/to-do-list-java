package com.mycompany.todolist;
import java.util.Scanner;

public class Todolist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Tarefas tarefas = new Tarefas(scan);

        String opcao;
        do {
            System.out.println();
            Menu.mostrarMenu();
            opcao = scan.nextLine();
            System.out.println();
            
            switch(opcao) {
                case "1" -> tarefas.adicionarTarefa();
                case "2" -> tarefas.listarTarefas();
                case "3" -> tarefas.removerTarefa();
                case "0" -> System.out.println("Saindo...");
                default -> System.out.println("Opcao Invalida!");
            }
        } while(!opcao.equals("0"));
    }
}