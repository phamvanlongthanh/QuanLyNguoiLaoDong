public class QuanLy extends NguoiLaoDong {
    private double heSoChucVu;

    public QuanLy(String hoTen, String maSo, double luongCoBan, double heSoChucVu) {
        super(hoTen, maSo, luongCoBan);
        this.heSoChucVu = heSoChucVu;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * heSoChucVu;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chức vụ: Quản lý | Hệ số: " + heSoChucVu + " | Tổng lương: " + tinhLuong());
    }
}