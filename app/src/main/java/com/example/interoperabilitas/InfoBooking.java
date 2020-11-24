package com.example.interoperabilitas;

public class InfoBooking {
    private Integer idRuangan;
    private Integer idUser;
    private Integer idBooking;
    private Integer waktuMulai;
    private Integer waktuSelesai;
    private Integer tahunBooking;
    private Integer bulanBooking;
    private Integer tanggalBooking;
    private Integer hargaTotal;

    public  InfoBooking(Integer idRuangan, Integer idUser, Integer idBooking, Integer waktuMulai, Integer waktuSelesai, Integer tahunBooking, Integer bulanBooking, Integer tanggalBooking,Integer hargaTotal)
    {
        this.idRuangan=idRuangan;
        this.idUser=idUser;
        this.idBooking = idBooking;
        this.waktuMulai=waktuMulai;
        this.waktuSelesai=waktuSelesai;
        this.tahunBooking=tahunBooking;
        this.bulanBooking=bulanBooking;
        this.tanggalBooking=tanggalBooking;
        this.hargaTotal=hargaTotal;

    }

    public Integer getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(Integer hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public Integer getIdRuangan() {
        return idRuangan;
    }

    public Integer getIdUser() {
        return idUser;
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

    public Integer getIdBooking() {
        return idBooking;
    }

    public void setIdRuangan(Integer idRuangan) {
        this.idRuangan = idRuangan;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public void setIdBooking(Integer idBooking) {
        this.idBooking = idBooking;
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
