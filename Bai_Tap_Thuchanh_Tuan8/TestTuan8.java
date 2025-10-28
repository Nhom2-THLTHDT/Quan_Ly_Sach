import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach quanLy = new QuanLySachImpl();

        int chon;
        do {
            System.out.println("\n====== MENU QUẢN LÝ SÁCH ======");
            System.out.println("1. Thêm Sách Giáo Trình");
            System.out.println("2. Thêm Sách Tiểu Thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm theo mã");
            System.out.println("5. Xóa sách theo mã");
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

                    quanLy.themSach(new SachGiaoTrinh(ma1, td1, tg1, nam1, sl1, gia1, mh));
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
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    Sach s = quanLy.timKiemSach(maTim);
                    System.out.println(s != null ? s : "Không tìm thấy sách!");
                    break;

                case 5:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    boolean xoa = quanLy.xoaSach(maXoa);
                    if (!xoa) System.out.println("Không tìm thấy sách để xóa!");
                    break;

                case 0:
                    System.out.println("Tạm biệt!");
                    break;
            }
        } while (chon != 0);
        sc.close();
    }
}
