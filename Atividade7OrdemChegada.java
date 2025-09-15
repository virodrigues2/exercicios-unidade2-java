// Nome: Vitoria Mendes Rodrigues
// Unidade 2 - Atividade de Algoritmos e Estruturas de Dados
// Exercício 7: Ordem de Chegada (Fila de Atendimento)

// Objetivo: Criar um programa que simule a ordem de chegada de clientes em uma loja,
// mostrando a ordem de saída, respeitando a fila de atendimento (FIFO).

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade7OrdemChegada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> filaClientes = new LinkedList<>();

        System.out.println("🎯 Vamos organizar a ordem de chegada dos clientes durante a promoção!");
        System.out.println("Escolha uma opção: adicionar cliente, atender cliente, mostrar fila, ou sair.");

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Atender cliente");
            System.out.println("3 - Mostrar fila");
            System.out.println("4 - Sair");
            System.out.print("Digite o número da opção desejada: ");

            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome do cliente: ");
                    String cliente = sc.nextLine();
                    filaClientes.add(cliente);
                    System.out.println("✔ Cliente adicionado à fila!");
                    break;
                case "2":
                    if (filaClientes.isEmpty()) {
                        System.out.println("⚠ A fila está vazia. Nenhum cliente para atender.");
                    } else {
                        String atendido = filaClientes.poll();
                        System.out.println("🎉 Cliente atendido: " + atendido);
                    }
                    break;
                case "3":
                    if (filaClientes.isEmpty()) {
                        System.out.println("⚠ A fila está vazia.");
                    } else {
                        System.out.println("✨ Clientes na fila (ordem de chegada):");
                        for (String c : filaClientes) {
                            System.out.println("- " + c);
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
