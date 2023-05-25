/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalhoed.models;

/**
 *
 * @author lucia
 */
public class Banco {

    private int numContas;
    private Conta[] contas;

    public Banco() {
    }

    public Banco(int numContas, Conta[] Contas) {
        this.numContas = numContas;
        this.contas = contas;
    }

    public void cadastroConta(int numeroConta, String nome, double saldo) {
        Conta novaConta = new Conta(numeroConta, nome, saldo);
        contas[numContas] = novaConta;
        numContas++;
        System.out.println("Conta cadastrada! ");
    }

    public void ordenarContasPorNumero() {
        for (int i = 0; i < numContas - 1; i++) {
            for (int j = 0; j < numContas - i - 1; j++) {
                if (contas[j].getId_conta()> contas[j + 1].getId_conta()) {
                    Conta temp = contas[j];
                    contas[j] = contas[j + 1];
                    contas[j + 1] = temp;
                }
            }
        }
        System.out.println("Contas ordenadas por número de conta:");
        exibirContas();
    }

}
