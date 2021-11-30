import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Desenho> desenhos = Desenhos.lista();

        // stream
        List<Desenho> desenhosAntesDe60 = desenhos.stream()
                .filter(desenho -> desenho.getDecadaDeCriacao() <= 1960)
                .toList();

        // stream
        List<Desenho> desenhosIniciadosComS = desenhos.stream()
                .filter(desenho -> desenho.getNome().startsWith("S"))
                .toList();

        for (Desenho desenho : desenhosAntesDe60) {
            System.out.println(desenho);
        }

    }

}
