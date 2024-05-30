import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SacchettoTombola {
    private List<Integer> numeri;

    public SacchettoTombola() {
        numeri = new ArrayList<>();
        for (int i = 1; i <= 90; i++) {
            numeri.add(i);
        }
        Collections.shuffle(numeri);
    }

    public String estraiNumero() {
        if (numeri.isEmpty()) {
            return "Non ci sono più numeri nel sacchetto.";
        }
        return String.valueOf(numeri.remove(numeri.size() - 1));
    }
}