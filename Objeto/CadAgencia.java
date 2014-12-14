package Objeto;

import java.io.*;
import java.lang.*;

public class CadAgencia {

    private int idx=0;
    private Integer[] num = new Integer[100];
    private String[] Nome = new String[100];
    private String[] End = new String[100];
    
    protected void createAgencia(String n, String e) {
	this.id++;
	this.nome[i] = n;
	this.end[i] = e;
    }

    public boolean checkAgencia (String _nome) {
	int i=0;
	for (i=1; i< idx; i++)
	    if (this.nome[i].equals(_nome)) 
		return true;
	
	return false;
    }

    public String getAgencia(String _nome) {
	int i=0;
	for (i=1; i< idx; i++)
	    if (this.nome[i].equals(_nome)) 
		return this.nome;

	return "Essa agencia nao esta cadastrada";
    }


}
