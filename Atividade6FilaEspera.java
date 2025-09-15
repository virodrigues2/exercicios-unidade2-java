// Nome: Vitoria Mendes Rodrigues
// Unidade 2 - Atividade de Algoritmos e Estruturas de Dados
// Exercício 6: Sistema de Fila de Espera (Queue)

// Objetivo: Criar um programa que simule uma fila de espera, permitindo adicionar,
// remover e exibir a ordem de atendimento dos pacientes, ajudando na organização.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade6FilaEspera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        System.out.println("🎯 Bem-vindo ao sistema de fila de espera da clínica!");
        System.out.println("Escolha uma opção: adicionar paciente, atender paciente, mostrar fila, ou sair.");

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1 - Adicionar paciente");
            System.out.println("2 - Atender paciente");
            System.out.println("3 - Mostrar fila");
            System.out.println("4 - Sair");
            System.out.print("Digite o número da opção desejada: ");

            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome do paciente: ");
                    String paciente = sc.nextLine();
                    fila.add(paciente);
                    System.out.println("✔ Paciente adicionado à fila!");
                    break;
                case "2":
                    if (fila.isEmpty()) {
                        System.out.println("⚠ A fila está vazia. Nenhum paciente para atender.");
                    } else {
                        String atendido = fila.poll();
                        System.out.println("🎉 Paciente atendido: " + atendido);
                    }
                    break;
                case "3":
                    if (fila.isEmpty()) {
                        System.out.println("⚠ A fila está vazia.");
                    } else {
                        System.out.println("✨ Pacientes na fila:");
                        for (String p : fila) {
                            System.out.println("- " + p);
                        }
                    }
                    break;
                case "4":
                    System.out.println("🏆 Saindo do sistema. Até logo!");
                    sc.close();
                    return;
                default:
                    System.out.println("⚠ Opção inválida! Digite 1, 2, 3 ou 4.");
            }
        }
    }
}
