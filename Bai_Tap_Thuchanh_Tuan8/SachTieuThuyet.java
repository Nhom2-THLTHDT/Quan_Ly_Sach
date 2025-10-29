package Bai_Tap_Thuchanh_Tuan8;

public class SachTieuThuyet extends Sach {
    private String theloai;
    private boolean laSachserie;
}
public SachTieuThuyet(){
    super();
    theloai="";
    laSachserie=false;
}
public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theloai, boolean laSachserie){
    super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
    this.theloai = theloai;
    this.laSachserie = laSachserie;
}
public String gettheloai(){
    return theloai;
}
public void settheloai(){
    this.theloai = theloai;
}
public boolean getlaSachserie(){
    return laSachserie;
}
public void setlaSachserie(){
    this.laSachserie = laSachserie;
}
@Override
public double GiaBan(){
    return giaCoBan;
}

@Override
public boolean KiemKeTonKho(int SoLuongToiThieu){
    return soLuong >= SoLuongToiThieu;
}
public void CapNhatViTri(String vitriMoi){
    System.out.println("Đã chuyển sách tiêu đề["+maSach+"]: " + vitriMoi);
}
@Override
public String toString (){
    return super.toString() + ", Thể loại: " + theloai + ", LaSachSeries: " + laSachserie + ", Giá bán: " + GiaBan();
}
