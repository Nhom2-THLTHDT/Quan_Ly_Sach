public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                          String theLoai, boolean laSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSeries = laSeries;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan * (laSeries ? 1.15 : 1.05);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach '" + tieuDe + "' den khu vuc: " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nThe loai: " + theLoai +
               "\nLa series: " + (laSeries ? "Co" : "Khong") +
               "\nGia ban: " + tinhGiaBan();
    }
}
