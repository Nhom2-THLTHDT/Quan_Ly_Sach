package Bai_Tap_Thuchanh_Tuan8;
import java.util.Scanner;

public class SachGiaoTrinh extends Sach{
    private String monhoc;
    private String capdo;
}
public SachGiaoTrinh(){
    super();
    monhoc = "";
    capdo = "";
}
public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monhoc, String capdo){
    super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
    this.monhoc = monhoc;
    this.capdo = capdo;
}
public String getmonhoc(){
    return monhoc;
}
public void setmonhoc(){
    this.monhoc = monhoc;
}
public String getcapdo(){
    return capdo;
}
public void setcapdo(){
    this.capdo = capdo;
}
@override
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
    return super.toString() + ", Môn học: " + monhoc + ", Cấp độ: " + capdo + ", Giá bán: " + GiaBan();
}
