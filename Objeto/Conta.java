package Objeto;

import java.io.*;

public class Conta {

    private int id=0;
    private String Nome;
    private String End;
    private String Conta;
    static String Tipos[] = {"poupanca","corrente"};
    
    public Conta() {

    }
    
    public void CreateAcount(String nome, String end, int tipo) {
	this.id++;
	this.Nome = nome;
	this.End = end;	
	/* Tipo eh uma variavel inteira porque define somente 
	 * dois tipos de contas (poupanca ou corrente
	 */
	this.Conta = tipoContas(tipo);
    }

    protected int getID() {
	return this.id;
    }
    public String getNome() {
	return this.Nome;
    }
    public String getEnd() {
	return this.End;
    }

    /*
    public void printAll() {
	for (int i=0; i< this.id ; i++) {
	    System.out.println("Contas registradas Nome"+Nome[i]);
	    System.out.println("Contas registradas Nome"+End[i]);
	}
	}*/

    private String tipoContas(int tipo) {
	return Tipos[tipo];
    }

    /*
    public String getCount(int i) {
	return this.Contas[i];
	}*/

}
