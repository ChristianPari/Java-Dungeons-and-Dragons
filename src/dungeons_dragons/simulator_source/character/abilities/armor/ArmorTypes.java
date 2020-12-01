package dungeons_dragons.simulator_source.character.abilities.armor;

import java.util.HashMap;

public class ArmorTypes {
  // variables
  private HashMap<String, Integer> armorTypes = new HashMap<>() {{
    put("none", 10);
    put("leather", 11);
    put("chain", 13);
    put("plate", 18);
  }};

  // methods
  public int getArmorPoints(String armorType) {
    return armorTypes.get(armorType);
  }

  // getters
  public HashMap<String, Integer> getArmorTypes() { return armorTypes; }
}
