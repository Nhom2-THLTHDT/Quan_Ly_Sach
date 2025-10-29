package Bai_Tap_Thuchanh_Tuan8;
import Bai_Tap_Thuchanh_Tuan8.IGiaBan;
import Bai_Tap_Thuchanh_Tuan8.IKiemKe;
import java.util.Scanner;
public abstract class Sach implements IGiaBan, IKiemKe {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatban;
    protected int soLuong;
    protected double giaCoBan;
    Scanner sc = new Scanner(System.in);
}
public Sach(){

}
public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan){
    this.maSach = maSach;
    this.tieuDe = tieuDe;
    this.tacGia = tacGia;
    this.namXuatBan = namXuatBan;
    this.soLuong = soLuong;
    this.giaCoBan = giaCoBan;
}
public String getmaSach(){
    return maSach;
}
public void setMaSach(){
    this.maSach = maSach;
}
public String gettieuDe(){
    return tieuDe;
}
public void setTieuDe(){
    this.tieuDe = tieuDe;
}
public String gettacGia(){
    return tacGia;
}
public void setTacGia(){
    this.tacGia = tacGia;
}
public int setNamXuatBan(){
    return namXuatBan;
}
public void setNamXuatBan(){
    this.namXuatBan = namXuatBan;
}
public int getSoLuong(){
    return soLuong;
}
public void setSoLuong(){
    this.soLuong = soLuong;
}
public double getgiaCoBan(){
    return giaCoBan;
}
puplic void setgiaCoBan(){
    this.giaCoBan = giaCoBan;
}
@Override
public boolean KiemKeTonKho(int SoLuongToiThieu){
    return soLuong >= SoLuongToiThieu;
}
@Override
public void CapNhatViTri(String vitriMoi){
    System.out.println("Đã chuyển sách ["+maSach+"] " + vitriMoi);
}
@Override
public double GiaBan(){
    return giaCoBan;
}
@Override
public String toString(){
    return "Mã Sách: " + maSach + ", Tiêu Đề: " + tieuDe + ", Tác Giả: " + tacGia + ", Năm Xuất Bản: " + namXuatBan + ", Số Lượng: " + soLuong + ", Giá Cơ Bản: " + giaCoBan;   
}
