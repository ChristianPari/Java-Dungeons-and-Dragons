package dungeons_dragons.game_source.player.abilities;

import java.util.HashMap;

public class WeaponTypes {
  HashMap<String, String> weaponTypes = new HashMap<>() {{
    put("simple melee", "1d4");
    put("simple ranged", "1d6");
    put("martial melee", "1d8");
    put("martial ranged", "1d10");
  }};

  public String getDamageDice(String weaponType) {
    return weaponTypes.get(weaponType);
  }
}
