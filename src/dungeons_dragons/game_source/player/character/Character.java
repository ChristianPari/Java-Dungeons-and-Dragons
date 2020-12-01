package dungeons_dragons.game_source;

public class Character {
  // variables
  private Armor armor;
  private Weapon weapon;
  private int armorClass;
  private int attackModifier;
  private int defenseModifier;

  // constructors
  public Character(
      Armor armor,
      Weapon weapon,
      int armorClass,
      int attackModifier,
      int defenseModifier
  ) {
    this.armor = armor;
    this.weapon = weapon;
    this.armorClass = armorClass;
    this.attackModifier = attackModifier;
    this.defenseModifier = defenseModifier;
  }

  // getters
  public Armor getArmor() { return armor; }

  public Weapon getWeapon() { return weapon; }

  public int getArmorClass() { return armorClass; }

  public int getAttackModifier() { return attackModifier; }

  public int getDefenseModifier() { return defenseModifier; }
}
