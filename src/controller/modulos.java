package controller;

public class modulos {
	public modulos() {
		super();
	}

	public static String binario(int x){
	    if (x == 0) {
	    	return "0"; // condição de parada é qaundo for 0 já que em binário é 0
	    } else if (x == 1) {
	    	return "1"; // condição de parada é quando for um já que em binário é 1
	    } else {
	    	// vai pegar o x dividir por 2 e ir pegando os restos a cada divisão até atingir a condição
	    	String bin = binario(x/2); 
	    	int resto = x % 2;
	    	return bin + String.valueOf(resto);
	    }
	}
}
