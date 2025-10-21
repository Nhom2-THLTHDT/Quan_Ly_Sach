import java.util.Scanner;
public class SachGiaoTrinh extends Sach{
    private String monhoc;
    private String capDo;
}
public SachGiaoTrinh(){ 
    super();
    monhoc();
    capDO();
}
public SachGiaoTrinh(String mSach, String tieuDe , String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monhoc, String capDo){
    this.monhoc = monhoc;
    this.capDo = capDo;
}
public String getmonhoc(){
    return monhoc;
}
puclic void setmonhoc(){
    this.monhoc = monhoc;
}
public String getcapDo(){
    return capDo;
}
public void setCapDo(){
    this.capDo = capDo;
}
@override
public String toString(){
    return: "Môn học:"+ monhoc ",Cấp độ:" + capDo;
}
@Override
public double tinhGiaBan(){
    return giaCoBan + (2025 - namXuatBan) * 5000;
}
@Override
public String toString (){
    return super.toString() + ", Môn học: " + monhoc + ", Cấp độ: " + capDo ", tinhGiaBan:" + tinhGiaBan();
}
