public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan * 1.1; // loi nhuan 10%
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
               "\nMon hoc: " + monHoc +
               "\nCap do: " + capDo +
               "\nGia ban: " + tinhGiaBan();
    }
}
