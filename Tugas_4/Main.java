import java.util.ArrayList;
import java.util.Scanner;

import constant.status.StatusBuku;

import java.util.Date;

import model.Book;
import helper.parse;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Book> listBook = new ArrayList<Book>();

        System.out.println("\n======== Masukan Daftar Buku ========");
        
        Boolean stat = true;
        while (stat != false) {

            Book book = new Book();

            System.out.print("\nMasukkan judul\t: ");
            book.setJudul(scan.nextLine());

            System.out.print("Masukkan penerbit\t: ");
            book.setPenerbit(scan.nextLine());

            System.out.print("Masukkan tahunTerbit\t: ");
            book.setTahunTerbit(scan.nextLine());

            System.out.print("Masukkan pengarang\t: ");
            book.setPengarang(scan.nextLine());

            System.out.print("Masukkan isbn\t: ");
            book.setIsbn(scan.nextLine());

            System.out.print("Masukkan tglKembali\t: ");
            Date parsed = parse.stringToDate(scan.nextLine());
            book.setTglKembali(parsed);

            if(parsed == null){
                book.setStatus(StatusBuku.BELUM_DIKEMBALIKAN);
            } else {
                book.setStatus(StatusBuku.SUDAH_DIKEMBALIKAN);
            }

            listBook.add(book);

            System.out.print("\nTambah lagi (y/n) ? ");
            String input = scan.nextLine();
            
            if (input.equals("n")){
                stat = false;
            }
        }

        System.out.println("\n======== Daftar Buku ========");
        System.out.println("Judul\t\tPenerbit\t\tTahun Terbit\t\tPengarang\t\tISBN\t\tStatus\t\tTgl Kembali");
        for(Book obj : listBook){
            System.out.println(obj.getJudul()+"\t\t"+obj.getPenerbit()+"\t\t"+obj.getTahunTerbit()+"\t\t"+obj.getPengarang()+"\t\t"+obj.getIsbn()+"\t\t"+obj.getStatus()+"\t\t"+obj.getTglKembali());
        }
    }
}
