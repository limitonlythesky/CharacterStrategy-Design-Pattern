package project;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public int useWeapon() {
        return 12;
    }

    @Override
    public String getName() {
        return "Sword";
    }
}
