package com.example.interoperabilitas;

import java.sql.Date;
import java.sql.Time;

public class InfoBooking {
    private Integer kodeBooking;
    private Time waktuMulai;
    private Time waktuSelesai;
    private Date tanggalBooking;

    public  InfoBooking(Integer kodeBooking, Time waktuMulai, Time waktuSelesai, Date tanggalBooking)
    {
        this.kodeBooking=kodeBooking;
        this.waktuMulai=waktuMulai;
        this.waktuSelesai=waktuSelesai;
        this.tanggalBooking=tanggalBooking;

    }


    public Time getWaktuMulai() {
        return waktuMulai;
    }

    public Time getWaktuSelesai() {
        return waktuSelesai;
    }

    public Date getTanggalBooking() {
        return tanggalBooking;
    }

    public Integer getKodeBooking() {
        return kodeBooking;
    }

    public void setKodeBooking(Integer kodeBooking) {
        this.kodeBooking = kodeBooking;
    }

    public void setTanggalBooking(Date tanggalBooking) {
        this.tanggalBooking = tanggalBooking;
    }

    public void setWaktuMulai(Time waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    public void setWaktuSelesai(Time waktuSelesai) {
        this.waktuSelesai = waktuSelesai;
    }
}
