import java.util.Scanner;

/**
 * Created by kanapysh on 18.01.16.
 */
public class homew_round {
    public static void main (String [] args)
    {
        final  double Pi = 3.14;
        int rad = 18;

        double S = Pi*Math.pow(rad,2);
        System.out.println(S+" - площадь круга с радиусом 18");

        /* Scanner radius = new Scanner(System.in);

        double S= Pi * Math.pow(radius,2.3); */ //вариант как можно ввести радиус с клавиатуры, но не хочет подставлять в формулу Math.pow


    }
}
