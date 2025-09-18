/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simuladoratm;
import java.util.Scanner;
/**
 *
 * @author sidne
 */


public class SimuladorATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00; 
        int opcao = 0;
        // Neste bloco serão perguntados o tipo de atendimento que o usuário deseja
        try { 
            do {
                try { 
                    System.out.println("\n=== BANCO DIGITAL - ATENDIMENTO ==="); 
                    System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo)); // exibição do saldo
                    System.out.println("\nEscolha uma opção:"); // usuário deve escolher uma das opções abaixo
                    System.out.println("1 - Consultar saldo");// opção 1
                    System.out.println("2 - Sacar dinheiro");// opção 2
                    System.out.println("3 - Depositar dinheiro");// opção 3
                    System.out.println("4 - Encerrar atendimento");// opção 4
                    System.out.print("Digite sua opção: "); // aqui será a entrada para o armazenamento da opção escolhida
                    
                    opcao = scanner.nextInt(); 
                    
                    //A partir desse bloco, inicia-se o switch case
                    switch (opcao) { 
                        case 1:// opção 1
                            System.out.println("\n=== CONSULTA DE SALDO ===");
                            System.out.println("Seu saldo atual é: R$ " + String.format("%.2f", saldo));
                            break;
                            
                        case 2:// opção 2
                            System.out.print("\n=== SAQUE ===");
                            System.out.print("\nDigite o valor para saque: R$ ");
                            double valorSaque = scanner.nextDouble();
                            
                            if (valorSaque <= 0) {// se o valor do saque foi menor ou igual a zero, será exibido uma mensagem de erro
                                System.out.println("ERRO: Valor deve ser maior que zero!");
                            } else if (valorSaque > saldo) {// então se o valor do saque for maior que o saldo, será exibido uma mensagem de saldo insuficiente
                                System.out.println("ERRO: Saldo insuficiente!");
                                System.out.println("Saldo disponível: R$ " + String.format("%.2f", saldo));// e exibirá o valor do saldo disponível
                            } else { // então :
                                saldo -= valorSaque; // saldo = saldo - valorSaque
                                //será exibido uma mensagem que o saque foi realizado com sucesso, informando o valor do saque e seu novo saldo
                                System.out.println("Saque realizado com sucesso!");
                                System.out.println("Valor sacado: R$ " + String.format("%.2f", valorSaque));
                                System.out.println("Novo saldo: R$ " + String.format("%.2f", saldo));
                            }
                            break;
                            
                        case 3:// opção 3
                            System.out.print("\n=== DEPÓSITO ===");
                            System.out.print("\nDigite o valor para depósito: R$ ");
                            double valorDeposito = scanner.nextDouble();
                            
                            if (valorDeposito <= 0) {// se o valor do depósito for menor ou igual a zero, será exibido uma mensagem de erro
                                System.out.println("ERRO: Valor deve ser maior que zero!");
                            } else { // então:
                                saldo += valorDeposito; // saldo = saldo + valorDeposito
                                //será exibido uma mensagem que o depósito foi realizado com sucesso, informando o valor depoisitado e o novo saldo
                                System.out.println("Depósito realizado com sucesso!");
                                System.out.println("Valor depositado: R$ " + String.format("%.2f", valorDeposito));
                                System.out.println("Novo saldo: R$ " + String.format("%.2f", saldo));
                            }
                            break;
                            
                        case 4:// opção 4
                            //Se a opção 4 for escolhida, será exibido uma mensagem encerrando o atendimento
                            System.out.println("\n=== ENCERRANDO ATENDIMENTO ===");
                            System.out.println("Obrigado por usar nossos serviços!");
                            break;
                            
                        default:
                            // se nenhum dos casos for escolhido, será exibido uma mensagem de erro
                            System.out.println("\nERRO: Operação não existe!");
                            System.out.println("Escolha uma opção válida (1-4).");
                            break;
                    }
                    
                } catch (Exception e) { //nesse caso, o catch funcionará para tratar algum erro
                    System.out.println("\nERRO: Digite apenas números válidos!");// mensagem de erro
                    scanner.nextLine(); // Limpar buffer
                    opcao = 0; // Continua o loop
                }
                
                if (opcao != 4 && opcao != 0) { 
                // se a opção for diferente de 4 ou diferente de zero, será necessário clicar na tecla ENTER para retornar ao início
                    System.out.println("\nPressione Enter para continuar...");
                    scanner.nextLine(); // Limpar buffer
                    scanner.nextLine(); // Aguardar Enter
                }
                
            } while (opcao != 4); // esse ciclo se repetirá até que o usuário escolha a opção 4 para encerrar a sessão
            
        } catch (Exception e) {
            System.out.println("\nERRO crítico: " + e.getMessage());
            
        } 
        finally { 
        // e por fim, será exibido uma mensagem de que o sistema foi finalizado
            System.out.println("\nSistema bancário finalizado.");
            System.out.println("Saldo final: R$ " + String.format("%.2f", saldo));
            scanner.close();//fecha o scanner
        }
    }
}