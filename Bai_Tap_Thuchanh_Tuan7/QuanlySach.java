import java.util.ArrayList;
public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }
    public void themSach(Sach s) {
        danhSach.add(s);
    }
    public boolean xoaSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.remove(s);
                return true;
            }
        }
        return false;
    }
    public boolean capNhatSach(String maSach, String tenMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setTenSach(tenMoi);
                return true;
            }
        }
        return false;
    }
    public Sach timKiem(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách rỗng.");
        } else {
            for (Sach s : danhSach) {
                System.out.println(s.toString());
            }
        }
    }
}

