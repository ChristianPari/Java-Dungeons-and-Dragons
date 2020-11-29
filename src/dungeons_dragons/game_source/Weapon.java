package dungeons_dragons.game_source;

public class Weapon {
  // variables
  private int attackModifier;
  private String damageDice;

  // constructors
  public Weapon(
      int attackModifier,
      String damageDice
  ) {
    this.attackModifier = attackModifier;
    this.damageDice = damageDice;
  }

  // getters
  public int getAttackModifier() { return attackModifier; }
  public String getDamageDice() { return  damageDice; }
}
