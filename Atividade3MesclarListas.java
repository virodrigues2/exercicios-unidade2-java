// Nome: Vitoria Mendes Rodrigues
// Unidade 2 - Atividade de Algoritmos e Estruturas de Dados
// Exercício 3: Mesclar Listas (ArrayList)

// Objetivo: Criar um programa que mescle duas listas de convidados intercalando os elementos,
// gerando uma nova lista organizada e pronta para uso.

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade3MesclarListas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        System.out.println("🎯 Vamos criar a primeira lista de convidados. Digite os nomes e pressione Enter.");
        System.out.println("Quando terminar, digite 'sair'.");

        // Entrada de dados da primeira lista
        while (true) {
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("sair")) break;
            lista1.add(nome);
            System.out.println("✔ Nome adicionado à Lista 1! Continue ou digite 'sair' para finalizar.");
        }

        System.out.println("\n🎯 Agora, vamos criar a segunda lista de convidados. Digite os nomes e pressione Enter.");
        System.out.println("Quando terminar, digite 'sair'.");

        // Entrada de dados da segunda lista
        while (true) {
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("sair")) break;
            lista2.add(nome);
            System.out.println("✔ Nome adicionado à Lista 2! Continue ou digite 'sair' para finalizar.");
        }

        // Mesclar listas intercalando os elementos
        ArrayList<String> listaMesclada = new ArrayList<>();
        int tamanhoMax = Math.max(lista1.size(), lista2.size());
        for (int i = 0; i < tamanhoMax; i++) {
            if (i < lista1.size()) listaMesclada.add(lista1.get(i));
            if (i < lista2.size()) listaMesclada.add(lista2.get(i));
        }

        // Exibir resultados
        System.out.println("\n✨ Lista 1:");
        for (String nome : lista1) System.out.println("- " + nome);

        System.out.println("\n✨ Lista 2:");
        for (String nome : lista2) System.out.println("- " + nome);

        System.out.println("\n🔄 Lista Mesclada (intercalada):");
        for (String nome : listaMesclada) System.out.println("- " + nome);

        System.out.println("\n🏆 Pronto! As listas foram mescladas com sucesso. Bom trabalho!");

        sc.close();
    }
}
