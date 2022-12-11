package mypackage;
import java.util.Collection;

public class NhomCongViec {
	public String NhomCongViecID;
	public String TenNhomCongViec;

	public Collection<CongViec> DSCongViec_Nhom;

	public NhomCongViec(String nhomCongViecID, String tenNhomCongViec, 
			Collection<CongViec> dSCongViec_Nhom) {
		NhomCongViecID = nhomCongViecID;
		TenNhomCongViec = tenNhomCongViec;
		DSCongViec_Nhom = dSCongViec_Nhom;
	}

	public String getNhomCongViecID() {
		return NhomCongViecID;
	}

	public void setNhomCongViecID(String nhomCongViecID) {
		NhomCongViecID = nhomCongViecID;
	}

	public String getTenNhomCongViec() {
		return TenNhomCongViec;
	}

	public void setTenNhomCongViec(String tenNhomCongViec) {
		TenNhomCongViec = tenNhomCongViec;
	}

	public Collection<CongViec> getDSCongViec_Nhom() {
		return DSCongViec_Nhom;
	}

	public void setDSCongViec_Nhom(Collection<CongViec> dSCongViec_Nhom) {
		DSCongViec_Nhom = dSCongViec_Nhom;
	}
	
	
}
