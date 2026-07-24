public class HinhChuNhat {
    int chieuDai;
    int chieuRong;

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    int layDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    int layChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }
}
