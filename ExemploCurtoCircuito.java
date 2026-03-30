void main() {
    IO.println ("Verificação da Divisão (Fator)");

    String xStr = IO.readln ("Digite o valor 01: ");
    String yStr = IO.readln ("Digite o valor 02: ");

    int x = Integer.parseInt(xStr);
    int y = Integer.parseInt(yStr);

    if (x != 0 && y % x == 0)
        IO.println("X é fator (divisor de Y");
    else
        IO.println("X não é fator (divisor) de Y");
}