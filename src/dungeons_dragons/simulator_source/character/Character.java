package dungeons_dragons.simulator_source.character;

import dungeons_dragons.simulator_source.character.abilities.armor.Armor;
import dungeons_dragons.simulator_source.character.abilities.weapon.Weapon;

public interface Character {
  Armor getArmor();
  Weapon getWeapon();
  int getArmorClass();
  int getAttackModifier();
  int getDefenseModifier();
}
