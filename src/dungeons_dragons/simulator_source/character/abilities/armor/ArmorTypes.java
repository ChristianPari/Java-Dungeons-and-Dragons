package dungeons_dragons.simulator_source.character.abilities.armor;

import dungeons_dragons.simulator_source.character.abilities.Utilities;
import java.util.Map;

public class ArmorTypes {
  // variables
  private final Map<String, Integer> armorTypes = Utilities.createMap(
    new String[]{"none", "leather", "chain", "plate"},
    new Integer[]{10, 11, 13, 18}
  );

  // methods
  public int getArmorPoints(String armorType) {
    return armorTypes.get(armorType);
  }

  // getters
  public Map<String, Integer> getArmorTypes() { return armorTypes; }
}
