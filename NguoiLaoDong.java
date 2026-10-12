public class NguoiLaoDong {
    protected String hoTen;
    protected String maSo;
    protected double luongCoBan;

    public NguoiLaoDong() {}

    public NguoiLaoDong(String hoTen, String maSo, double luongCoBan) {
        this.hoTen = hoTen;
        this.maSo = maSo;
        this.luongCoBan = luongCoBan;
    }

    public void hienThiThongTin() {
        System.out.println("Ma so: " + maSo + " | Ho ten: " + hoTen + " | Luong CB: " + luongCoBan);
    }

    public double tinhLuong() {
        return luongCoBan;
    }
}