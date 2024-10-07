package Spring.E_learningTest.Test.Model;

import Spring.E_learningTest.Model.Cours;
import Spring.E_learningTest.Model.Utilisateur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
//TDD
public class UtilisateurTest {
    @Test
    public void testCoursComplete() {
        Utilisateur utilisateur = new Utilisateur();
        Cours cours = new Cours("Introduction à Java");
        utilisateur.ajouterCours(cours);
        utilisateur.marquerCoursCommeComplete(cours);
        assertTrue(utilisateur.aCompleteCours(cours), "Le cours doit être marqué comme complet");
    }
}