package mypackage;

public class ChiTietHopDong {
	public String ThoID;
	public String CongViecID;
	public String HopDongID;

	public Tho Tho;
	public CongViec CongViec;
	public HopDong HopDong;

	public ChiTietHopDong(String thoID, String congViecID, 
			String hopDongID, Tho tho, 
			CongViec congViec, HopDong hopDong) {
		ThoID = thoID;
		CongViecID = congViecID;
		HopDongID = hopDongID;
		Tho = tho;
		CongViec = congViec;
		HopDong = hopDong;
	}

	public String getThoID() {
		return ThoID;
	}

	public void setThoID(String thoID) {
		ThoID = thoID;
	}

	public String getCongViecID() {
		return CongViecID;
	}

	public void setCongViecID(String congViecID) {
		CongViecID = congViecID;
	}

	public String getHopDongID() {
		return HopDongID;
	}

	public void setHopDongID(String hopDongID) {
		HopDongID = hopDongID;
	}

	public Tho getTho() {
		return Tho;
	}

	public void setTho(Tho tho) {
		Tho = tho;
	}

	public CongViec getCongViec() {
		return CongViec;
	}

	public void setCongViec(CongViec congViec) {
		CongViec = congViec;
	}

	public HopDong getHopDong() {
		return HopDong;
	}

	public void setHopDong(HopDong hopDong) {
		HopDong = hopDong;
	}
}
