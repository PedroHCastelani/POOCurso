package Banco;

import Banco.Agencia.Agencia;
import Banco.Clientes.Clientes;
import Banco.Conta.Corrente.ContaCorrente;
import Banco.Conta.Poupanca.ContaPoupanca;

import java.util.Scanner;

public class BancoMain {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Clientes clientes = new Clientes();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        Agencia agencia = new Agencia();

        clientes.setNome("Pedro");
        clientes.setCPF("111.222.333-85");
        clientes.setEndereco("aaa", "123", "bbbb");


        System.out.println("==========================");
        System.out.println("    " + agencia.getNome() + "     ");
        System.out.println("==========================");
        System.out.println("Agencia: " + agencia.getNumeroAgencia());
        System.out.println("Nome Cliente: " + clientes.getNome());
        System.out.println("CPF: " + clientes.getCPF());
        System.out.println("Endereco: " + clientes.getEndereco());



    }
}
