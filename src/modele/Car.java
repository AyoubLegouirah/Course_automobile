package modele;

public class Car  {
    private String marque;
    private String modele;
    private int vitMin;
    private int vitMax;
    private int tempsTotal;

    public Car(String marque, String modele, int vitMin, int vitMax, int tempsTotal) {
        this.marque = marque;
        this.modele = modele;
        this.vitMin = vitMin;
        this.vitMax = vitMax;
        this.tempsTotal = tempsTotal;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getVitMin() {
        return vitMin;
    }

    public int getVitMax() {
        return vitMax;
    }

    public int getTempsTotal() {
        return tempsTotal;
    }

    // Calculer les temps au tour :
    // Pour chaque voiture, vous devez calculer le temps qu'elle met pour compléter un tour.
    // Ce temps dépend de la distance du tour et de la vitesse de la voiture,
    // qui sera déterminée aléatoirement entre sa vitesse minimale et maximale.

    public void vitAleatoire() {
        int vitAleatoire = (int) (Math.random() * (vitMax - vitMin) + 1) + vitMin;
    }

    public void tempsTour() {
        int distanceTour = 0; // exemple de distance du tour
        // int tempsTour = distanceTour / vitAleatoire;

    }



}
