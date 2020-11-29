package dungeons_dragons.game_source;

public class Enemy extends Character {
  // constructors
  public Enemy(
      Armor armor,
      Weapon weapon,
      int armorClass,
      int attackModifier,
      int defenseModifier
  ) {
    super(armor, weapon, armorClass, attackModifier, defenseModifier);
  }
}
