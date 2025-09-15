// Nome: Vitoria Mendes Rodrigues
// Unidade 2 - Atividade de Algoritmos e Estruturas de Dados
// Exercício 4: Verificação de Expressões (Pilhas)

// Objetivo: Criar um programa que verifique se os parênteses em uma expressão matemática
// estão balanceados, ajudando a detectar erros antes de cálculos.

import java.util.Scanner;
import java.util.Stack;

public class Atividade4VerificacaoExpressoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();

        System.out.println("🎯 Vamos verificar se os parênteses da sua expressão estão corretos!");
        System.out.println("Digite a expressão matemática:");

        String expressao = sc.nextLine();

        boolean balanceada = true;

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (c == '(') {
                pilha.push(c); // adiciona parêntese de abertura à pilha
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    balanceada = false; // encontrou fechamento sem abertura
                    break;
                } else {
                    pilha.pop(); // remove parêntese de abertura correspondente
                }
            }
        }

        // Se a pilha não estiver vazia no final, tem parênteses sobrando
        if (!pilha.isEmpty()) balanceada = false;

        // Resultado para o usuário
        if (balanceada) {
            System.out.println("✔ Parabéns! Sua expressão está balanceada e pronta para cálculo.");
        } else {
            System.out.println("⚠ Atenção! Sua expressão não está balanceada. Verifique os parênteses.");
        }

        sc.close();
    }
}
