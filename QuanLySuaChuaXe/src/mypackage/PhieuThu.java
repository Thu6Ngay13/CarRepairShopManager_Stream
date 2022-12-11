package mypackage;
import java.time.LocalDate;

public class PhieuThu {
	public String PhieuThuID;
	public String HoTenNguoiNopPhieuThu;
	public String HoTenNguoiThuPhieuThu;
	public LocalDate NgayThuPhieuThu;
	public double SoTienThuPhieuThu;

	public String HopDongID;
	public HopDong HopDong;

	public PhieuThu(String phieuThuID, String hoTenNguoiNopPhieuThu, 
			String hoTenNguoiThuPhieuThu, LocalDate ngayThuPhieuThu,
			double soTienThuPhieuThu, String hopDongID, 
			HopDong hopDong) {
		PhieuThuID = phieuThuID;
		HoTenNguoiNopPhieuThu = hoTenNguoiNopPhieuThu;
		HoTenNguoiThuPhieuThu = hoTenNguoiThuPhieuThu;
		NgayThuPhieuThu = ngayThuPhieuThu;
		SoTienThuPhieuThu = soTienThuPhieuThu;
		HopDongID = hopDongID;
		HopDong = hopDong;
	}

	public String getPhieuThuID() {
		return PhieuThuID;
	}

	public void setPhieuThuID(String phieuThuID) {
		PhieuThuID = phieuThuID;
	}

	public String getHoTenNguoiNopPhieuThu() {
		return HoTenNguoiNopPhieuThu;
	}

	public void setHoTenNguoiNopPhieuThu(String hoTenNguoiNopPhieuThu) {
		HoTenNguoiNopPhieuThu = hoTenNguoiNopPhieuThu;
	}

	public String getHoTenNguoiThuPhieuThu() {
		return HoTenNguoiThuPhieuThu;
	}

	public void setHoTenNguoiThuPhieuThu(String hoTenNguoiThuPhieuThu) {
		HoTenNguoiThuPhieuThu = hoTenNguoiThuPhieuThu;
	}

	public LocalDate getNgayThuPhieuThu() {
		return NgayThuPhieuThu;
	}

	public void setNgayThuPhieuThu(LocalDate ngayThuPhieuThu) {
		NgayThuPhieuThu = ngayThuPhieuThu;
	}

	public double getSoTienThuPhieuThu() {
		return SoTienThuPhieuThu;
	}

	public void setSoTienThuPhieuThu(double soTienThuPhieuThu) {
		SoTienThuPhieuThu = soTienThuPhieuThu;
	}

	public String getHopDongID() {
		return HopDongID;
	}

	public void setHopDongID(String hopDongID) {
		HopDongID = hopDongID;
	}

	public HopDong getHopDong() {
		return HopDong;
	}

	public void setHopDong(HopDong hopDong) {
		HopDong = hopDong;
	}
}
