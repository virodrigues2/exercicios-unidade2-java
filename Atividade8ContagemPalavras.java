// Nome: Vitoria Mendes Rodrigues
// Unidade 2 - Atividade de Algoritmos e Estruturas de Dados
// Exercício 8: Contagem de Palavras (HashMap)

// Objetivo: Criar um programa que conte a frequência de cada palavra em uma frase,
// ajudando a identificar quais termos aparecem com maior frequência.

import java.util.HashMap;
import java.util.Scanner;

public class Atividade8ContagemPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎯 Vamos analisar uma frase e contar a frequência de cada palavra!");
        System.out.println("Digite a frase que deseja analisar:");

        String frase = sc.nextLine();

        // Separar palavras por espaço
        String[] palavras = frase.split("\\s+");

        // Criar HashMap para contar a frequência
        HashMap<String, Integer> frequencia = new HashMap<>();

        for (String palavra : palavras) {
            palavra = palavra.toLowerCase(); // normalizar para evitar duplicatas por maiúscula/minúscula
            if (frequencia.containsKey(palavra)) {
                frequencia.put(palavra, frequencia.get(palavra) + 1);
            } else {
                frequencia.put(palavra, 1);
            }
        }

        // Exibir resultados
        System.out.println("\n✨ Frequência das palavras:");
        for (String p : frequencia.keySet()) {
            System.out.println("- " + p + ": " + frequencia.get(p));
        }

        System.out.println("\n🏆 Pronto! Agora você sabe quantas vezes cada palavra apareceu na frase.");

        sc.close();
    }
}
