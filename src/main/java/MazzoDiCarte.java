import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MazzoDiCarte {
    private List<String> mazzo;

    public MazzoDiCarte() {
        String[] valori = {"Asso", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Regina", "Re"};
        String[] semi = {"Cuori", "Quadri", "Fiori", "Picche"};
        mazzo = new ArrayList<>();

        for (String valore : valori) {
            for (String seme : semi) {
                mazzo.add(valore + " di " + seme);
            }
        }

        Collections.shuffle(mazzo);
    }

    public String distribuisciCarta() {
        if (mazzo.isEmpty()) {
            return "Non ci sono più carte nel mazzo.";
        }
        return mazzo.remove(mazzo.size() - 1);
    }
}