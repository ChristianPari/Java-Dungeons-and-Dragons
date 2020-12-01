package dungeons_dragons.game_source.player.abilities;

public class Armor {
  // variables
  private int armor;

  // constructors
  public Armor(
      String armorType
  ) {
   armor = new ArmorTypes().getArmorPoints(armorType);
  }

  // getters
  public int getArmor() { return armor; }
}
