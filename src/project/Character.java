package project;

public abstract class Character {
    WeaponBehavior weapon;
    String name;
    int hp;

    public Character(String name, WeaponBehavior w, int hp) {
        this.name = name;
        this.weapon = w;
        this.hp = hp;
    }

    public void setWeapon(WeaponBehavior w){
        this.weapon = w;
    }

    public abstract int fight(Character rival);
}
