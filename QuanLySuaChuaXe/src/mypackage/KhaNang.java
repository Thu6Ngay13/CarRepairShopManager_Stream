package mypackage;

public class KhaNang {
	public String ThoID;
	public String CongViecID;

	public Tho Tho;
	public CongViec CongViec;

	public KhaNang(String thoID, String congViecID, 
			Tho tho, CongViec congViec) {
		ThoID = thoID;
		CongViecID = congViecID;
		Tho = tho;
		CongViec = congViec;
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
}
