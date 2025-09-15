// Nome: Vitoria Mendes Rodrigues
// Unidade 2 - Atividade de Algoritmos e Estruturas de Dados
// Exercício 10: Ordenação de Produtos (Bubble Sort)

// Objetivo: Criar um programa que ordene uma lista de produtos com base nas vendas,
// de forma decrescente, mostrando os mais vendidos primeiro.

import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    int vendas;

    Produto(String nome, int vendas) {
        this.nome = nome;
        this.vendas = vendas;
    }
}

public class Atividade10OrdenacaoProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        System.out.println("🎯 Vamos criar sua lista de produtos com vendas!");
        System.out.println("Digite o nome do produto e a quantidade de vendas. Digite 'sair' para finalizar.");

        // Entrada de produtos e vendas
        while (true) {
            System.out.print("Produto: ");
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("sair")) break;

            System.out.print("Vendas: ");
            int vendas = Integer.parseInt(sc.nextLine());

            produtos.add(new Produto(nome, vendas));
            System.out.println("✔ Produto adicionado!");
        }

        // Ordenação usando Bubble Sort (decrescente por vendas)
        for (int i = 0; i < produtos.size() - 1; i++) {
            for (int j = 0; j < produtos.size() - 1 - i; j++) {
                if (produtos.get(j).vendas < produtos.get(j + 1).vendas) {
                    // Troca os produtos de posição
                    Produto temp = produtos.get(j);
                    produtos.set(j, produtos.get(j + 1));
                    produtos.set(j + 1, temp);
                }
            }
        }

        // Exibir lista ordenada
        System.out.println("\n✨ Lista de produtos ordenada por vendas (maior para menor):");
        for (Produto p : produtos) {
            System.out.println("- " + p.nome + ": " + p.vendas + " vendas");
        }

        System.out.println("\n🏆 Pronto! Sua lista de produtos foi ordenada com sucesso.");

        sc.close();
    }
}
