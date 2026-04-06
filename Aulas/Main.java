void main() {
    Veiculo uno = new Veiculo(); // criada variável "uno" do tipo "Veículo" e instanciado novo objeto da classe "Veículo"
    uno.marca = "Fiat";
    uno.modelo = "Uno";
    uno.ano = 1994;
    uno.placa = "ABC-1234";

    Veiculo fusca; //declarada variável "fusca" do tipo "Veículo"
    fusca = new Veiculo(); //atribuida nova instancia da classe "Veículo" para variável "fusca"
    fusca.marca = "Volkswagen";
    fusca.modelo = "Fusca";
    fusca.ano = 1995;
    fusca.placa = "ABC-4321";
    // novo veículo só pode ser criado usando o new Veiculo()
    // quando reutilizado um veiculo já criado é feito um "atalho" e o que mudar em um reflete no outro
    uno.calculaTempoUso();
    fusca.calculaTempoUso();
}