/*8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 185.72m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm*/

import java.util.Locale;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n, km, hm, dam, dm, cm, mm;
        System.out.print("Digite a distância em metros: ");
        n = sc.nextDouble();
        km = n / 1000.0;
        hm = n / 100.0;
        dam = n / 10.0;

        dm = n * 10.0;
        cm = n * 100.0;
        mm = n * 1000.0;

        System.out.printf("A distância de %.2fm corresponde a:\n", n);
        System.out.printf("%.5fKm%n", km);
        System.out.printf("%.4fHm%n", hm);
        System.out.printf("%.3fDam%n", dam);
        System.out.printf("%.1fdm%n", dm);
        System.out.printf("%.1fcm%n", cm);
        System.out.printf("%.1fmm%n", mm);

    sc.close();
    }
}
