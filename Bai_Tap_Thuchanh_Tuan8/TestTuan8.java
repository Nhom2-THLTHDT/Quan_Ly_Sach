import java.util.Scanner;

public class TestTuan8 {
    public static void main(String[] args) {
        IQuanLySach ql = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String ma1 = sc.nextLine();
                    System.out.print("Nhap tieu de: ");
                    String td1 = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tg1 = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int nam1 = sc.nextInt();
                    System.out.print("Nhap so luong: ");
                    int sl1 = sc.nextInt();
                    System.out.print("Nhap gia co ban: ");
                    double gia1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhap mon hoc: ");
                    String mon = sc.nextLine();
                    System.out.print("Nhap cap do: ");
                    String cap = sc.nextLine();
                    ql.themSach(new SachGiaoTrinh(ma1, td1, tg1, nam1, sl1, gia1, mon, cap));
                    break;

                case 2:
                    System.out.print("Nhap ma sach: ");
                    String ma2 = sc.nextLine();
                    System.out.print("Nhap tieu de: ");
                    String td2 = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tg2 = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int nam2 = sc.nextInt();
                    System.out.print("Nhap so luong: ");
                    int sl2 = sc.nextInt();
                    System.out.print("Nhap gia co ban: ");
                    double gia2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhap the loai: ");
                    String tl = sc.nextLine();
                    System.out.print("La series (true/false): ");
                    boolean ser = sc.nextBoolean();
                    ql.themSach(new SachTieuThuyet(ma2, td2, tg2, nam2, sl2, gia2, tl, ser));
                    break;

                case 3:
                    ql.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach s = ql.timKiemSach(maTim);
                    if (s != null) System.out.println(s);
                    else System.out.println("Khong tim thay sach!");
                    break;

                case 5:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    ql.xoaSach(maXoa);
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
}
