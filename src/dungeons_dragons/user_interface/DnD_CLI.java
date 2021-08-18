package dungeons_dragons.user_interface;

import console.Console;
import dungeons_dragons.simulator_source.character.BaseCharacter;
import dungeons_dragons.simulator_source.character.Character;
import dungeons_dragons.simulator_source.character.abilities.armor.ArmorTypes;
import dungeons_dragons.simulator_source.character.abilities.weapon.WeaponTypes;

import java.util.Arrays;
import java.util.List;

public class DnD_CLI {
  public static void welcome() {
    System.out.println("Welcome to the 'Dungeons and Dragons Attack Simulator v2'!");
    System.out.println("You will begin by creating the characters: 'attacker' and 'enemy'");
    System.out.println("The simulator will then run and respond back with whether or not the attacker landed their attack and how much damage was inflicted onto the enemy.\n");
  }

  public static List<Character> createSimulation() {
    System.out.println("Please create 2 Characters to have in the simulator...");
    System.out.println("\nFirst, create the attacker...");
    Character attacker = createCharacter();
    System.out.println("\nNext, create the enemy...");
    Character enemy = createCharacter();
    return Arrays.asList(attacker, enemy);
  }

  private static Character createCharacter() {
    String armorType;
    while (true) {
      armorType = Console.getString(
          "Armor Type? [none, leather, chain, plate]",
          "Armor: "
      );
      boolean armorCheck = checkResponse("armor", armorType);
      if (armorCheck)
        break;
    }

    String weaponType;
    while (true) {
      weaponType = Console.getString(
          "Weapon Type? [simple melee, simple ranged, martial melee, martial ranged]",
          "Weapon: "
      );
      boolean weaponCheck = checkResponse("weapon", weaponType);
      if (weaponCheck)
        break;
    }

    int attackModifier = Console.getInteger(
        "What is your attack modifier?",
        "Attack Mod: "
    );
    int defenseModifier = Console.getInteger(
        "What is your defense modifier?",
        "Defense Mod: "
    );

    return new BaseCharacter(armorType, weaponType, attackModifier, defenseModifier);
  }

  private static boolean checkResponse(
      String type,
      String response
  ) {
    boolean checker = false;

    switch (type) {
      case "armor":
        if (new ArmorTypes().getArmorTypes().containsKey(response))
          checker = true;
        break;

      case "weapon":
        if (new WeaponTypes().getWeaponTypes().containsKey(response))
          checker = true;
        break;
    }

    return checker;
  }

}
