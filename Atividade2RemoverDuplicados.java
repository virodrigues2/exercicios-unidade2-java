// Nome: Vitoria Mendes Rodrigues
// Unidade 2 - Atividade de Algoritmos e Estruturas de Dados
// Exercício 2: Remoção de Elementos Duplicados (ArrayList)

// Objetivo: Criar um programa que remova elementos duplicados de uma lista de usuários,
// mantendo apenas uma entrada por pessoa, ajudando a organizar melhor os dados.

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2RemoverDuplicados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> usuarios = new ArrayList<>();

        System.out.println("🎯 Vamos criar sua lista de usuários! Digite cada nome e pressione Enter.");
        System.out.println("Quando terminar, digite 'sair'.");

        // Entrada de dados do usuário
        while (true) {
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break; // encerra quando o usuário digita "sair"
            }

            usuarios.add(nome); // adiciona nome à lista
            System.out.println("✔ Usuário adicionado! Continue digitando ou digite 'sair' para finalizar.");
        }

        System.out.println("\n✨ Lista original de usuários:");
        for (String u : usuarios) {
            System.out.println("- " + u);
        }

        // Remover duplicados manualmente
        ArrayList<String> listaSemDuplicados = new ArrayList<>();
        for (String u : usuarios) {
            if (!listaSemDuplicados.contains(u)) {
                listaSemDuplicados.add(u);
            }
        }

        System.out.println("\n🔄 Lista sem duplicados:");
        for (String u : listaSemDuplicados) {
            System.out.println("- " + u);
        }

        System.out.println("\n🏆 Pronto! Agora sua lista de usuários está organizada e sem duplicatas.");

        sc.close();
    }
}
