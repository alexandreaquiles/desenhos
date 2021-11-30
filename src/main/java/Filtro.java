import java.util.ArrayList;
import java.util.List;

class Filtro<T> {

    List<T> filtra(List<T> original, CriterioDeComparacao<T> criterio) {
        List<T> filtrados = new ArrayList<>();
        for (T t : original) {
            if (criterio.atende(t)) {
                filtrados.add(t);
            }
        }
        return filtrados;
    }


}
