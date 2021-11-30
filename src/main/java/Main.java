import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Desenho> desenhos = Desenhos.lista();

        FiltrosDeDesenhos filtro = new FiltrosDeDesenhos();

        // List<Desenho> desenhosAntesDe60 = filtro.filtra(desenhos, new CriterioDeComparacaoPorDecada());

        List<Desenho> desenhosIniciadosComS = filtro.filtra(desenhos, new CriterioDeComparacaoComNomeComecandoComS());

        for (Desenho desenho : desenhosIniciadosComS) {
            System.out.println(desenho);
        }

    }

}
