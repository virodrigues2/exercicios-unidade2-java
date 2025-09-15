// Nome: Vitoria Mendes Rodrigues
// Unidade 2 - Atividade de Algoritmos e Estruturas de Dados
// Exercício 5: Inversão de Lista usando Pilha (ArrayList e Stack)

// Objetivo: Criar um programa que inverta a ordem de uma lista de produtos
// utilizando uma pilha, mostrando a lista do fim para o começo.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Atividade5InversaoComPilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();
        Stack<String> pilha = new Stack<>();

        System.out.println("🎯 Vamos criar sua lista de produtos! Digite cada produto e pressione Enter.");
        System.out.println("Quando terminar, digite 'sair'.");

        // Entrada de produtos
        while (true) {
            String produto = sc.nextLine();
            if (produto.equalsIgnoreCase("sair")) break;
            produtos.add(produto);
            System.out.println("✔ Produto adicionado! Continue ou digite 'sair' para finalizar.");
        }

        // Exibe lista original
        System.out.println("\n✨ Lista de produtos na ordem original:");
        for (String p : produtos) System.out.println("- " + p);

        // Empilha os produtos para inverter a ordem
        for (String p : produtos) {
            pilha.push(p);
        }

        // Exibe lista invertida
        System.out.println("\n🔄 Lista de produtos invertida (usando pilha):");
        while (!pilha.isEmpty()) {
            System.out.println("- " + pilha.pop());
        }

        System.out.println("\n🏆 Pronto! Sua lista de produtos foi invertida com sucesso.");

        sc.close();
    }
}
