void main() {
    double g1;
    double g2;
    IO.println("Bem-vindo!"); //print
    String g1Str = IO.readln("Digite sua nota G1: "); //input
    String g2Str = IO.readln("Digite sua nota G2: "); //input
    g1 = Double.parseDouble(g1Str); //converte str para double
    g2 = Double.parseDouble(g2Str); //converte str para double
    double media = (g1 + g2) / 2; //calcula média
    IO.println ("Sua média é: " + media); //print da média
    
    if (media >= 7)
        IO.println("PARABÉNS! Você foi aprovado");
    else if (media >= 3) //elif - usar chaves para duas linhas de print no if
            {IO.println("Não foi dessa vez! Você está em exame");
            IO.println ("Para ser aprovado é necessário tirar: " + (10 - media));}
    else
        IO.println("Nos vemos no semestre que vem!");
}