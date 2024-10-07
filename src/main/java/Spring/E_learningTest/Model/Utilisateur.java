package Spring.E_learningTest.Model;

import java.util.ArrayList;
import java.util.List;
public class Utilisateur {
    private List<Cours> coursCompletes = new ArrayList<>();

    public void ajouterCours(Cours cours) {
        coursCompletes.add(cours);
    }

    public void marquerCoursCommeComplete(Cours cours) {
        if (!coursCompletes.contains(cours)) {
            coursCompletes.add(cours);
        }
    }

    public boolean aCompleteCours(Cours cours) {
        return coursCompletes.contains(cours);
    }
}


