void main() {
    IO.println("CALCULADORA DE IMC");

    String nome = IO.readln("Digite seu nome: ");
    char genero = IO.readln("Informe seu gênero (M: masculino, F: feminino, N: prefio não informar): ").charAt(0);
    String alturaStr = IO.readln ("Digite sua altura: ");
    String pesoStr = IO.readln("Digite seu peso: ");

    Double altura = Double.parseDouble(alturaStr);
    Double peso = Double.parseDouble(pesoStr);

    Double IMC = (peso / (altura*altura));

    String classificacao = "";

switch (genero) {
        case 'M':
            if (IMC < 20)
                classificacao = "Abaixo do peso";
            else if (IMC <= 24.9)
                classificacao = "Normal";
            else if (IMC <= 29.9)
                classificacao = "Obesidade leve";
            else if (IMC <= 39.9)
                classificacao = "Obesidade moderada";
            else
                classificacao = "Obesidade Mórbida";
            break;
        
        case 'F', 'N':
            if (IMC < 19)
                classificacao = "Abaixo do peso";
            else if (IMC <= 23.9)
                classificacao = "Normal";
            else if (IMC <= 28.9)
                classificacao = "Obesidade leve";
            else if (IMC <= 38.9)
                classificacao = "Obesidade moderada";
            else
                classificacao = "Obesidade Mórbida";
            break;

        default:
            IO.println("Opção Inválida!");
            break;
}
    IO.println ("Nome: " + nome);
    IO.println ("Gênero:" + genero);
    IO.println ("IMC:" + IMC);
    IO.println ("Classificação:" + classificacao);
}