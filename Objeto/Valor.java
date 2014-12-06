package Objeto;

import java.io.*;
import java.util.*;
import java.util.Vector;

public class Valor extends Conta {
    
    private int id = 0;
    private double saldo = 0;

    protected Valor(int Id) {
	this.id = Id;
    }
    
    protected void Deposito(double valor) {
	this.saldo += valor;
    }

    protected void Saque(double valor) {
	this.saldo += valor;
    }

    protected double getSaldo() {
	return this.saldo;
    }
    protected int getId() {
	return this.id;
    }
    
    
}
