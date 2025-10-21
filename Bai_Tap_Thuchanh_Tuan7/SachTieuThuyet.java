public class SachTieuThuyet extends Sach{
    private String theLoai;
    private boolean laSachserie;
}
public SachTieuThuyet(){
    super();
    theLoai = "";
    laSachserie = false;
}
public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachserie){
    super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
    this.theLoai = theLoai;
    this.laSachserie = laSachserie;
}
public String gettheLoai(){
    return theLoai;
}
public void settheLoai(){
    this.theLoai = theLoai;
}
public boolean getlaSachserie(){
    return laSachserie;
}
public void setlaSachserie(){
    this.laSachserie = laSachserie;
}
@override
public double tinhGiaBan(){
    return giaCoBan + (laSachSeries ? 15000 : 0);
}
@Override
public String toString (){
    return super.toString() + ", Thể loại: " + theLoai + ", Là sách series: " + laSachserie + ", Tính giá bán: " + tinhGiaBan();
}

