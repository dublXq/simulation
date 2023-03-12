import java.util.HashMap;

public class Map {
    HashMap<Coordinates, Personage> personages = new HashMap<>();
    public void addPersonage(Coordinates coordinates, Personage personage) {
        personage.coordinates = coordinates;
        personages.put(coordinates, personage);
    }
    public void removePersonage(Coordinates coordinates, Personage personage) {
        personage.coordinates = coordinates;
        personages.remove(coordinates, personage);
    }
}
