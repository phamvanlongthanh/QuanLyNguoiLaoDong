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
        System.out.println("Chức vụ: Nhân viên | Ngày công: " + soNgayCong + " | Tổng lương: " + tinhLuong());
    }
}