package Bancos;

public class Pessoa {

	private String nome;
	private int rg;
	private int cpf;
	
	public Pessoa(String nomeInf, int rgInf, int cpfInfo){
		nome = nomeInf;
		rg = rgInf;
		cpf = cpfInfo;
	}
	
	public String obterNome(){
		return nome;
	}
	
	public int obterNumeroRg(){
		return rg;
	}
	
	public int obterNumeroCpf(){
		return cpf;
	}
}
