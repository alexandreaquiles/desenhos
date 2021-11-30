import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Filtro<T> {

    List<T> filtra(List<T> original, Predicate<T> criterio) {
        List<T> filtrados = new ArrayList<>();
        for (T t : original) {
            if (criterio.test(t)) {
                filtrados.add(t);
            }
        }
        return filtrados;
    }


}
