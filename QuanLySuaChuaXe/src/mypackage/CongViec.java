package mypackage;

public class CongViec {
	public String CongViecID;
	public String TenCongViec;

	public String NhomCongViecID;
	public NhomCongViec NhomCongViec;

	public CongViec(String congViecID, String tenCongViec, 
			String nhomCongViecID, NhomCongViec nhomCongViec) {
		CongViecID = congViecID;
		TenCongViec = tenCongViec;
		NhomCongViecID = nhomCongViecID;
		NhomCongViec = nhomCongViec;
	}

	public String getCongViecID() {
		return CongViecID;
	}

	public void setCongViecID(String congViecID) {
		CongViecID = congViecID;
	}

	public String getTenCongViec() {
		return TenCongViec;
	}

	public void setTenCongViec(String tenCongViec) {
		TenCongViec = tenCongViec;
	}

	public String getNhomCongViecID() {
		return NhomCongViecID;
	}

	public void setNhomCongViecID(String nhomCongViecID) {
		NhomCongViecID = nhomCongViecID;
	}

	public NhomCongViec getNhomCongViec() {
		return NhomCongViec;
	}

	public void setNhomCongViec(NhomCongViec nhomCongViec) {
		NhomCongViec = nhomCongViec;
	}
}
