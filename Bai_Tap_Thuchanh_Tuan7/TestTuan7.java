public class Test {
    public static void main(string[] args) {
        SachGiaoTrinh sgk = new SachGiaoTrinh("GT01", "Giải tích 1", "Lê Văn Luyện", 2020, 10, 50000);
        SachTieuThuyet tth = new SachTieuThuyet("TT01", "Lập trình hướng đối tượng", "Võ Văn Kiệt", 2015, 5, 69000, true);
        
        QuanLySach q1 = new QuanLySach();
        q1.themSach(sgk);
        q1.themSach(tth);

        System.out.println("=== Danh sách sách ===");
        q1.hienThiTatCa();

        System.out.println("\n=== Kiểm tra giao diện KIỂM KÊ ===");
        KiemKe kiemke = new SachGiaoTrinh("GT02", "Toán cao cấp", "Lê Viết", 2022, 15, 36000);

        System.out.println("Còn đủ tồn ko 100 không? " + (kiemke.kiemTraTonKho(100) ? "Đủ" : "Không đủ"));
        kiemke.capNhatViTri("Kho A1 - Kệ 5");
    }
}