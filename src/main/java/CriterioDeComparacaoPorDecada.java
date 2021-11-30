class CriterioDeComparacaoPorDecada implements  CriterioDeComparacaoDeDesenhos {
    @Override
    public boolean atende(Desenho desenho) {
        return desenho.getDecadaDeCriacao() <= 1960;
    }
}
