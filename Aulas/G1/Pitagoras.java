void main() {
    double hipotenusa;
    double catetoAdjacente;
    double catetoOposto;

    String catetoAdjacenteStr = IO.readln("Digite o valor do cateto adjacente: ");
    String catetoOpostoStr = IO.readln("Digite o valor do cateto oposto: ");

    catetoAdjacente = Double.parseDouble(catetoAdjacenteStr);
    catetoOposto = Double.parseDouble(catetoOpostoStr);

    hipotenusa = Math.sqrt(catetoAdjacente * catetoAdjacente + catetoOposto * catetoOposto);
    // Math.sqrt faz raiz quadrada
    IO.println ("O valor da hipotenusa é: " + hipotenusa);
}