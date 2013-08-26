import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Анна
 * Date: 25.08.13
 * Time: 12:34
 * To change this template use File | Settings | File Templates.
 */
public class Transliteration {
    String Translater(String word) {
        char[] chWord = word.toCharArray();
        int i = 0;
        String newWord = "";
        while (i < chWord.length) {
            newWord += Letter(chWord[i]);
            System.out.println(" newWord = " + newWord);
            i++;
        }
        return newWord;

    }

    String Letter(char l) {
        if (l == 'а') return "a";
        if (l == 'А') return "A";
        if (l == 'б') return "b";
        if (l == 'Б') return "B";
        if (l == 'в') return "v";
        if (l == 'В') return "V";
        if (l == 'г') return "g";
        if (l == 'Г') return "G";
        if (l == 'д') return "d";
        if (l == 'Д') return "D";
        if (l == 'е' || l == 'ё') return "e";
        if (l == 'Е' || l == 'Ё') return "E";
        if (l == 'ж') return "zh";
        if (l == 'Ж') return "Zh";
        if (l == 'з') return "z";
        if (l == 'З') return "Z";
        if (l == 'и') return "i";
        if (l == 'И') return "I";
        if (l == 'й') return "y";
        if (l == 'Й') return "Y";
        if (l == 'к') return "k";
        if (l == 'К') return "K";
        if (l == 'л') return "l";
        if (l == 'Л') return "L";
        if (l == 'м') return "m";
        if (l == 'М') return "M";
        if (l == 'н') return "n";
        if (l == 'Н') return "N";
        if (l == 'о') return "o";
        if (l == 'О') return "O";
        if (l == 'п') return "p";
        if (l == 'П') return "P";
        if (l == 'р') return "r";
        if (l == 'Р') return "R";
        if (l == 'с') return "s";
        if (l == 'С') return "S";
        if (l == 'т') return "t";
        if (l == 'Т') return "T";
        if (l == 'у') return "u";
        if (l == 'У') return "U";
        if (l == 'ф') return "f";
        if (l == 'Ф') return "F";
        if (l == 'х') return "h";
        if (l == 'Х') return "H";
        if (l == 'ц') return "ts";
        if (l == 'Ц') return "Ts";
        if (l == 'ч') return "ch";
        if (l == 'Ч') return "Ch";
        if (l == 'ш') return "sh";
        if (l == 'Ш') return "Sh";
        if (l == 'щ') return "sch";
        if (l == 'Щ') return "Sch";
        if (l == 'ъ' || l == 'ь') return "`";
        if (l == 'ы') return "y";
        if (l == 'Ы') return "Y";
        if (l == 'э') return "e";
        if (l == 'Э') return "E";
        if (l == 'ю') return "yu";
        if (l == 'Ю') return "Yu";
        if (l == 'я') return "ya";
        if (l == 'Я') return "Ya";

        return "";
    }

    public static void main(String[] args) throws IOException {
        Transliteration translit = new Transliteration();
        System.out.println(translit.Translater("маЛыш"));
    }
}
