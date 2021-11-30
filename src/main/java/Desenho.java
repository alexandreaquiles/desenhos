class Desenho {

    private final String nome;
    private final int decadaDeCriacao;

    public Desenho(String nome, int decadaDeCriacao) {
        this.nome = nome;
        this.decadaDeCriacao = decadaDeCriacao;
    }

    public String getNome() {
        return nome;
    }

    public int getDecadaDeCriacao() {
        return decadaDeCriacao;
    }

    public String toString() {
        return nome + " (" + decadaDeCriacao + ")";
    }

}