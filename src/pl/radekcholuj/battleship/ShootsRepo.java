package pl.radekcholuj.battleship;

import java.util.HashSet;
import java.util.Set;

public class ShootsRepo {
    Set<Shoot> shoots = new HashSet<>();

    public void add(Shoot shoot) {
        if (shoots.contains(shoot)) {
            System.out.println("You cannot shoot same place twice!");
        } else {
            shoots.add(shoot);
        }
    }

    @Override
    public String toString() {
        return "ShootsRepo{" +
                "shoots=" + shoots +
                '}';
    }
}

