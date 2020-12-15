package dungeons_dragons.simulator_source.character;

import dungeons_dragons.simulator_source.character.abilities.armor.Armor;
import dungeons_dragons.simulator_source.character.abilities.weapon.Weapon;

public class BaseCharacter implements Character {
  // variables
  private Armor armor;
  private Weapon weapon;
  private int armorClass;
  private int attackModifier;
  private int defenseModifier;

  // constructors
  public BaseCharacter(
      String armorType,
      String weaponType,
      int attackModifier,
      int defenseModifier
  ) {
    this.armor = new Armor(armorType);
    this.weapon = new Weapon(weaponType);
    this.armorClass = armor.getArmor();
    this.attackModifier = attackModifier;
    this.defenseModifier = defenseModifier;
  }

  // overrides
  @Override
  public Armor getArmor() { return armor; }

  @Override
  public Weapon getWeapon() { return weapon; }

  @Override
  public int getArmorClass() { return armorClass; }

  @Override
  public int getAttackModifier() { return attackModifier; }

  @Override
  public int getDefenseModifier() { return defenseModifier; }
}
