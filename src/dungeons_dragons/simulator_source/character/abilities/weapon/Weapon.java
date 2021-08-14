package dungeons_dragons.simulator_source.character.abilities.weapon;

public class Weapon {
  // variables
  private int attackModifier = 0;
  private final String damageDice;

  // constructors
  public Weapon(
      String weaponType
  ) {
    this.damageDice = new WeaponTypes().getDamageDice(weaponType);
  }

  public Weapon(
      int attackModifier,
      String weaponType
  ) {
    this.attackModifier = attackModifier;
    this.damageDice = new WeaponTypes().getDamageDice(weaponType);
  }

  // getters
  public int getAttackModifier() { return attackModifier; }
  public String getDamageDice() { return  damageDice; }
}
