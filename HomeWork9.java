package homework9;

public class HomeWork9 {
    public static void main(String[] args) {
       /* 1. Напишите функцию которая возвращает строку из первых букв передаваемой в нее фразы
        Пример: "Однажды в студеную зимнюю пору" -> "Овсзп" */
        System.out.println(firstSymbol("Однажды в студеную зимнюю пору"));
        /* 2. Напишите функцию, которая подсчитывает количество определенных символов в передаваемой в нее строке.
                Например:
        "London is a capital", 'o' -> 2 (подсчитываем число букв o)
        "London is a capital", ' ' -> 3 (подсчитываем число пробелов)
        "London is a capital", 'a' -> 3  (подсчитываем число букв a) */
        System.out.println("o: " + howManyLetters("London is a capital", 'o'));
        System.out.println("space: " + howManyLetters("London is a capital", ' '));
        System.out.println("a: " + howManyLetters("London is a capital", 'a'));
        /* (сложная) 3. Напишите функцию, которая формирует sql запрос в виде строки из передаваемых в нее двух массивов строк.
        public static String formatSql(String [] params, String [] vals)
        В первом массиве названия параметров, во втором значения соответствующих параметров, размер массивов params и vals всегда будет одинаков.
                Значения из массива vals равные null не должны использоваться при формировании запроса

        Например - параметры active и year не используются так как их значения null:
        String [] params = {"id", "city", "year", "active", "climate"};
        String [] vals = {"1", "Helsinki", null, null, "cool"};
        "SELECT * FROM users WHERE id = '1' AND city = 'Helsinki' AND climate = 'cool';"

        Еще пример - пераметр year не используется так как его значения null:
        String [] params = {"country", "year", "active"};
        String [] vals = {"Germany",  null, "true"};
        "SELECT * FROM users WHERE country = 'Germany' and active='true';" */


    }//main

    //1
    public static String firstSymbol(String a){
        String [] split = a.split(" ");
        StringBuilder foundFirstSymbol = new StringBuilder();
        for (int i = 0; i < split.length; i++){
            char c = split[i].charAt(0);
            foundFirstSymbol.append(c);
        }
        return foundFirstSymbol.toString();
    }

    //2
    public static int howManyLetters(String a, char b){
        char ch = b;
        int count = a.length() - a.replace(String.valueOf(ch), "").length();
        return count;
    }
}
