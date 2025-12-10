public class SachService {

    public boolean suaSach(Sach sach) {
        if (sach.getMaSach() == null || sach.getMaSach().trim().isEmpty() ||
                sach.getTenSach() == null || sach.getTenSach().trim().isEmpty() ||
                sach.getTacGia() == null || sach.getTacGia().trim().isEmpty()) {
            return false;
        }
        int namXB = sach.getNamXuatBan();
        if (namXB >= 1990 && namXB <= 2025) {
            return true;
        } else {
            return false;
        }
    }
}