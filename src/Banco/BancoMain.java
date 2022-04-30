package Banco;

import Banco.Agencia.Agencia;
import Banco.Cliente.Cliente;
import Banco.Conta.Conta;
import Banco.Conta.Corrente.ContaCorrente;
import Banco.Conta.Poupanca.ContaPoupanca;

import java.util.Scanner;

public class BancoMain {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        Cliente clientes = new Cliente();
        Conta conta = new Conta();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        Agencia agencia = new Agencia();

        System.out.println("==========================");
        System.out.println("    " + agencia.getNome() + "     ");
        System.out.println("==========================");
        System.out.println("Agencia: " + agencia.getNumeroAgencia());
        System.out.println("Conta: " + conta.retornaNumero());
        System.out.println("Cliente: " + clientes.retornaNome());
        System.out.println("CPF: " + clientes.retornaCpf());
        System.out.println("Endereco: " + clientes.retornaEndereco());
        System.out.println("\nSALDO: R$" + conta.retornarSaldo());
    }
}
