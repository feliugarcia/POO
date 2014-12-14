package Objeto;

import java.io.*;
import java.lang.*;

public class Agencia {
    
    private int id=0;
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    private char[] op;

    public Agencia() {
		
	try {
	    System.out.println("Escolha a opcao");
	    System.out.println("F - Para cadastro de funcionario");
	    System.out.println("C - Para cadastro de conta bancaria");
	    System.out.println("A - Para cadastro de agencia");
	    System.out.println("U - Para cadastro de Cliente Usuario");

	    op = (in.readLine()).toCharArray();

	    switch(op[0]) {

	    case 'F': System.out.println("Cadastro de funcionario"); break;
	    case 'C': System.out.println("Cadastro de Conta bancaria"); break;
	    case 'A': System.out.println("Cadastro de Agencia"); break;
	    case 'U': System.out.println("Cadastro de Cliente usuario"); break;
	    default : System.out.println("Opcao nao disponivel"); break;
	    }
	} catch(Exception e) {
	    System.out.println( e );
	}
    }

}
