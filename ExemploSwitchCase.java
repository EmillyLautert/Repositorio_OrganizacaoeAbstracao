void main() {
    IO.println("Biblio SYS");
    
    // String menuLinha = "MENU\n1 - Cadastrar livro.\n2 - Listar livros.\n3 - Emprestar livro.\n4 - Devolver livro.\n0 - Sair."
    
    String menu = """
            MENU
            1 - Cadastrar livro.
            2 - Listar livros.
            3 - Emprestar livro.
            4 - Devolver livro.
            0 - Sair.
            """;
    IO.println(menu);
    String opcaoStr = IO.readln("Digite uma opção: ");
    int opcao = Integer.parseInt(opcaoStr);

    switch (opcao) {
        case 1: // dentro das cases pode ser inserida a lógica sem {chaves}
            IO.println("Cadastrando livro...");
            break;// break funciona para sair fora
        case 2:
            IO.println("Listando livros...");
            break;
        case 3:
            IO.println("Emprestando livro...");
            break;
        case 4:
            IO.println("Devolvendo livro...");
            break;
        case 0:
            IO.println("Saindo...");
            break;
        default: // é o mesmo que um else
            IO.println("Opção Inválida!");
            break;
    }

}