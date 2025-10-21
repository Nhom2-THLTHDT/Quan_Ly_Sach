public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tao doi tuong sach giao trinh va tieu thuyet
        Sach s1 = new SachGiaoTrinh("GT01", "Dai So Tuyen Tinh", 2021, 75000, "Toan cao cap", "Dai hoc");
        Sach s2 = new SachGiaoTrinh("GT02", "Co So Du Lieu", 2023, 90000, "Cong nghe thong tin", "Cao dang");
        Sach s3 = new SachTieuThuyet("TT01", "To Kill a Mockingbird", 1960, 120000, "Tam ly xa hoi", false);
        Sach s4 = new SachTieuThuyet("TT02", "Sherlock Holmes", 1892, 95000, "Trinh tham", true);

        // Them sach vao danh sach
        ql.themSach(s1);
        ql.themSach(s2);
        ql.themSach(s3);
        ql.themSach(s4);

        // Hien thi danh sach ban dau
        System.out.println("=== DANH SACH SACH BAN DAU ===");
        ql.hienThiDanhSach();

        // Tim sach
        System.out.println("\n=== TIM KIEM SACH 'TT01' ===");
        Sach tim = ql.timKiem("TT01");
        if (tim != null)
            System.out.println(tim);
        else
            System.out.println("Khong tim thay.");

        // Cap nhat sach
        System.out.println("\n=== CAP NHAT TEN SACH 'GT02' ===");
        ql.capNhatSach("GT02", "Lap Trinh Huong Doi Tuong Nang Cao");
        ql.hienThiDanhSach();

        // Xoa sach
        System.out.println("\n=== XOA SACH 'GT01' ===");
        ql.xoaSach("GT01");
        ql.hienThiDanhSach();
    }
}


