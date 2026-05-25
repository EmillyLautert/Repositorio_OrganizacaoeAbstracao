void main() {
    for (int i = 1; i < 100; i++) { // ++ = incrementa, loop ativo enquanto a variável for menor que 100 (99 vezes)
        double raiz = Math.sqrt(i);
        IO.println("A raiz quadrada de " + i + " é: " + raiz);
    }

    for (int i = 100; i >= 1; i-=5) { // -= = decrementa, loop ativo enquanto a variável for maior que 1
        double raiz = Math.sqrt(i);
        IO.println("A raiz quadrada de " + i + " é: " + raiz);
    }
}