package project;

import java.io.Serializable;

public class AxeBehavior implements WeaponBehavior, Serializable {
    @Override
    public int useWeapon() {
        return 15;
    }

    @Override
    public String getName() {
        return "Axe";
    }
}

