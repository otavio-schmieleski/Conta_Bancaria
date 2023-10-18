package com.mycompany.exercico.contabancaria;

public class ExercicoContaBancaria {

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1234,100,"OTAVIO");
        c1.Exibir();
        c1.Depositar(500);
        c1.Sacar(230);
        c1.Exibir();
    }
}
