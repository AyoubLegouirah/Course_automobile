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
        this.tempsTotal = 0;
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

    public int vitAleatoire() {
        int vitAleatoire = (int) (Math.random() * (vitMax - vitMin) + 1) + vitMin;
        return vitAleatoire;
    }

    public void tempsTour(int distanceTour) {
        int vitesse = vitAleatoire();
        int temps = (distanceTour/vitesse) * 3600;
        this.tempsTotal = tempsTotal + temps;
    }



}
