package Spring.E_learningTest.Model;
public class Cours {
    private String titre;

    public Cours(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cours)) return false;
        Cours cours = (Cours) o;
        return titre.equals(cours.titre);
    }

    @Override
    public int hashCode() {
        return titre.hashCode();
    }
}