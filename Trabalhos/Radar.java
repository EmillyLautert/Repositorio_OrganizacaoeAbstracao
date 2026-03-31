void main() {
    double velocidadeMáxima;
    double velocidadeVeiculo;

    String velocidadeMáximaStr = IO.readln("Digite a velocidade máxima da via (km/h): ");
    String velocidadeVeiculoStr = IO.readln("Digite a velocidade do veículo (km/h): ");

    velocidadeMáxima = Double.parseDouble(velocidadeMáximaStr);
    velocidadeVeiculo = Double.parseDouble(velocidadeVeiculoStr);

    double velocidadeMedia = velocidadeMáxima * 1.2;

    if (velocidadeVeiculo <= velocidadeMáxima)
        IO.println("Sem Infração");

    else if (velocidadeVeiculo <= velocidadeMedia)
        IO.println("Infração Média");

    else
        IO.println("Infração Grave");
}