package com.christianpari;

import dungeons_dragons.game_source.Calculator;
import dungeons_dragons.game_source.Die;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // there is no user sanitization at the moment, this is a simple working attack simulator
        Scanner scanner = new Scanner(System.in);
        var calc = new Calculator(new Die(20));
        System.out.print("What is the targets armor class?\nAC: ");
        int armorClass = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What is the targets defense modifier?\nDef_Mod: ");
        int defenseMod = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What is your attack modifier?\nAM: ");
        int attackMod = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What is your damage die?\nDie: ");
        String damageDie = scanner.nextLine();
        scanner.close();
        System.out.println(calc.attack(armorClass, defenseMod, attackMod, damageDie));
    }
}
