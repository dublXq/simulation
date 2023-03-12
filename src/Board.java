import java.util.HashMap;

public class Board {
    HashMap<Coordinates, Personage> personages = new HashMap<>();

    public void addPersonage(Coordinates coordinates, Personage personage) {
        personage.coordinates = coordinates;
        personages.put(coordinates, personage);
    }

}
