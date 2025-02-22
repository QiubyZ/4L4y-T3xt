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
    public static String generatorStringBuilder(String kata, Map<Character, Character> gantiHuruf) {
        // Gunakan StringBuilder untuk membangun string hasil
        StringBuilder hasil = new StringBuilder(kata);

        // Iterasi melalui setiap karakter dalam string
        for (int i = 0; i < hasil.length(); i++) {
            char huruf = hasil.charAt(i);
            // Periksa apakah karakter ada dalam map
            if (gantiHuruf.containsKey(huruf)) {
                // Ganti karakter pada indeks tertentu
                hasil.setCharAt(i, gantiHuruf.get(huruf));
            }
        }

        // Konversi StringBuilder ke String dan kembalikan hasilnya
        return hasil.toString();
    }
}
