package Bancos;

import javafx.beans.binding.ObjectExpression;

public class Banco {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Saulo", 254871, 8521325);
		
		Conta umaConta = new Conta(p);
		Conta outraConta = new Conta("João",254123, 25478452);
		Conta outraConta2 = new Conta("Maria",256987, 0212547);

		umaConta.depositar(100);
		outraConta.depositar(160);
		outraConta2.depositar(200);
		umaConta.depositar(50);
		umaConta.sacar(30);
		
		Pessoa titular1 = umaConta.obterTitular();
		Pessoa titular2 = outraConta.obterTitular();
		Pessoa titular3 = outraConta2.obterTitular();
		
		System.out.println("Nome: " + umaConta.obterTitular().obterNome()    + ", Rg: " + umaConta.obterTitular().obterNumeroRg() + ", CPF: " + umaConta.obterTitular().obterNumeroCpf() + ", Saldo: " + umaConta.obterSaldo());
		System.out.println("Nome: " + outraConta.obterTitular().obterNome()  + ", Rg: " + umaConta.obterTitular().obterNumeroRg() + ", CPF: " + umaConta.obterTitular().obterNumeroCpf() + ", Saldo: " + outraConta.obterSaldo());
		System.out.println("Nome: " + outraConta2.obterTitular().obterNome() + ", Rg: " + umaConta.obterTitular().obterNumeroRg() + ", CPF: " + umaConta.obterTitular().obterNumeroCpf() + ", Saldo: " + outraConta2.obterSaldo());
	}

}

