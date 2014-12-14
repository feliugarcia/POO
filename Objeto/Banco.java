package Objeto;

import java.io.*;
import java.lang.*;

public class Banco {
    
    public static void main(String[] args) {
	
	Login log = new Login();
	String login;
	String senha;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	try {
	    System.out.println("Entre com o login");
	    login = in.readLine();
	    System.out.println("Entre com e a senha");
	    senha = in.readLine();
	    
	    System.out.println("Conta do tipo: "+log.getTipo(login,senha));

	    switch(log.getTipo(login,senha)) {
	    case 'F': {
		System.out.println("Funcionario");
		Agencia ag = new Agencia();
		break;
	    }
	    case 'C': { System.out.println("Cliente"); break; }
	    default: System.out.println("Este usuario nao conta em nosso banco de dados");
	    }

	} catch(Exception e) {
	    System.out.println( e );
	}
	
    }
    
}
