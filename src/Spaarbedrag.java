import java.io.PrintStream;
import java.util.Scanner;

public class Spaarbedrag {

    public static void main (String [] arg){

        System.out.println("Geef het bedrag op wat je wilt inleggen:");

      //  double bedrag;

        var s = new Scanner(System.in);

           double bedrag = s.nextDouble();

           System.out.printf("€%.2f",bedrag);

           System.out.println();

       // System.out.println("€"+bedrag);

        System.out.println("Met welke rente wil je dit bedrag beleggen?");

        var x = new Scanner(System.in);

        double rente = x.nextDouble();

        System.out.printf("Met een inleg van €%.2f",bedrag); System.out.print(" en een rente van "+rente+"% bouw je in 10 jaar de volgende rente op:");

        System.out.println();



    double uit1 = bedrag+(bedrag/100*rente);
    double uit2 = uit1+(uit1/100*rente);
    double uit3 = uit2+(uit2/100*rente);
    double uit4 = uit3+(uit3/100*rente);
    double uit5 = uit4+(uit4/100*rente);
    double uit6 = uit5+(uit5/100*rente);
    double uit7 = uit6+(uit6/100*rente);
    double uit8 = uit7+(uit7/100*rente);
    double uit9 = uit8+(uit8/100*rente);
    double uit10 = uit9+(uit9/100*rente);



    System.out.printf("jaar 1   :   €%.2f",uit1); System.out.println();
    System.out.printf("jaar 2   :   €%.2f",uit2); System.out.println();
    System.out.printf("jaar 3   :   €%.2f",uit3); System.out.println();
    System.out.printf("jaar 4   :   €%.2f",uit4); System.out.println();
    System.out.printf("jaar 5   :   €%.2f",uit5); System.out.println();
    System.out.printf("jaar 6   :   €%.2f",uit6); System.out.println();
    System.out.printf("jaar 7   :   €%.2f",uit7); System.out.println();
    System.out.printf("jaar 8   :   €%.2f",uit8); System.out.println();
    System.out.printf("jaar 9   :   €%.2f",uit9); System.out.println();
    System.out.printf("jaar 10  :   €%.2f",uit10); System.out.println();





}



    }


