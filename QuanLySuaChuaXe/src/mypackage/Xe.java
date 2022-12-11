package mypackage;
import java.util.Collection;

public class Xe {
	public String XeID;
	public ELoaiXe LoaiXe;
	public EHangXe HangXe;

	public String KhachHangID;
	public KhachHang KhachHang;
	public Collection<HopDong> DSHopDong_Xe;

	public Xe(String xeID, ELoaiXe loaiXe, 
			EHangXe hangXe, String khachHangID, 
			KhachHang khachHang, Collection<HopDong> dSHopDong_Xe) {
		XeID = xeID;
		LoaiXe = loaiXe;
		HangXe = hangXe;
		KhachHangID = khachHangID;
		KhachHang = khachHang;
		DSHopDong_Xe = dSHopDong_Xe;
	}

	public String getXeID() {
		return XeID;
	}

	public void setXeID(String xeID) {
		XeID = xeID;
	}

	public ELoaiXe getLoaiXe() {
		return LoaiXe;
	}

	public void setLoaiXe(ELoaiXe loaiXe) {
		LoaiXe = loaiXe;
	}

	public EHangXe getHangXe() {
		return HangXe;
	}

	public void setHangXe(EHangXe hangXe) {
		HangXe = hangXe;
	}

	public String getKhachHangID() {
		return KhachHangID;
	}

	public void setKhachHangID(String khachHangID) {
		KhachHangID = khachHangID;
	}

	public KhachHang getKhachHang() {
		return KhachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		KhachHang = khachHang;
	}

	public Collection<HopDong> getDSHopDong_Xe() {
		return DSHopDong_Xe;
	}

	public void setDSHopDong_Xe(Collection<HopDong> dSHopDong_Xe) {
		DSHopDong_Xe = dSHopDong_Xe;
	}
}
