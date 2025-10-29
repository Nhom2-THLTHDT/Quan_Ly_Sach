package QLSach;

public abstract class Sach 
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
}
public Sach(){
    maSach = "";
    tieuDe = "";
    tacGia = "";
    namXuatBan = 0;
    soLuong = 0;
}
public Sach(String maSach, String tieuDe, string tacGia, int namXuatBan, int soLUong){
    this.maSach = maSach
    this.tieuDe = tieuDe;
    this.tacGia = tacGia;
    this.namXuatBan = namXUatBan;
    this.soLuong = soLuong;

public String getMaSach(){
    return maSach;
}
public void setMaSach(String maSach){
    this.maSach = maSach;
}
public String getTieuDe(){
    return tieuDe;
}  
public void setTieuDe(String tieuDe){
    this.tieuDe = tieuDe;
}
public String getTacGia(){
    return tacGia;
}
public void setTacGia(String tacGia){
    this.tacGia = tacGia;
}
public int getNamXuatBan(){
    return namXuatBan;
}
public void setNamXuatBan(int namXuatBan){
    this.namXuatBan = namXuatBan;
}
public int getSoLuong(){
    return soLuong;
}
public void setSoLuong(int soLuong){
    this.soLuong = soLuong;
}
public String toString(){
    return "Ma sach: " + maSach + ", Tieu de: " + tieuDe + ", Tac gia: " + tacGia + ", Nam xuat ban: " + namXuatBan + ", So luong: " + soLuong;
}
}
