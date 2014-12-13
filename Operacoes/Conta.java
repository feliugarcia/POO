package Objeto;

import java.io.*;
import java.util.*;
import java.util.Vector;

public class Conta {

    private int id=0;
    private String Nome[] = new String[100];
    private String End[] = new String[100];
    private String Conta[] = new String[100];
    private Valor valor[] = new Valor[100];

    private Object ob;

    static String Tipos[] = {"poupanca","corrente"};

    Vector<String> v = new Vector<String>(100);
    
    public Conta() {

    }
    
    public void CreateAcount(String nome, String end, int tipo) {
	
	valor[id] = new Valor(id);

	ob = new Valor(id);
	
	this.Nome[id] = nome;
	this.End[id] = end;	

	/* Tipo eh uma variavel inteira porque define somente 
	 * dois tipos de contas (poupanca ou corrente
	 */
	this.Conta[id] = tipoContas(tipo);
	
	v.add(id,nome);
	
	System.out.println("Vector Size "+v.size());

	System.out.println("Account Value "+valor[id].getSaldo());
	
	//v.addElement(new Integer(1));
	this.id++;
    }

    protected int getID() {
	return this.id;
    }
    public String getNome(int Id) {
	return this.Nome[Id];
    }
    public String getEnd(int Id) {
	return this.End[Id];
    }
    public double getSaldo(int Id) {
	return this.valor[Id].getSaldo();
    }

    /*
     * Imprimir todas as contas
     */
    public void printAll() {
	for (int i=0; i< this.id ; i++) {
	    System.out.println("Contas registradas Nome "+Nome[i]);
	    System.out.println("Contas registradas Endereco "+End[i]);
	    System.out.println("Contas registradas Saldo "+getSaldo(i));
	}
    }
    
    /*
     * Metodo interno do objeto
     */
    private String tipoContas(int tipo) {
	return Tipos[tipo];
    }
    
    protected void Deposito(int Id, double v ) {
	this.valor[Id].Deposito(v);
    }
    
    protected String findName(String n) {
	int i=0;
	for (i = 0; i < this.id; i++) {
	    if (Nome[i].equals(n) )
		return Nome[i];
	}
	return null;
    }
    protected int findId(String n) {
	int i=0;
	for (i = 0; i < this.id; i++) {
	    if (Nome[i].equals(n) )
		return i;
	}
	return -1;
    }
    
}
