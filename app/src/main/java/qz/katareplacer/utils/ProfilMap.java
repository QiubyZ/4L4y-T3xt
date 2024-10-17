package qz.katareplacer.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * ProfilMap
 */
public class ProfilMap {
  public ProfilMap() {
  }

  public Map<Character, Character> DefaultSettings() {
    Map<Character, Character> defaultMap = new HashMap<>();
    defaultMap.put('a', '4');
    defaultMap.put('i', '1');
    defaultMap.put('t', '7');
    defaultMap.put('g', '9');
    defaultMap.put('e', '3');
    return defaultMap;
  }

}
