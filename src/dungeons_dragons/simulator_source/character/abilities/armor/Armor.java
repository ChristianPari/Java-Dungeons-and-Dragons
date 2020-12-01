package dungeons_dragons.simulator_source.character.abilities.armor;

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
