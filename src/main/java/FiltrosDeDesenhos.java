import java.util.ArrayList;
import java.util.List;

class FiltrosDeDesenhos {

    List<Desenho> filtra(List<Desenho> original, CriterioDeComparacaoDeDesenhos criterio) {
        List<Desenho> filtrados = new ArrayList<>();
        for (Desenho desenho : original) {
            if (criterio.atende(desenho)) {
                filtrados.add(desenho);
            }
        }
        return filtrados;
    }


}
