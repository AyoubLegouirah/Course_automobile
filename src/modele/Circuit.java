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

    public void addCar(Car car) {
        cars.add(car);
    }

    public void simulateCars(){

    }


}
