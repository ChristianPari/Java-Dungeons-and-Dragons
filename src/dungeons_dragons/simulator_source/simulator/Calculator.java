package dungeons_dragons.simulator_source.simulator;

import dungeons_dragons.simulator_source.character.Character;
import dungeons_dragons.simulator_source.character.Die;

public class Calculator {
  // variables
  private static final int CRITICAL_HIT = 20;
  private static final int CRITICAL_MISS = 1;
  private static final Die d20 = new Die(20);

  // methods
  public static int attack(
      Character attacker,
      Character enemy
  ) {
    return attackCalculator(
        attacker.getWeapon().getDamageDice(),
        attacker.getAttackModifier(),
        enemy.getArmorClass(),
        enemy.getDefenseModifier()
    );
  }

  private static int attackCalculator(
      String damageDice,
      int attackModifier,
      int armorClass,
      int defenseModifier
  ) {
    // attackModifier and damageDice are relative to the CHARACTER attacking
    // armorClass and defenseModifier are relative to the TARGET
    String outputMsg = "";
    int rollValue = rollD20();
    int damage = 0;

    if (rollValue == CRITICAL_MISS) {

      outputMsg = "Critical Miss!" +
          "\nDungeon Master: Half of the Players damage could be delt upon themselves!";
      int selfDamage = calculateDamage("standard", damageDice) / 2;
      outputMsg += "\nDamage: " + selfDamage;
      System.out.println(outputMsg);
      return damage;

    } else if (rollValue == CRITICAL_HIT) {

      damage = calculateDamage("critical", damageDice);
      outputMsg = "Critical Hit! " + damage + " Damage Delt";
      System.out.println(outputMsg);
      return damage;

    }

    rollValue += attackModifier;
    int targetsDefense = armorClass + defenseModifier;
    System.out.println("Total roll value: " + rollValue + " vs Enemys' Defense: " + targetsDefense);

    if (rollValue > targetsDefense) {
      damage = calculateDamage("standard", damageDice);
      outputMsg = "Hit " + damage + " damage delt";
    } else {
      outputMsg = "Miss 0 Damage";
    }

    System.out.println("\n" + outputMsg);
    return damage;
  }

  private static int rollD20() {
    d20.roll();
    int rollValue = d20.getValue();
    System.out.println("\nAttackers' d20 rolled: " + rollValue);
    return rollValue;
  }

  private static int calculateDamage(
      String type,
      String damageDie
  ) {
    String[] damageDieInfo = damageDie.split("d");
    int rollCount = type.equals("critical") ? 2 : 1;

    int dieCount = damageDieInfo[0].equals("") ?
        1 : Integer.parseInt(damageDieInfo[0]);

    int dieSides = Integer.parseInt(damageDieInfo[1]);

    System.out.println("\nRolling Damage Die: " + damageDie);

    Die dieType = new Die(dieSides);
    int damage = 0;

    for (int count = 0; count < rollCount; count++) {
      int start = 0;
      while (start < dieCount) {
        dieType.roll();
        System.out.println("Rolled: " + dieType.getValue());
        damage += dieType.getValue();
        start++;
      }
    }

    return damage;
  }

}
