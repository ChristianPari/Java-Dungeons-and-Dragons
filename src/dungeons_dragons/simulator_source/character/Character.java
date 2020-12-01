//todo: refactor the use of the armor and weapon
package dungeons_dragons.simulator_source.character;

import dungeons_dragons.simulator_source.character.abilities.armor.Armor;
import dungeons_dragons.simulator_source.character.abilities.weapon.Weapon;

public class Character {
  // variables
  private Armor armor;
  private Weapon weapon;
  private int armorClass;
  private int attackModifier;
  private int defenseModifier;

  // constructors
  public Character(
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

  // getters
  public Armor getArmor() { return armor; }

  public Weapon getWeapon() { return weapon; }

  public int getArmorClass() { return armorClass; }

  public int getAttackModifier() { return attackModifier; }

  public int getDefenseModifier() { return defenseModifier; }
}
