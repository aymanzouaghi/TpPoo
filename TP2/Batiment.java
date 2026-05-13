package TP2;

/**
 * Classe représentant un bâtiment avec une adresse et une surface habitable.
 */
public class Batiment {

    /** L'adresse du bâtiment. */
    protected String adresse;

    /** La surface habitable du bâtiment en m². */
    private int surfaceHabitable;

    /**
     * Construit un bâtiment.
     * @param adresse l'adresse du bâtiment
     * @param surfaceHabitable la surface habitable en m²
     */
    public Batiment(String adresse, int surfaceHabitable) {
        this.adresse = adresse;
        this.surfaceHabitable = surfaceHabitable;
    }

    /**
     * Retourne une description du bâtiment.
     * @return une chaîne contenant l'adresse et la surface
     */
    @Override
    public String toString() {
        return "Adresse : " + adresse + " Surface Habitable : " + surfaceHabitable;
    }

    /**
     * Retourne la surface habitable.
     * @return la surface habitable en m²
     */
    public int getSurfaceHabitable() {
        return surfaceHabitable;
    }

    /**
     * Retourne la catégorie du bâtiment selon sa surface.
     * @return 1 si moins de 30m², 2 entre 30 et 70m², 3 au-delà
     */
    public int categorie() {
        return surfaceHabitable < 30 ? 1 : surfaceHabitable <= 70 ? 2 : 3;
    }

    /**
     * Compare ce bâtiment avec un autre et retourne le plus grand.
     * @param b le bâtiment à comparer
     * @return le bâtiment avec la plus grande surface
     */
    public Batiment comparer(Batiment b) {
        return b.surfaceHabitable > this.surfaceHabitable ? b : this;
    }
}