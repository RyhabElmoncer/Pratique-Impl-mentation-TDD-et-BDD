package Spring.E_learningTest.Model;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private List<Cours> coursCompletes = new ArrayList<>();

    public void ajouterCours(Cours cours) {
        // Ajoute le cours à la liste
    }

    public void marquerCoursCommeComplete(Cours cours) {
        coursCompletes.add(cours);
    }

    public boolean aCompleteCours(Cours cours) {
        return coursCompletes.contains(cours);
    }
}


