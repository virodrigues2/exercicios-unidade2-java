// Nome: Vitoria Mendes Rodrigues
// Unidade 2 - Atividade de Algoritmos e Estruturas de Dados
// Exercício 9: Mesclar Mapas (HashMap)

// Objetivo: Criar um programa que mescle dois mapas de produtos, tratando possíveis conflitos de chaves,
// gerando um mapa unificado com todos os produtos.

import java.util.HashMap;
import java.util.Scanner;

public class Atividade9MesclarMapas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> mapa1 = new HashMap<>();
        HashMap<String, Integer> mapa2 = new HashMap<>();

        System.out.println("🎯 Vamos criar o primeiro mapa de produtos!");
        System.out.println("Digite o nome do produto e a quantidade. Digite 'sair' para finalizar.");

        // Entrada do primeiro mapa
        while (true) {
            System.out.print("Produto: ");
            String produto = sc.nextLine();
            if (produto.equalsIgnoreCase("sair")) break;

            System.out.print("Quantidade: ");
            int quantidade = Integer.parseInt(sc.nextLine());

            mapa1.put(produto, quantidade);
            System.out.println("✔ Produto adicionado ao Mapa 1!");
        }

        System.out.println("\n🎯 Agora, vamos criar o segundo mapa de produtos!");
        System.out.println("Digite o nome do produto e a quantidade. Digite 'sair' para finalizar.");

        // Entrada do segundo mapa
        while (true) {
            System.out.print("Produto: ");
            String produto = sc.nextLine();
            if (produto.equalsIgnoreCase("sair")) break;

            System.out.print("Quantidade: ");
            int quantidade = Integer.parseInt(sc.nextLine());

            mapa2.put(produto, quantidade);
            System.out.println("✔ Produto adicionado ao Mapa 2!");
        }

        // Mesclar mapas
        HashMap<String, Integer> mapaMesclado = new HashMap<>(mapa1);
        for (String produto : mapa2.keySet()) {
            // Se já existir, somar as quantidades
            mapaMesclado.put(produto, mapaMesclado.getOrDefault(produto, 0) + mapa2.get(produto));
        }

        // Exibir resultados
        System.out.println("\n✨ Mapa Mesclado de Produtos:");
        for (String produto : mapaMesclado.keySet()) {
            System.out.println("- " + produto + ": " + mapaMesclado.get(produto));
        }

        System.out.println("\n🏆 Pronto! Os mapas foram mesclados com sucesso.");

        sc.close();
    }
}
