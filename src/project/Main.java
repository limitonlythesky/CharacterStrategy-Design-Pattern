package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WeaponBehavior w1 = new KnifeBehavior();
        WeaponBehavior w2 = new AxeBehavior();
        WeaponBehavior w3 = new SwordBehavior();
        WeaponBehavior w4 = new BowAndArrowBehavior();

        ArrayList <Character> characters = new ArrayList<>();

        while(true){
            System.out.println("PRESS [1] TO ADD CHARACTER\n" +
                    "PRESS [2] TO START THE FIGHT\n" +
                    "PRESS [3] TO SWITCH WEAPON\n" +
                    "PRESS [0] TO EXIT"
            );
            int choice = in.nextInt();
            if(choice == 1){
                System.out.println("Choose the CHARACTER:\n" +
                        "[1] King\n" +
                        "[2] Queen\n" +
                        "[3] Knight\n" +
                        "[4] Troll"
                        );
                int choice2 = in.nextInt();
                System.out.println("Insert name: ");
                String name = in.next();
                System.out.println("Choose weapon\n" +
                        "[1] Knife\n" +
                        "[2] Axe\n" +
                        "[3] Sword\n" +
                        "[4] Bow and Arrow"
                        );
                WeaponBehavior w = null;
                int choice1 = in.nextInt();
                switch(choice1){
                    case 1: w = w1;
                        break;
                    case 2: w = w2;
                        break;
                    case 3: w = w3;
                        break;
                    case 4: w = w4;
                        break;
                }
                System.out.println("Insert amount of Health Points");
                int hp = in.nextInt();
                switch (choice2) {
                    case 1:
                        characters.add(new King(name, w, hp));
                        break;
                    case 2:
                        characters.add(new Queen(name, w, hp));
                        break;
                    case 3:
                        characters.add(new Knight(name, w, hp));
                        break;
                    case 4:
                        characters.add(new Troll(name, w, hp));
                        break;
                }
            }else if(choice == 2){
                System.out.println("Choose two Characters for fight: (by their numbers)");
                int i = 1;
                for(Character c: characters){
                    System.out.println(i + " " + c.name);
                    i++;
                }
                int first = in.nextInt(), second = in.nextInt();
                int result = characters.get(first - 1).fight(characters.get(second - 1));
                if(result == 1){
                    characters.remove(second - 1);
                }else{
                    characters.remove(first - 1);
                }
            }else if(choice == 3){
                System.out.println("Choose one Character to switch weapon: (by it's number)");
                int i = 1;
                for(Character c: characters){
                    System.out.println(i + " " + c.name + " " + c.weapon.getName());
                    i++;
                }
                int first = in.nextInt();
                System.out.println("Choose weapon\n" +
                        "[1] Knife\n" +
                        "[2] Axe\n" +
                        "[3] Sword\n" +
                        "[4] Bow and Arrow"
                );
                WeaponBehavior w = null;
                int choice1 = in.nextInt();
                switch(choice1){
                    case 1: w = w1;
                        break;
                    case 2: w = w2;
                        break;
                    case 3: w = w3;
                        break;
                    case 4: w = w4;
                        break;
                }
                characters.get(first - 1).setWeapon(w);
            }else{
                break;
            }
        }
    }
}
