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
        System.out.println("Chuc vu: Quan ly | He so: " + heSoChucVu + " | Tong luong: " + tinhLuong());
    }
}