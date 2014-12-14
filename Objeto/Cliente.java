package Objeto;

import java.io.*;
import java.lang.*;

public class Cliente {
    
    private int id=0;
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    private char[] op;

    public Cliente() {
		
	try {
	    System.out.println("Escolha a opcao");
	    System.out.println("S - Para Saque");
	    System.out.println("D - Para Deposito");
	    System.out.println("C - Para consulta de saldo");
	    System.out.println("P - Para consulta de saldo poupanca");

	    op = (in.readLine()).toCharArray();

	    switch(op[0]) {

	    case 'S': System.out.println("Saque"); break;
	    case 'D': System.out.println("Deposito"); break;
	    case 'C': System.out.println("Saldo conta corrente"); break;
	    case 'P': System.out.println("Saldo conta poupanca"); break;
	    default : System.out.println("Opcao nao disponivel"); break;
	    }
	} catch(Exception e) {
	    System.out.println( e );
	}
    }

}
