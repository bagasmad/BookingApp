package com.example.interoperabilitas;

import java.sql.Date;
import java.sql.Time;

public class InfoBooking {
    private Integer kodeBooking;
    private Integer waktuMulai;
    private Integer waktuSelesai;
    private Integer tahunBooking;
    private Integer bulanBooking;
    private Integer tanggalBooking;

    public  InfoBooking(Integer kodeBooking, Integer waktuMulai, Integer waktuSelesai, Integer tahunBooking, Integer bulanBooking, Integer tanggalBooking)
    {
        this.kodeBooking=kodeBooking;
        this.waktuMulai=waktuMulai;
        this.waktuSelesai=waktuSelesai;
        this.tahunBooking=tahunBooking;
        this.bulanBooking=bulanBooking;
        this.tanggalBooking=tanggalBooking;

    }


    public Integer getWaktuMulai() {
        return waktuMulai;
    }

    public Integer getWaktuSelesai() {
        return waktuSelesai;
    }

    public Integer getTahunBooking() {
        return tahunBooking;
    }

    public Integer getBulanBooking() {
        return bulanBooking;
    }

    public Integer getTanggalBooking() {
        return tanggalBooking;
    }

    public Integer getKodeBooking() {
        return kodeBooking;
    }

    public void setKodeBooking(Integer kodeBooking) {
        this.kodeBooking = kodeBooking;
    }

    public void setTahunBooking(Integer tahunBooking) {
        this.tahunBooking = tahunBooking;
    }

    public void setBulanBooking(Integer bulanBooking) {
        this.bulanBooking = bulanBooking;
    }
    public void setTanggalBooking(Integer tanggalBooking) {
        this.tanggalBooking = tanggalBooking;
    }

    public void setWaktuMulai(Integer waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    public void setWaktuSelesai(Integer waktuSelesai) {
        this.waktuSelesai = waktuSelesai;
    }
}
