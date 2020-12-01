package dungeons_dragons.simulator_source.character.abilities.weapon;

import java.util.HashMap;

public class WeaponTypes {
  private HashMap<String, String> weaponTypes = new HashMap<>() {{
    put("simple melee", "1d4");
    put("simple ranged", "1d6");
    put("martial melee", "1d8");
    put("martial ranged", "1d10");
  }};

  // methods
  public String getDamageDice(String weaponType) { return weaponTypes.get(weaponType); }

  // getters
  public HashMap<String, String> getWeaponTypes() { return weaponTypes; }
}
