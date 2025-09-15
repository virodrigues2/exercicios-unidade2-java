// Nome: Vitoria Mendes Rodrigues
// Unidade 2 - Atividade de Algoritmos e Estruturas de Dados
// Exercício 1: Inversão de Lista (ArrayList)

// Objetivo: Criar um programa que inverta os elementos de uma lista de tarefas
// sem usar métodos prontos da linguagem, permitindo ver a lista do fim para o começo.

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1InversaoLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando a lista de tarefas
        ArrayList<String> tarefas = new ArrayList<>();

        System.out.println("Digite suas tarefas (digite 'sair' para encerrar):");

        // Entrada de dados do usuário
        while (true) {
            String tarefa = sc.nextLine();

            if (tarefa.equalsIgnoreCase("sair")) {
                break; // finaliza quando o usuário digita "sair"
            }

            tarefas.add(tarefa); // adiciona tarefa na lista
        }

        System.out.println("\nTarefas na ordem original:");
        for (String t : tarefas) {
            System.out.println("- " + t);
        }

        // Inversão manual da lista (sem usar métodos prontos tipo Collections.reverse)
        System.out.println("\nTarefas em ordem inversa:");
        for (int i = tarefas.size() - 1; i >= 0; i--) {
            System.out.println("- " + tarefas.get(i));
        }

        sc.close();
    }
}
