package anky.ntu.edu.AndroidProgram.baith8_tuychinhlv;

public class MonAn {
    private String ten;
    private double donGia;
    private String moTa;
    private int AndDaiDien;

    public MonAn(String ten, double donGia, int andDaiDien, String moTa) {
        this.ten = ten;
        this.donGia = donGia;
        AndDaiDien = andDaiDien;
        this.moTa = moTa;
    }

    public String getTen() {
        return ten;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public int getAndDaiDien() {
        return AndDaiDien;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setAndDaiDien(int andDaiDien) {
        AndDaiDien = andDaiDien;
    }
}
