package Calculator;

/**
 * @author Albert Isaev
 */
public class Roman {

    public static int convertRomanToInt(String letter) {
        int num = 0;
        switch (letter) {
            case "I" -> num = 1;
            case "II" -> num = 2;
            case "III" -> num = 3;
            case "IV" -> num = 4;
            case "V" -> num = 5;
            case "VI" -> num = 6;
            case "VII" -> num = 7;
            case "VIII" -> num = 8;
            case "IX" -> num = 9;
            case "X" -> num = 10;
            default -> System.out.println("Вы ввели некорректный символ");
        }
        return num;
    }

    public static String convertIntToRoman(int num) {
        int[] numbers = {100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] letters = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            while (num >= numbers[i]) {
                roman.append(letters[i]);
                num -= numbers[i];
            }
        }
        return roman.toString();
    }
}

