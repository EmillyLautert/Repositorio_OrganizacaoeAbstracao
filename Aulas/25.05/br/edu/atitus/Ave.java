package br.edu.atitus;

public class Ave extends Animal{
    private String corPenas;

    public Ave(String nome, Integer idade, String corPenas) {
        super(nome, "Ave", idade);
        this.corPenas = corPenas;
    }
 
    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }
}
