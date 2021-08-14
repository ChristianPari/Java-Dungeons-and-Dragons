package dungeons_dragons.simulator_source.character.abilities.weapon;

import dungeons_dragons.simulator_source.character.abilities.Utilities;

import java.util.Map;

public class WeaponTypes {
  private final Map<String, String> weaponTypes = Utilities.createMap(
    new String[]{"simple melee", "simple ranged", "martial melee", "martial ranged"},
    new String[]{"1d4", "1d6", "1d8", "1d10"}
  );

  // methods
  public String getDamageDice(String weaponType) { return weaponTypes.get(weaponType); }

  // getters
  public Map<String, String> getWeaponTypes() { return weaponTypes; }
}
