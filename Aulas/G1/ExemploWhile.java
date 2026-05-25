void main() {

/*Neste exemplo a execução permanece em loop enquanto a variável opcao contiver o valor 'S'

        char opcao = 'S';
        while (opcao == 'S') {
            IO.println("Digite 'S' se deseja permanecer aqui?");
            opcao = IO.readln().charAt(0);
        } */
        
        char opcao;
        do {
            IO.println("Digite 'S' se deseja permanecer aqui?");
            opcao = IO.readln().charAt(0);
        } while (opcao == 'S');
}