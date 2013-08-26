import com.sun.prism.impl.Disposer;
import sun.awt.CharsetString;

import java.io.*;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Анна
 * Date: 04.08.13
 * Time: 15:28
 * To change this template use File | Settings | File Templates.
 */
public class Trigramms {
    private File trigramms;

    // создаем txt файл. определяем сколько данных будет у 1го контакта (телефон, адрес....)
    Trigramms(final String fileName) throws IOException {
        trigramms = new File(fileName);
        if (!trigramms.exists()) {
            trigramms.createNewFile();
            System.out.println("New file " + fileName + " has been created in the current directory");
        }
    }

    private void trigrammSort() throws IOException {
        // открываем файл. Читаем его.
        BufferedReader br = new BufferedReader(new FileReader(trigramms));
        String line = "";          // весь текст переписываем в переменную line;
        try {
            String checkVar;
            int cNull = 0;
            while (cNull <= 7) {             // счетаем кол-во пустых строчек.
                checkVar = br.readLine();
                line += checkVar + " ";
                if (checkVar == null) {
                    cNull++;
                }

            }
            System.out.println("line<   ------   " + line + "   ------  >line");
        } finally {
            br.close();
        }

        // Создаем мап. Ключ - триграмма, значение - кол-во повторений
        Map<String, Integer> HaM = new HashMap<String, Integer>();
        // String Str = "оранжевые дети, оранжевая мама";
        char[] ChStr = line.toCharArray();                    // перевод больших букв в строчные
        for (int i = 0; i < ChStr.length - 2; i++) {
           /* if( (ChStr[i]>='А' && ChStr[i] <= 'Я')  ||
              ( ChStr[i]>= 'A' && ChStr[i] <= 'Z') ){
                ChStr[i] = converter(ChStr[i]);
            }*/
            if ((ChStr[i + 2] >= 'а') && (ChStr[i + 2] <= 'я') &&
                    (ChStr[i + 1] >= 'а') && (ChStr[i + 1] <= 'я') &&
                    ((ChStr[i] >= 'а') && (ChStr[i] <= 'я') || (ChStr[i] >= 'А' && ChStr[i] <= 'Я'))) {

                if ((ChStr[i] >= 'А' && ChStr[i] <= 'Я')) {
                    ChStr[i] = converter(ChStr[i]);
                }
                char ch = ChStr[i];
                char ch2 = ChStr[i + 1];
                char ch3 = ChStr[i + 2];
                String c = Character.toString(ch) + Character.toString(ch2) + Character.toString(ch3);

                //записываем в hashMap. Или ,если уже есть такой key, то увеличиваем value
                if (!HaM.containsKey(c) || HaM.isEmpty()) {
                    HaM.put(c, 1);
                } else {
                    HaM.put(c, HaM.get(c) + 1);
                }

            }
        }
        // создаем массив. В него записываем количество повторений каждой триграммы. Сортируем.
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Iterator iterator = HaM.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next().toString();
            int value = HaM.get(key);
            arr.add(value);
            //System.out.println("entry = "+ key + " " + value);

        }
        Collections.sort(arr);
        for (int i = arr.size() - 1; i > arr.size() - 11; i--) {
            for (Map.Entry<String, Integer> entry : HaM.entrySet()) {
                if (entry.getValue().equals(arr.get(i))) {
                    System.out.println("the key is - " + entry.getKey() + " the value is - " + entry.getValue());
                    HaM.remove(entry.getKey());
                    break;

                }
            }

        }
    }

    private char converter(char ch) {
        if (ch == 'А') return 'а';
        if (ch == 'Б') return 'б';
        if (ch == 'В') return 'в';
        if (ch == 'Г') return 'г';
        if (ch == 'Д') return 'д';
        if (ch == 'Е') return 'е';
        if (ch == 'Ё') return 'ё';
        if (ch == 'Ж') return 'ж';
        if (ch == 'З') return 'з';
        if (ch == 'И') return 'и';
        if (ch == 'Й') return 'й';
        if (ch == 'К') return 'к';
        if (ch == 'Л') return 'л';
        if (ch == 'М') return 'м';
        if (ch == 'Н') return 'н';
        if (ch == 'О') return 'о';
        if (ch == 'П') return 'п';
        if (ch == 'Р') return 'р';
        if (ch == 'С') return 'с';
        if (ch == 'Т') return 'т';
        if (ch == 'У') return 'у';
        if (ch == 'Ф') return 'ф';
        if (ch == 'Х') return 'х';
        if (ch == 'Ц') return 'ц';
        if (ch == 'Ч') return 'ч';
        if (ch == 'Ш') return 'ш';
        if (ch == 'Щ') return 'щ';
        if (ch == 'Ы') return 'ы';
        if (ch == 'Ъ') return 'ъ';
        if (ch == 'Ь') return 'ь';
        if (ch == 'Э') return 'э';
        if (ch == 'Ю') return 'ю';
        if (ch == 'Я') return 'я';

        if (ch == 'A') return 'a';
        if (ch == 'B') return 'b';
        if (ch == 'C') return 'c';
        if (ch == 'D') return 'd';
        if (ch == 'E') return 'e';
        if (ch == 'F') return 'f';
        if (ch == 'G') return 'g';
        if (ch == 'H') return 'h';
        if (ch == 'I') return 'i';
        if (ch == 'J') return 'j';
        if (ch == 'K') return 'k';
        if (ch == 'L') return 'l';
        if (ch == 'M') return 'm';
        if (ch == 'N') return 'n';
        if (ch == 'O') return 'o';
        if (ch == 'P') return 'p';
        if (ch == 'Q') return 'q';
        if (ch == 'R') return 'r';
        if (ch == 'S') return 's';
        if (ch == 'T') return 't';
        if (ch == 'U') return 'u';
        if (ch == 'V') return 'v';
        if (ch == 'W') return 'w';
        if (ch == 'X') return 'x';
        if (ch == 'Y') return 'y';
        if (ch == 'Z') return 'z';
        else return 0;


    }

    public static void main(String[] args) throws IOException {
        Trigramms T = new Trigramms("trigramms.txt");
        T.trigrammSort();
    }
}
