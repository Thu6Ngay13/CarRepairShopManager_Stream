package mypackage;
import java.util.Collection;

public class NhomTho {
	public String NhomThoID;
	public String TenNhom;

	public String TruongNhomID;
	public Tho TruongNhom;
	public Collection<Tho> DSTho_Nhom;

	public NhomTho(String nhomThoID, String tenNhom, 
			String truongNhomID, Tho truongNhom, 
			Collection<Tho> dSTho_Nhom) {
		NhomThoID = nhomThoID;
		TenNhom = tenNhom;
		TruongNhomID = truongNhomID;
		TruongNhom = truongNhom;
		DSTho_Nhom = dSTho_Nhom;
	}

	public String getNhomThoID() {
		return NhomThoID;
	}

	public void setNhomThoID(String nhomThoID) {
		NhomThoID = nhomThoID;
	}

	public String getTenNhom() {
		return TenNhom;
	}

	public void setTenNhom(String tenNhom) {
		TenNhom = tenNhom;
	}

	public String getTruongNhomID() {
		return TruongNhomID;
	}

	public void setTruongNhomID(String truongNhomID) {
		TruongNhomID = truongNhomID;
	}

	public Tho getTruongNhom() {
		return TruongNhom;
	}

	public void setTruongNhom(Tho truongNhom) {
		TruongNhom = truongNhom;
	}

	public Collection<Tho> getDSTho_Nhom() {
		return DSTho_Nhom;
	}

	public void setDSTho_Nhom(Collection<Tho> dSTho_Nhom) {
		DSTho_Nhom = dSTho_Nhom;
	}
}
