package model;

public class ContaBancaria {
	private String 	cpf;
	private int 	numero;
	private int 	dv;
	private double saldo;
	
	public ContaBancaria(String cpf, int numero, int dv) {
		this.cpf = cpf;
		this.numero = numero;
		this.dv = dv;
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if (valor > saldo) {
			return false;
		}
		else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public boolean transferir(double valor, ContaBancaria outra) {
		if (saldo >= valor) {
			this.debitar(valor);
			outra.creditar(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getDv() {
		return dv;
	}
	public void setDv(int dv) {
		this.dv = dv;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String exibirInfo() {
		return ("Conta: "+numero+"-"+dv+" CPF: "+cpf+" Saldo R$ "+saldo);
	}
	
	
}
