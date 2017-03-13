package DBpedia;

/*
This is a class which take input as integer and convert in roman number
 */

public class ArabicRoman {
    private int inputnumber;
    private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC", "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
    private static int[] number=    {1000 ,  900,  500,   400, 100,    90,  50,   40 ,   10 ,  9,    5,    4,    1};

    public ArabicRoman(int input){
        if( input < 1 ) throw new NumberFormatException("ups.... Please enter positive natural number grater then 0");
        this.inputnumber = input;
    }

    public String toString() {

        String roman = "";
        int N = inputnumber;

        for (int i = 0; i < number.length; i++) {
            while (N >= number[i]) {
                roman += letters[i];
                N -= number[i];
            }
        }
        return roman;
    }





}
