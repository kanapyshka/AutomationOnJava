/**
 * Created by kanapysh on 12.01.16.
 */
public class rounds {
    public static void main(String[] args)
           {
           /* double a = 50.30; // сторона прямоугольника а
            double b =80.865; // сторона б
            double Sc;
               Sc=(a*b)/100; //площадь

            System.out.println("Площадь прямоугольника=" + (Sc));*/
               int x = 1;
               int y = 133;
               int b = y;
               y=x;
               x=b;

              /*
              второй вариант решения
               y=y+x;
               x=y-x;
               y=y-x;


               System.out.println(x);
               System.out.println(y);
               */

               double sum = 20000;
               double percent = 10;
               double mountCount = 12;
               double mouthPerm = 3;

               double oneMouth = (percent/100)*sum;
               System.out.println(sum);

               double sumFor3mouth = (oneMouth/12)*3;
               System.out.println(sumFor3mouth);

               double Finalfor3 = sum + sumFor3mouth;
               System.out.println("Сумма за трехмесячный депозит от суммы = " + Finalfor3);

               double firstmouthResult = sum + (sum*(percent/100))/12;

        }
    }