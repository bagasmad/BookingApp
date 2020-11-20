package com.example.interoperabilitas;

import java.util.ArrayList;

public class Ruangan {
    Integer kodeRuangan;
    String namaRuangan;
    String deskripsiRuangan;
    Integer hargaRuangan;
    String lokasiRuangan;
    String urlGambarRuangan;
    Integer kapasitasRuangan;
    ArrayList<InfoBooking> bookings;

    public Ruangan(Integer kodeRuangan, String namaRuangan, String deskripsiRuangan, String lokasiRuangan, String urlGambarRuangan,Integer hargaRuangan, Integer kapasitasRuangan, ArrayList<InfoBooking> bookings)
    {
       this.kodeRuangan=kodeRuangan;
       this.namaRuangan=namaRuangan;
       this.deskripsiRuangan=deskripsiRuangan;
       this.lokasiRuangan=lokasiRuangan;
       this.urlGambarRuangan=urlGambarRuangan;
       this.hargaRuangan=hargaRuangan;
       this.kapasitasRuangan=kapasitasRuangan;
       this.bookings=bookings;
    }

    public Integer getKodeRuangan()
    {
        return kodeRuangan;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public Integer getHargaRuangan() {
        return hargaRuangan;
    }

    public String getDeskripsiRuangan() {
        return deskripsiRuangan;
    }

    public String getLokasiRuangan() {
        return lokasiRuangan;
    }

    public String getUrlGambarRuangan() {
        return urlGambarRuangan;
    }

    public ArrayList<InfoBooking> getBookings() {
        return bookings;
    }

    public Integer getKapasitasRuangan() {
        return kapasitasRuangan;
    }

    public void setBookings(ArrayList<InfoBooking> bookings) {
        this.bookings = bookings;
    }

}
