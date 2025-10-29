package Bai_Tap_Thuchanh_Tuan8;
import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();
    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("Đã thêm: " + sach.gettieuDe());
    }
    @Override
    public Sach timKiemSach(String tieuDe) {
        for (Sach s : danhSach) {
            if (s.gettieuDe().equalsIgnoreCase(tieuDe)) {
                return s;
            }
        }
        return null;
    }
    @Override
    public void xoaSach(String tieuDe) {
        Sach sach = timKiemSach(tieuDe);
        if (sach != null) {
            danhSach.remove(sach);
            System.out.println(" Đã xóa sách: " + tieuDe);
        } else {
            System.out.println("Không tìm thấy sách để xóa.");
        }
    }
    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println(" Danh sách rỗng!");
            return;
        }
        System.out.println(" DANH SÁCH SÁCH:");
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}
