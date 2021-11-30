import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Desenho> desenhos = Desenhos.lista();

        FiltrosDeDesenhos filtro = new FiltrosDeDesenhos();

        // lambda
        List<Desenho> desenhosAntesDe60 = filtro.filtra(desenhos, desenho -> desenho.getDecadaDeCriacao() <= 1960);

        // lambda
        List<Desenho> desenhosIniciadosComS = filtro.filtra(desenhos, desenho -> desenho.getNome().startsWith("S"));

        for (Desenho desenho : desenhosAntesDe60) {
            System.out.println(desenho);
        }

    }

}
