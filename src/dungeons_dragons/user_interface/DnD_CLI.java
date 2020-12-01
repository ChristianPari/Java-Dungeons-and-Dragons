package dungeons_dragons.user_interface;

import console.Console;
import dungeons_dragons.simulator_source.character.Character;

import java.util.Arrays;
import java.util.List;

public class DnD_CLI {
  public static void welcome() {
    System.out.println("Welcome to the 'Dungeons and Dragons Attack Simulator v2'!");
    System.out.println("You will begin by creating the characters, an attacker and an enemy.");
    System.out.println("The simulator will then run and respond back with whether or not the attacker landed" +
        "their attack and how much damage was inflicted unto the enemy.\n");
  }

  public static List<Character> createSimulation() {
    System.out.println("Please create 2 Characters to have in the simulator...");
    System.out.println("\nFirst, create the attacker...");
    Character attacker = createCharacter();
    System.out.println("\nNext, create the enemy...");
    Character enemy = createCharacter();
    List<Character> characters = Arrays.asList(attacker, enemy);
    return characters;
  }

  private static Character createCharacter() {
    String armorType = Console.getString(
        "Armor Type? [none, leather, chain, plate]",
        "Armor: "
    );
    String weaponType = Console.getString(
        "Weapon Type? [simple melee, simple ranged, martial melee, martial ranged]",
        "Weapon: "
    );
    int attackModifier = Console.getInteger(
        "What is your attack modifier?",
        "Attack Mod: ",
        0,
        10
    );
    int defenseModifier = Console.getInteger(
        "What is your defense modifier?",
        "Defense Mod: ",
        0,
        10
    );

    return new Character(armorType, weaponType, attackModifier, defenseModifier);
  }
}
