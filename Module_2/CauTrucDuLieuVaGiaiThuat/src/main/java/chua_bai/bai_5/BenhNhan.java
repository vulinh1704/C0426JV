package chua_bai.bai_5;

public class BenhNhan implements Comparable<BenhNhan> {
    private String ten;
    private boolean uuTien;

    public BenhNhan(String ten, boolean uuTien) {
        this.ten = ten;
        this.uuTien = uuTien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isUuTien() {
        return uuTien;
    }

    public void setUuTien(boolean uuTien) {
        this.uuTien = uuTien;
    }

    @Override
    public int compareTo(BenhNhan o) {
        return Boolean.compare(o.uuTien, this.uuTien);
    }

    @Override
    public String toString() {
        return "BenhNhan{" +
                "ten='" + ten + '\'' +
                ", uuTien=" + uuTien +
                '}';
    }
}
