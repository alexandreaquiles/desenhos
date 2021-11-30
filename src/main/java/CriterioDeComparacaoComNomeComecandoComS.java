class CriterioDeComparacaoComNomeComecandoComS implements  CriterioDeComparacaoDeDesenhos{
    @Override
    public boolean atende(Desenho desenho) {
        return desenho.getNome().startsWith("S");
    }
}
