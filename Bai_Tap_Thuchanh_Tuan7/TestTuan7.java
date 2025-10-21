public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();
        Sach s1 = new SachGiaoTrinh("GT01", "Giải Tích 1", 2020, 50000, "Toán", "Đại học");
        Sach s2 = new SachGiaoTrinh("GT02", "Lập Trình C", 2018, 60000, "CNTT", "Cao đẳng");
        Sach s3 = new SachTieuThuyet("TT01", "Harry Potter", 2015, 80000, "Phiêu lưu", true);
        Sach s4 = new SachTieuThuyet("TT02", "Dế Mèn Phiêu Lưu Ký", 2021, 40000, "Thiếu nhi", false);
        ql.themSach(s1);
        ql.themSach(s2);
        ql.themSach(s3);
        ql.themSach(s4);
        System.out.println("=== DANH SÁCH SÁCH BAN ĐẦU ===");
        ql.hienThiDanhSach();
        System.out.println("\n=== TÌM KIẾM SÁCH 'TT01' ===");
        Sach tim = ql.timKiem("TT01");
        if (tim != null) System.out.println(tim);
        else System.out.println("Không tìm thấy.");
        System.out.println("\n=== CẬP NHẬT TÊN SÁCH 'GT02' ===");
        ql.capNhatSach("GT02", "Lập Trình Java Cơ Bản");
        ql.hienThiDanhSach();
        System.out.println("\n=== XÓA SÁCH 'GT01' ===");
        ql.xoaSach("GT01");
        ql.hienThiDanhSach();
    }
}

