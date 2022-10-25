import java.util.Scanner;

import calculate.keliling;
import calculate.luas;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nPanjang sisi persegi: ");
        double sisi = input.nextDouble();
        System.out.print("Panjang persegi panjang: ");
        double p = input.nextDouble();
        System.out.print("Lebar persegi panjang: ");
        double l = input.nextDouble();
        System.out.print("Panjang jari-jari: ");
        double r = input.nextDouble();

        System.out.println("\nPersegi");
        System.out.println("Luas persegi: " + luas.persegi(sisi));
        System.out.println("Keliilng persegi: " + keliling.persegi(sisi));

        System.out.println("\nPersegi panjang");
        System.out.println("Luas persegi panjang: " + luas.persegiPanjang(p, l));
        System.out.println("Keliilng persegi panjang: " + keliling.persegiPanjang(p, l));

        System.out.println("\nLingkaran");
        System.out.println("Luas lingkaran: " + luas.lingkaran(r));
        System.out.println("Keliilng lingkaran: " + keliling.lingkaran(r));
    }
} 
