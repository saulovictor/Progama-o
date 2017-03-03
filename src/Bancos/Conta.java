package Bancos;

public class Conta {
	
	private Pessoa titular;
	private double saldo;

	public Conta(Pessoa titularInf){
		titular = titularInf;
		
		saldo = 0;
		
	}
	
	public Conta(String nome, int rg, int cpf){
		titular = new Pessoa (nome, rg, cpf);
		saldo = 0;
	}
	
	public Pessoa obterTitular(){
		return titular;
	}
	
	public double obterSaldo(){
		return saldo;
	}
	
	
	public void depositar(double valor){
		saldo = saldo + valor;
	}
	
	public void sacar(double valor){
		saldo = saldo - valor;
	}
}
