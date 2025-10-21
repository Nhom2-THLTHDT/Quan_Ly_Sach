public class SachTieuThuyet extends Sach implements KiemKe {
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, string tieuDe, string tacGia, int namXuatBan, int soLuong, double giaCoBan, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, laSachSeries)
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return getSoLuong() >= soLuongToiThieu;
    }
    
    @Override
    public void capNhatViTri(string viTriMoi){
        System.out.println("Đã chuyển sách \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public string toString() {
        return  "\nSách Tiểu Thuyết: " getTieuDe() +
                "\nTác giả: " + getTacGia() +
                "\nNăm xuất bản: " + getNamXuatBan() +
                "\nGiá cơ bản: " + getGiaCoBan() +
                "\nGiá bán ước tính: " + tinhGiaBan() + " VNĐ";
    }
}