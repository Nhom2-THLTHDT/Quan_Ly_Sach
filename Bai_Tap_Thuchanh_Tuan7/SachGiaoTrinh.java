public class SachGiaoTrinh extends Sach implements KiemKe {
    public SachGiaoTrinh(string maSach, String tieuDe, string tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        super(naSach, tieuDe, tacGia,namXuatBan, soLuong, giaCoBan);
    }

    @Override
    public double tinhGiaBan() {
        int soNam= 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNamXuatBan * 5000);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(string viTriMoi) {
        System.Out.println("Đã chuyển sách \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public string toString() {
        return  "Sách Giáo Trình: " + getTieuDe() +
                "\nTác giả: " + getTacGia() +
                "\nNăm xuất bản: " +getNamXuatBan() +
                "\nGiá cơ bản: " + getGiaCoBan() +
                "\nGiá bán ước tính: " + tinhGiaBan() + " VNĐ";
    }
}