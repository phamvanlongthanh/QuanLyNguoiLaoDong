public class NhanVien extends NguoiLaoDong {
    private int soNgayCong;

    public NhanVien(String hoTen, String maSo, double luongCoBan, int soNgayCong) {
        super(hoTen, maSo, luongCoBan);
        this.soNgayCong = soNgayCong;
    }

    @Override
    public double tinhLuong() {
        return (luongCoBan / 26) * soNgayCong;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chuc vu: Nhan vien | Ngay cong: " + soNgayCong + " | Tong luong: " + tinhLuong());
    }
}