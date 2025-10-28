import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
        System.out.println(">> Đã thêm sách: " + s.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println(">> Đã xóa sách có mã: " + maSach);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("\n=== DANH SÁCH SÁCH ===");
        for (Sach s : danhSach) {
            System.out.println(s);
            System.out.println("----------------------------");
        }
    }
}
