package model;

import constant.status;
import java.util.Date;;

public class Book {
    
    String judul;
    String penerbit;
    String tahunTerbit;
    String pengarang;
    String isbn;
    Date tglKembali;
    status.StatusBuku status;

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPenerbit() {
        return penerbit;
    }
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    public String getTahunTerbit() {
        return tahunTerbit;
    }
    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Date getTglKembali() {
        return tglKembali;
    }
    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }
    public status.StatusBuku getStatus() {
        return status;
    }
    public void setStatus(status.StatusBuku status) {
        this.status = status;
    }
}



