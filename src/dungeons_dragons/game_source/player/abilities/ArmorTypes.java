package dungeons_dragons.game_source.player.abilities;

import java.util.HashMap;

public class ArmorTypes {
  // variables
  HashMap<String, Integer> armorTypes = new HashMap<>() {{
    put("none", 10);
    put("leather", 11);
    put("chain", 13);
    put("plate", 18);
  }};

  public int getArmorPoints(String armorType) {
    return armorTypes.get(armorType);
  }
}
