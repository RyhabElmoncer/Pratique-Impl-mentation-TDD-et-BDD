package Spring.E_learningTest.Test.Service;

import Spring.E_learningTest.Model.Cours;
import Spring.E_learningTest.Model.Utilisateur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
//Scénario : Inscription et Obtention de Certificat BDD
//
public class UtilisateurServiceTest {

    @Test
    public void testInscriptionEtObtentionCertificat() {
        // Étant donné que l'utilisateur est inscrit
        Utilisateur utilisateur = new Utilisateur();
        Cours cours = new Cours("Introduction à Java");
        utilisateur.ajouterCours(cours);

        // Quand il termine un cours
        utilisateur.marquerCoursCommeComplete(cours);

        // Alors il reçoit un certificat
        assertTrue(utilisateur.aCompleteCours(cours), "L'utilisateur doit avoir un certificat pour le cours terminé");
    }
}
