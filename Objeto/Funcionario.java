package Objeto;

import java.io.*;
import java.util.*;

public class Funcionario extends FuncionarioData {
    
    //vector<Object> v = new Vector<Object>; 

    Vector v = new Vector();
    Vector vv = new Vector();
    FuncionarioData f = new FuncionarioData();
    
    public Funcionario() {
	
    }
    
    protected void createFuncionario(Agencia ag) {
	System.out.println("Entre com o nome do funcionario");
	
	if (ag.checkAgencia("A"))
	    System.out.println("Agencia eh"+ag.getAgencia("A"));
	else
	    System.out.println("Agencia nao existe");
	
	vv.addElement(new FuncionarioData("Joao","Rua C","1234",ag.getAgencia("Nome")));
	
	System.out.println("Tamanho do vetor "+v.size());
    }

    protected void createFuncionario(Agencia ag, String nome) {
	System.out.println("Entre com o nome do funcionario");
	v.add(new String(nome));
	System.out.println("Tamanho do vetor "+v.size());
    }

    protected void listFuncionarios() {
	int i=0;
	for (i=0; i<v.size(); i++)
	    System.out.println("List do vetor "+v.get(i));
    }

    protected void listElementFuncionarios() {
	int i=0;
	Enumeration en = this.vv.elements();
	while(en.hasMoreElements()) {
	    System.out.println("Elementos do vetor "+ en.nextElement() );
	}
    }
    
    
}
