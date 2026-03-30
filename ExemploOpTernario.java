void main() {
    String numStr = IO.readln("Digite um número: ");
    int num = Integer.parseInt (numStr);

    String resultado = (num % 2 == 0) ? "Par" : "Impar";

    IO.println("O número digitado é: " + resultado);
}