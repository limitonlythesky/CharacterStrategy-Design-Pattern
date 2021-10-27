package project;

import java.io.Serializable;

public class Troll extends Character{
    public Troll(String name, WeaponBehavior w, int hp) {
        super(name, w, hp);
    }

    public int fight(Character rival){
        while(rival.hp > 0 && this.hp > 0){
            rival.hp -= this.weapon.useWeapon();
            this.hp -= rival.weapon.useWeapon();
        }
        System.out.println(rival.name + " vs. " + this.name);
        int cnt = 0;
        if(rival.hp > this.hp){
            System.out.print(rival.name);
            cnt = 1;
        }else{
            System.out.print(this.name);
            cnt = 2;
        }
        System.out.println(" win this fight");
        return cnt;
    }
}
