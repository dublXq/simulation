import java.util.Objects;

public class Coordinates {
    public final Designation designation;
    public final Integer rank;
    public Coordinates(Designation designation, Integer rank) {
        this.designation = designation;
        this.rank = rank;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;

        if (designation != that.designation) return false;
        return rank.equals(that.rank);
    }
    @Override
    public int hashCode() {
        int result = designation.hashCode();
        result = 31 * result + rank.hashCode();
        return result;
    }
}
