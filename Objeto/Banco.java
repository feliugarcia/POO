package Objeto;

import java.io.*;

public class Banco {


    public static void main(String[] args) {
	
	System.out.println("System");

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

    }

}
