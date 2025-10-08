package com.mycompany.todolist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Tarefas {
    private final Scanner scan;
    private final List<String> tarefas = new ArrayList<>();

    public Tarefas(Scanner scan) {
        this.scan = scan;
    }
    
    public void adicionarTarefa() {
        boolean valido = false;
        
        while(!valido) {
            try {
                System.out.print("Quantas tarefas voce quer adicionar? -> ");
                int qtd = scan.nextInt();
                scan.nextLine();
                System.out.println();
                    
                for(int i = 1; i <= qtd; i++) {
                    System.out.print("Insira a tarefa numero " + (tarefas.size() + 1) + " -> ");
                    tarefas.add(scan.nextLine()); 
                }
            System.out.println("Tarefa(s) adicionada(s)!");   
            valido = true;   
            
            } catch (Exception e) {
                System.out.println("Insira um valor numerico!");
                System.out.println();
                scan.nextLine();
            } 
        }
    }
    
    public void listarTarefas() {
        if(tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada!");
        } else {
            System.out.println("-------Lista de Tarefas a Fazer------");
            for(int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + " - " + tarefas.get(i));  
            }
            System.out.println("-------------------------------------");
        }      
    }
    
    public void removerTarefa() {
        int numTarefa;
        boolean valido = false;
        
        if(tarefas.isEmpty()) {
            System.out.println("Nao ha tarefas para remover!");
            return;
        }else {
            listarTarefas();
        }
        while(!valido) {
            try {
                System.out.print("Insira o numero da tarefa que deseja remover: ");
                numTarefa = (scan.nextInt());
                scan.nextLine();
                if(numTarefa > 0 && numTarefa <= tarefas.size()){ 
                    System.out.println("Tarefa '" + tarefas.get(numTarefa - 1) + "' removida!");
                    tarefas.remove((numTarefa - 1));
                    valido = true;
                } else {
                    System.out.println("Tarefa nao existe!");
                    System.out.println();
                }  
            } catch (Exception e) {
                System.out.println("Insira um valor numerico!");
                System.out.println();
                scan.nextLine();     
            }
        }
    }
     
    
}