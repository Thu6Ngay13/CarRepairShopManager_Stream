package mypackage;
import java.util.Collection;
import java.time.LocalDate;

public class HopDong {
	public String HopDongID;
	public String TenHopDong;
	public LocalDate NgayBatDauHopDong;
	public LocalDate NgayKetThucHopDong;
	public double GiaTriHopDong;

	public String XeID;
	public Xe Xe;
	public Collection<PhieuThu> DSPhieuThu_HopDong;

	public HopDong(String hopDongID, String tenHopDong, 
			LocalDate ngayBatDauHopDong, LocalDate ngayKetThucHopDong,
			double giaTriHopDong, String xeID, 
			Xe xe, Collection<PhieuThu> dSPhieuThu_HopDong) {
		HopDongID = hopDongID;
		TenHopDong = tenHopDong;
		NgayBatDauHopDong = ngayBatDauHopDong;
		NgayKetThucHopDong = ngayKetThucHopDong;
		GiaTriHopDong = giaTriHopDong;
		XeID = xeID;
		Xe = xe;
		DSPhieuThu_HopDong = dSPhieuThu_HopDong;
	}

	public String getHopDongID() {
		return HopDongID;
	}

	public void setHopDongID(String hopDongID) {
		HopDongID = hopDongID;
	}

	public String getTenHopDong() {
		return TenHopDong;
	}

	public void setTenHopDong(String tenHopDong) {
		TenHopDong = tenHopDong;
	}

	public LocalDate getNgayBatDauHopDong() {
		return NgayBatDauHopDong;
	}

	public void setNgayBatDauHopDong(LocalDate ngayBatDauHopDong) {
		NgayBatDauHopDong = ngayBatDauHopDong;
	}

	public LocalDate getNgayKetThucHopDong() {
		return NgayKetThucHopDong;
	}

	public void setNgayKetThucHopDong(LocalDate ngayKetThucHopDong) {
		NgayKetThucHopDong = ngayKetThucHopDong;
	}

	public double getGiaTriHopDong() {
		return GiaTriHopDong;
	}

	public void setGiaTriHopDong(double giaTriHopDong) {
		GiaTriHopDong = giaTriHopDong;
	}

	public String getXeID() {
		return XeID;
	}

	public void setXeID(String xeID) {
		XeID = xeID;
	}

	public Xe getXe() {
		return Xe;
	}

	public void setXe(Xe xe) {
		Xe = xe;
	}

	public Collection<PhieuThu> getDSPhieuThu_HopDong() {
		return DSPhieuThu_HopDong;
	}

	public void setDSPhieuThu_HopDong(Collection<PhieuThu> dSPhieuThu_HopDong) {
		DSPhieuThu_HopDong = dSPhieuThu_HopDong;
	}
}
