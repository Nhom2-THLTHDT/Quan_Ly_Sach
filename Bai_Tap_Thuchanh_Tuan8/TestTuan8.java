package Bai_Tap_Thuchanh_Tuan8;
import java.util.Scanner;

public class TestTuan8 {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Xóa sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhập mã sách: ");
                    String ma1 = sc.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String td1 = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tg1 = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int nam1 = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int sl1 = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double gia1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Môn học: ");
                    String mh = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String cd = sc.nextLine();
                    quanLy.themSach(new SachGiaoTrinh(ma1, td1, tg1, nam1, sl1, gia1, mh, cd));
                    break;

                case 2:
                    System.out.print("Nhập mã sách: ");
                    String ma2 = sc.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String td2 = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tg2 = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int nam2 = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int sl2 = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double gia2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Thể loại: ");
                    String tl = sc.nextLine();
                    System.out.print("Là series? (true/false): ");
                    boolean series = sc.nextBoolean();
                    quanLy.themSach(new SachTieuThuyet(ma2, td2, tg2, nam2, sl2, gia2, tl, series));
                    break;

                case 3:
                    quanLy.hienThiDanhSach();
                    break;

                case 4:
                    sc.nextLine(); // tránh lỗi trôi dòng
                    System.out.print("Nhập tiêu đề cần tìm: ");
                    String tkiem = sc.nextLine();
                    Sach kq = quanLy.timKiemSach(tkiem);
                    if (kq != null) System.out.println(kq);
                    else System.out.println(" Không tìm thấy!");
                    break;

                case 5:
                    System.out.print("Nhập tiêu đề cần xóa: ");
                    String xoa = sc.nextLine();
                    quanLy.xoaSach(xoa);
                    break;

                case 0:
                    System.out.println(" Thoát chương trình!");
                    break;

                default:
                    System.out.println(" Lựa chọn không hợp lệ.");
            }
        } while (chon != 0);

        sc.close();
    }
}
