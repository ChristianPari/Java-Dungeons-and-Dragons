package dungeons_dragons.game_source;

public class Calculator {
  // variables
  private static final int CRITICAL_HIT = 20;
  private static final int CRITICAL_MISS = 1;
  private static Die d20;

  // constructors
  public Calculator(
      Die d20
  ) {
    this.d20 = d20;
  }

  // methods
  public static int attack(
      String damageDice,
      int attackModifier,
      int armorClass,
      int defenseModifier
  ) {
    // armorClass and defenseModifier are relative to the TARGET
    // attackModifier and damageDice are relative to the CHARACTER attacking
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

    if (rollValue > targetsDefense) {
      damage = calculateDamage("standard", damageDice);
      outputMsg = "Hit " + damage + " damage delt";
    } else {
      outputMsg = "Miss 0 Damage";
    }

    System.out.println(outputMsg);
    return damage;
  }

  public static int attack(
      Character attacker,
      Character defender
  ) {
    return attack(
        attacker.getWeapon().getDamageDice(),
        attacker.getAttackModifier(),
        defender.getArmorClass(),
        defender.getDefenseModifier()
    );
  }

  private static int rollD20() {
    d20.roll();
    int rollValue = d20.getValue();
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

    Die dieType = new Die(dieSides);
    int damage = 0;

    for (int count = 0; count < rollCount; count++) {
      int start = 0;
      while (start < dieCount) {
        dieType.roll();
        damage += dieType.getValue();
        start++;
      }
    }

    return damage;
  }

}
