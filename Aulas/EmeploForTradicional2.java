void main() {
		IO.println("Pressione 'S' para SAIR.");
/* Variável de controle "i" com o valor 1 (um)
A cada loop haverá o incremento de "+ 1" (mais um) na variável de controle "i"
Na condição do For definimos que será solicitado uma entrada via Teclado do tipo String, desse retorno estrairemos o caracter contido no índice 0 dessa String (charAt(0))
O loop ficará ativo enquanto esse caracter extraído for diferente de 'S', observe que o Java é Case-Sensitive */
        
		for (int i = 1; IO.readln().charAt(0) != 'S'; i++) {
			IO.println("Já passou "+ i + " vezes");
       	}

        for (int i = 1; !IO.readln().equals("S"); i++) { // com ! = diferente de S, sem ! = S
            IO.println("Já passou "+ i + " vezes");
        }
}