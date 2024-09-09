package modele;

import java.util.ArrayList;

public class Circuit {
    private int distanceTour;
    private int nombreTour;
    private ArrayList<Car> cars;

    public Circuit(int distanceTour, int nombreTour) {
        this.distanceTour = distanceTour;
        this.nombreTour = nombreTour;
        this.cars = new ArrayList<>();
    }

    public int getDistanceTour() {
        return distanceTour;
    }

    public int getNombreTour() {
        return nombreTour;
    }

    public void ajouterCar(Car car) {
        cars.add(car);
    }

    public void lancerCourse() {
        for (Car voiture : cars) {
            for (int i = 0; i < nombreTour; i++) {
                voiture.tempsTour(distanceTour);
            }
        }
    }

    public void trouverGagnant() {
        Car gagnant = cars.get(0);
        for (Car voiture : cars) {
            if (voiture.getTempsTotal() < gagnant.getTempsTotal()) {
                gagnant = voiture;
            }
        }
        System.out.println("La voiture gagnante est " + gagnant.getModele() + " de " + gagnant.getMarque() + " avec un temps total de " + gagnant.getTempsTotal() + " secondes.");
    }


}
