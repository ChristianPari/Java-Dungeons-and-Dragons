package dungeons_dragons.simulator_source.character.abilities;

import java.util.HashMap;
import java.util.Map;

public class Utilities {
  public static Map<String, Integer> createMap(
    String[] types,
    Integer[] points
  ) {
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < types.length; i++) {
      map.put(types[i], points[i]);
    }
    return map;
  }

  public static Map<String, String> createMap(
    String[] types,
    String[] points
  ) {
    Map<String, String> map = new HashMap<>();
    for (int i = 0; i < types.length; i++) {
      map.put(types[i], points[i]);
    }
    return map;
  }
}
