package mypackage;
import java.time.LocalDate;

public class Tho {
	public String ThoID;
    public String HoTenTho;
    public LocalDate NgaySinhTho;
    public EGioiTinh GioiTinhTho;
    public String DiaChiTho;  
    public double LuongTho;

    public String NhomThoID;
    public NhomTho NhomTho;
    
	public Tho(String thoID, String hoTenTho, 
			LocalDate ngaySinhTho, EGioiTinh gioiTinhTho, 
			String diaChiTho, double luongTho, 
			String nhomThoID, mypackage.NhomTho nhomTho) {
		super();
		ThoID = thoID;
		HoTenTho = hoTenTho;
		NgaySinhTho = ngaySinhTho;
		GioiTinhTho = gioiTinhTho;
		DiaChiTho = diaChiTho;
		LuongTho = luongTho;
		NhomThoID = nhomThoID;
		NhomTho = nhomTho;
	}
	
	public String getThoID() {
		return ThoID;
	}
	public void setThoID(String thoID) {
		ThoID = thoID;
	}
	public String getHoTenTho() {
		return HoTenTho;
	}
	public void setHoTenTho(String hoTenTho) {
		HoTenTho = hoTenTho;
	}
	public LocalDate getNgaySinhTho() {
		return NgaySinhTho;
	}
	public void setNgaySinhTho(LocalDate ngaySinhTho) {
		NgaySinhTho = ngaySinhTho;
	}
	public EGioiTinh getGioiTinhTho() {
		return GioiTinhTho;
	}
	public void setGioiTinhTho(EGioiTinh gioiTinhTho) {
		GioiTinhTho = gioiTinhTho;
	}
	public String getDiaChiTho() {
		return DiaChiTho;
	}
	public void setDiaChiTho(String diaChiTho) {
		DiaChiTho = diaChiTho;
	}
	public double getLuongTho() {
		return LuongTho;
	}
	public void setLuongTho(double luongTho) {
		LuongTho = luongTho;
	}
	public String getNhomThoID() {
		return NhomThoID;
	}
	public void setNhomThoID(String nhomThoID) {
		NhomThoID = nhomThoID;
	}
	public NhomTho getNhomTho() {
		return NhomTho;
	}
	public void setNhomTho(NhomTho nhomTho) {
		NhomTho = nhomTho;
	}
}
