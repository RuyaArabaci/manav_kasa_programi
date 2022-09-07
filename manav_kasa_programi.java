import java.util.Scanner;

public class manav_kasa_programi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double elma, armut, domates, muz, patlican, sonuc;
        
        System.out.print("Armut kaç Kilo ? :");
        armut = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elma = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domates = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muz = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = input.nextDouble();
        
        elma *= 3.67;
        armut *= 2.14;
        domates *= 1.11;
        muz *= 0.95;
        patlican *= 5.00;
        sonuc = elma + armut + patlican + muz + domates;

        System.out.println("Toplam Tutar :" + sonuc + " TL");
    }
}