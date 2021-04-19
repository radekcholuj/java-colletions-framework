package pl.radekcholuj.battleship;

import java.util.Objects;

public class Shoot {

    private String x;
    private String y;

    public Shoot(String x, String y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "|" + x + y + "|";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shoot shoot = (Shoot) o;
        return Objects.equals(x, shoot.x) && Objects.equals(y, shoot.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

