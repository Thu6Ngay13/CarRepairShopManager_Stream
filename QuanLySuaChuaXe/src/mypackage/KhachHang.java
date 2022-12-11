package mypackage;
import java.util.Collection;
import java.time.LocalDate;

public class KhachHang {
	public String KhachHangID;
	public String HoTenKhachHang;
	public LocalDate NgaySinh;
	public EGioiTinh GioiTinhKhachHang;
	public String SoDienThoaiKhachHang;

	public Collection<Xe> DSXe_KhachHang;

	public KhachHang(String khachHangID, String hoTenKhachHang, 
			LocalDate ngaySinh, EGioiTinh gioiTinhKhachHang,
			String soDienThoaiKhachHang, Collection<Xe> dSXe_KhachHang) {
		KhachHangID = khachHangID;
		HoTenKhachHang = hoTenKhachHang;
		NgaySinh = ngaySinh;
		GioiTinhKhachHang = gioiTinhKhachHang;
		SoDienThoaiKhachHang = soDienThoaiKhachHang;
		DSXe_KhachHang = dSXe_KhachHang;
	}

	public String getKhachHangID() {
		return KhachHangID;
	}

	public void setKhachHangID(String khachHangID) {
		KhachHangID = khachHangID;
	}

	public String getHoTenKhachHang() {
		return HoTenKhachHang;
	}

	public void setHoTenKhachHang(String hoTenKhachHang) {
		HoTenKhachHang = hoTenKhachHang;
	}

	public LocalDate getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public EGioiTinh getGioiTinhKhachHang() {
		return GioiTinhKhachHang;
	}

	public void setGioiTinhKhachHang(EGioiTinh gioiTinhKhachHang) {
		GioiTinhKhachHang = gioiTinhKhachHang;
	}

	public String getSoDienThoaiKhachHang() {
		return SoDienThoaiKhachHang;
	}

	public void setSoDienThoaiKhachHang(String soDienThoaiKhachHang) {
		SoDienThoaiKhachHang = soDienThoaiKhachHang;
	}

	public Collection<Xe> getDSXe_KhachHang() {
		return DSXe_KhachHang;
	}

	public void setDSXe_KhachHang(Collection<Xe> dSXe_KhachHang) {
		DSXe_KhachHang = dSXe_KhachHang;
	}
}
