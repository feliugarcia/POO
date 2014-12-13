package Objeto;

import java.io.*;

public class Banco {
    
    public static void main(String[] args) {
	
	int i = 0;
	System.out.println("System");

	Agencia ag = new Agencia();

	
	Soma s = new Soma();
	
	System.out.println("Resultado Soma = "+s.getResultado());
	System.out.println(" Op1 = "+ s.getOp1());
	
	Soma ss = new Soma(-9,18);
	
	System.out.println("Resultado Soma = "+ss.getResultado());
	System.out.println(" Op1 = "+ ss.getOp1());
	System.out.println(" Op2 = "+ ss.op2);
	
	Subtracao sb = new Subtracao(-9,18);
	
	System.out.println("Resultado Subtracao = "+sb.getResultado());
	System.out.println(" Op1 = "+ sb.getOp2());
	
	Conta c = new Conta();
	
	for (i = 0; i <= 9; i++) {
	    c.CreateAcount("Maria"+i,"Rua",1);
	    
	    System.out.println("Contas cadastradas "+c.getNome(i));
	}

	c.Deposito(1,9999.90);
	System.out.println("Conta de "+c.getNome(1)+ "; Saldo " + 
			   c.getSaldo(1));
	
	c.printAll();

	System.out.println("Account name= "+c.findName("Maria4"));

    }
    
}
