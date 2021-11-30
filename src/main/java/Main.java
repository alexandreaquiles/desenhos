import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Desenho> desenhos = Desenhos.lista();

        FiltrosDeDesenhos filtro = new FiltrosDeDesenhos();

        // classe anônima Main$1.class
        List<Desenho> desenhosAntesDe60 = filtro.filtra(desenhos, new CriterioDeComparacaoDeDesenhos() {
            @Override
            public boolean atende(Desenho desenho) {
                return desenho.getDecadaDeCriacao() <= 1960;
            }
        });

        // classe anônima Main$2.class
        List<Desenho> desenhosIniciadosComS = filtro.filtra(desenhos, new CriterioDeComparacaoDeDesenhos() {
            @Override
            public boolean atende(Desenho desenho) {
                return desenho.getNome().startsWith("S");
            }
        });

        for (Desenho desenho : desenhosIniciadosComS) {
            System.out.println(desenho);
        }

    }

}
