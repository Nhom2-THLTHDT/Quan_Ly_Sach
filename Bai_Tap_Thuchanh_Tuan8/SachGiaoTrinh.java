public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
                         int soLuong, double giaCoBan, String monHoc) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
    }

    @Override
    public double tinhGiaBan() {
        int soNamXuatBan = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNamXuatBan * 5000);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "[SÁCH GIÁO TRÌNH]\n" + super.toString() +
               "\nMôn học: " + monHoc +
               "\nGiá bán: " + tinhGiaBan() + " VNĐ";
    }
}
