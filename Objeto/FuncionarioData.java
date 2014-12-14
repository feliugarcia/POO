package Objeto;

import java.io.*;

public class FuncionarioData {
    
    String Matricula;
    String Nome;
    String End;
    String Ag;

    public FuncionarioData() {}
    public FuncionarioData(String m,String n,String e,String a) {
	this.Matricula = m;
	this.Nome = n;
	this.End = e;
	this.Ag = a;
    }

    private String getMatricula() {
	return this.Matricula;
    }
    
    
}
