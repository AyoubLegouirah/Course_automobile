package game;

import modele.Car;
import modele.Circuit;

public class Game {
    public void StarGame(){
        Circuit circuit = new Circuit(6,4 );

        Car voiture1 = new Car("Ferrari", "F1", 150, 250, 10);
        Car voiture2 = new Car("Porsche", "911", 190, 290, 10);


        circuit.ajouterCar(voiture1);
        circuit.ajouterCar(voiture2);

        circuit.lancerCourse();
        circuit.trouverGagnant();
    }
}
