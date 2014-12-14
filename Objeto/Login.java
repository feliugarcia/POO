package Objeto;

import java.io.*;

public class Login implements Serializable {

    String[] login = new String[3];
    String[] senha = new String[3];
    char[] tipo = new char[3];

    public Login () {
	System.out.println("Login");
	login[1] = "Joao";
	senha[1] = "123";
	tipo[1] = 'F';
	login[2] = "Maria";
	senha[2] = "123";
	tipo[2] = 'C';
	System.out.println("Fim Login");
    }
    
    public char[] CreateLogin(String l, String s, char[] t) {
	return t;
    }

    public char getTipo(String _login, String _senha) {
	int id=0;
	
	id = checkUsers(_login,_senha);

	if (id != 0)
	    return this.tipo[id];
	else
	    return 'N';
    }

    public int checkUsers(String _login, String _senha) {
	int i=0;
	int idx = 2;

	for (i=1; i <= idx ; i++) {
	    if (this.login[i].equals(_login))
		if (this.senha[i].equals(_senha))
		    return i;
	}

	return 0;
    }
}
