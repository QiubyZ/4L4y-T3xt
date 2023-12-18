package qz.katareplacer.utils;

import java.util.Map;

public class KataReplacer {
	public static String generator(String kata, Map<Character, Character> gantiHuruf) {
        for (int i = 0; i < kata.length(); i++) {
            char huruf = kata.charAt(i);
            if (gantiHuruf.containsKey(huruf)) {
                kata = kata.replace(huruf, gantiHuruf.get(huruf));
            }
        }
        return kata;
    }
}
