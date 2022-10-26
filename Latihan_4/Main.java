// import java.util.Scanner;
// import java.util.HashMap;

// import bangunDatar.shape.lingkaran;
// import bangunDatar.shape.persegi;
// import bangunDatar.shape.persegiPanjang;

// public class Main {

//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         Boolean a = true;

//         while (a != false){
//             System.out.println("\n1.Persegi");
//             System.out.println("2.Lingkaran");
//             System.out.println("3.Persegi Panjang");
//             System.out.println("0.Exit");
//             System.out.print("\nPilih menu: ");
//             Integer input = scanner.nextInt();

//             switch(input){
//                 case 1:
//                     persegi();
//                     break;
//                 case 2:
//                     lingkaran();
//                     break;
//                 case 3:
//                     persegiPanjang();
//                 case 0:
//                     System.out.println("Exit...");
//                     break;
//             }

//             if(input == 0){
//                 a = false;
//             }
//         }
//     }

//     static void lingkaran(){
        
//         Scanner scanner = new Scanner(System.in);
//         HashMap<String, Double> hash = new HashMap<String, Double>();

//         System.out.print("\nPanjang jari-jari lingkaran: ");
//         double r = scanner.nextDouble();

//         hash.put("r", r);

//         lingkaran lingkaran = new lingkaran();
//         Double luas = lingkaran.luas(hash);
//         Double keliling = lingkaran.keliling(hash);

//         lingkaran.show("Lingkaran", luas, keliling);
//     }

//     static void persegiPanjang(){

//         Scanner scanner = new Scanner(System.in);
//         HashMap<String, Double> hash = new HashMap<String, Double>();

//         System.out.print("\nPanjang persegi panjang: ");
//         double p = scanner.nextDouble();

//         System.out.print("\nLebar persegi panjang: ");
//         double l = scanner.nextDouble();

//         hash.put("p", p);
//         hash.put("l", l);

//         persegiPanjang persegiPanjang = new persegiPanjang();
//         Double luas = persegiPanjang.luas(hash);
//         Double keliling = persegiPanjang.keliling(hash);
//         persegiPanjang.show("Persegi Panjang", luas, keliling);

//     }

//     static void persegi(){

//         Scanner scanner = new Scanner(System.in);
//         HashMap<String, Double> hash = new HashMap<String, Double>();

//         System.out.print("\nPanjang sisi persegi: ");
//         double sisi = scanner.nextDouble();

//         hash.put("sisi", sisi);

//         persegi persegi = new persegi();
//         Double luas = persegi.luas(hash);
//         Double keliling = persegi.keliling(hash);

//         persegi.show("Persegi", luas, keliling);
//     }
// }