package modele;

public class Circuit {
    public int distanceTour;
    public int nombreTour;

    public Circuit(int distanceTour, int nombreTour) {
        this.distanceTour = distanceTour;
        this.nombreTour = nombreTour;
    }

    public int getDistanceTour() {
        return distanceTour;
    }

    public int getNombreTour() {
        return nombreTour;
    }
}
