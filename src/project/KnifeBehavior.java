package project;

import java.io.Serializable;

public class KnifeBehavior implements WeaponBehavior, Serializable{
    @Override
    public int useWeapon() {
        return 5;
    }

    @Override
    public String getName() {
        return "Knife";
    }
}
