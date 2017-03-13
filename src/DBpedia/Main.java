package DBpedia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rd on 11/03/17.
 */
public class Main {

    public static boolean isNumeric(String str)
    {
        try
        {
            int d = Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Sorry i cant convert string input , please put a arabic number  ");
            //System.out.println(e.getMessage());
            return false;
        }
        return true;
    }


    public static void main(String[] args) throws IOException {

        System.out.println("\n"
                + "*******************************************************************************\n"
                + "*******************************************************************************\n"
                + "* Hello! I am a simple chatbot to translate arabic numbers into roman numbers *\n"
                + "******     Ask me to translate arabic numbers or press 'stop' to exit  ********\n"
                + "*******************************************************************************");
        while (true) {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(reader);
            System.out.println("Please write a arabic number to convert : ");
            String text = input.readLine();
            if (text.equals("stop")) {System.out.println("See you ! bye ...");
            break;}

            if (isNumeric(text)) {

                   try {
                       int number = new Integer(text).intValue();


                       ArabicRoman nr = new ArabicRoman(number);
                       System.out.print("Arabic Number " + number + "   converted in Roman number is :   ");
                       System.out.println(nr);
                   }
                   catch(NumberFormatException e)
                   {

                       System.out.println(e.getMessage());
                   }
            }


        }
    }
}
