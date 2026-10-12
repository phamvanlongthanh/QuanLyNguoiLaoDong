public class GiangVien extends NguoiLaoDong {
    private int soTietDay;
    private double thongLaoTiet;

    public GiangVien(String hoTen, String maSo, double luongCoBan, int soTietDay, double thongLaoTiet) {
        super(hoTen, maSo, luongCoBan);
        this.soTietDay = soTietDay;
        this.thongLaoTiet = thongLaoTiet;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + (soTietDay * thongLaoTiet);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chức vụ: Giảng viên | Số tiết: " + soTietDay + " | Tổng lương: " + tinhLuong());
    }
}