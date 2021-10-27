package project;

import java.io.Serializable;

public class BowAndArrowBehavior implements WeaponBehavior, Serializable {
    @Override
    public int useWeapon() {
        return 3;
    }

    @Override
    public String getName() {
        return "Bow and Arrow";
    }
}
