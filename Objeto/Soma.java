package Objeto;

import java.io.*;

public class Soma {

    public int resultado=0;
    
    private int op1;
    protected int op2;

    public Soma() {
	op1 = 9;
	op2 = -18;
	resultado = op1 + op2;
    }
    
    public Soma(int OP1,int OP2) {
	resultado = OP1 + OP2;
    }

    int getOp1() {
	return this.op1;
    }
    int getOp2() {
	return this.op2;
    }

    void setOp1(int OP) {
	this.op1 = OP;
    }
    
    void setOp2(int OP) {
	this.op2 = OP;
    }
    
    int getResultado() {
	return this.resultado;
    }


}
