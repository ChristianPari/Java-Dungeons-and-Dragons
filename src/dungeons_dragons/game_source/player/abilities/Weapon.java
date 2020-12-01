package dungeons_dragons.game_source.player.abilities;

public class Weapon {
  // variables
  private int attackModifier;
  private String damageDice;

  // constructors
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
