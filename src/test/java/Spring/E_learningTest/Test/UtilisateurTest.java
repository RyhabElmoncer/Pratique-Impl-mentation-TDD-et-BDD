package Spring.E_learningTest.Test;
import Spring.E_learningTest.Model.Cours;
import Spring.E_learningTest.Model.Utilisateur;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilisateurTest {

    @Test
    public void testCoursComplete() {
        Utilisateur utilisateur = new Utilisateur();
        Cours cours = new Cours("Introduction à Java");
        utilisateur.ajouterCours(cours);
        utilisateur.marquerCoursCommeComplete(cours);
        assertTrue(utilisateur.aCompleteCours(cours));
    }
}

