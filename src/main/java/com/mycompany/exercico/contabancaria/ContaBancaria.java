
package com.mycompany.exercico.contabancaria;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    private String titular;
    
    ContaBancaria(int numero,double saldo,String  nome){
        this.numeroDaConta = numero;
        this.saldo = saldo;
        this.titular = nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void Depositar(double valor){
        this.saldo += valor;
    }
    
    public void Sacar(double valor){
        this.saldo -= valor;
    }
    
    public void Exibir(){
        System.out.println("Saldo Atual: R$ " + this.saldo);
    }
  
}
