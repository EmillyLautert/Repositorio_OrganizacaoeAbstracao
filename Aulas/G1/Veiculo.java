import java.time.LocalDate;

class Veiculo {
    String marca;
    String modelo;
    int ano;
    String placa;

    void calculaTempoUso() { //void não tem retorno
        int anoAtual = LocalDate.now().getYear();
        int tempoUso = anoAtual - this.ano;
        IO.println("Tempo de uso: " + tempoUso);
    }
}