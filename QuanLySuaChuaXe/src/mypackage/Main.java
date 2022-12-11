package mypackage;
import java.io.Console;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	/*------------------------------Table--------------------------------*/

	public static ArrayList<NhomTho> DSNhomTho = 
			new ArrayList<NhomTho>();
	public static ArrayList<Tho> DSTho = 
			new ArrayList<Tho>();
	

	public static ArrayList<NhomCongViec> DSNhomCongViec = 
			new ArrayList<NhomCongViec>();
	public static ArrayList<CongViec> DSCongViec = 
			new ArrayList<CongViec>();
	

	public static ArrayList<KhachHang> DSKhachHang = 
			new ArrayList<KhachHang>();
	public static ArrayList<Xe> DSXe = 
			new ArrayList<Xe>();
	public static ArrayList<HopDong> DSHopDong = 
			new ArrayList<HopDong>();
	public static ArrayList<PhieuThu> DSPhieuThu = 
			new ArrayList<PhieuThu>();
	

	public static ArrayList<KhaNang> DSKhaNang = 
			new ArrayList<KhaNang>();
	public static ArrayList<ChiTietHopDong> DSChiTietHopDong = 
			new ArrayList<ChiTietHopDong>();

	/*------------------------------Data---------------------------------*/

	public static void TaoDanhSachNhomTho() {
		DSNhomTho.add(new NhomTho("NT01", "Nhóm số 1", "", 
				null, new ArrayList<Tho>()));
		DSNhomTho.add(new NhomTho("NT02", "Nhóm số 2", "", 
				null, new ArrayList<Tho>()));
		DSNhomTho.add(new NhomTho("NT03", "Nhóm số 3", "", 
				null, new ArrayList<Tho>()));
	}

	public static void TaoDanhSachTho() {
		DSTho.add(new Tho("T01", "Nguyễn Văn Đức", 
				LocalDate.of(1998, 8, 8), 
				EGioiTinh.Nam, "Quận 9", 3400,
				DSNhomTho.get(0).NhomThoID, DSNhomTho.get(0)));
		DSTho.add(new Tho("T02", "Lê Xuân Hùng", 
				LocalDate.of(1999, 9, 9), 
				EGioiTinh.Nam, "Quận 8", 1900,
				DSNhomTho.get(0).NhomThoID, DSNhomTho.get(0)));
		DSTho.add(new Tho("T03", "Vũ Trọng Dũng", 
				LocalDate.of(2000, 1, 1), 
				EGioiTinh.Nam, "Quận 7", 1600,
				DSNhomTho.get(0).NhomThoID, DSNhomTho.get(0)));

		DSNhomTho.get(0).TruongNhomID = DSTho.get(0).ThoID;
		DSNhomTho.get(0).TruongNhom = DSTho.get(0);
		DSNhomTho.get(0).DSTho_Nhom.add(DSTho.get(0));
		DSNhomTho.get(0).DSTho_Nhom.add(DSTho.get(1));
		DSNhomTho.get(0).DSTho_Nhom.add(DSTho.get(2));

		DSTho.add(new Tho("T04", "Hoàng Anh Tài", 
				LocalDate.of(2000, 4, 4), 
				EGioiTinh.Nam, "Quận 6", 2600,
				DSNhomTho.get(1).NhomThoID, DSNhomTho.get(1)));
		DSTho.add(new Tho("T05", "Lê Đức Dũng", 
				LocalDate.of(1996, 6, 6), 
				EGioiTinh.Nam, "Quận 5", 2600,
				DSNhomTho.get(1).NhomThoID, DSNhomTho.get(1)));
		DSTho.add(new Tho("T06", "Trần Trọng Mạnh", 
				LocalDate.of(2002, 2, 2), 
				EGioiTinh.Nam, "Quận 4", 1600,
				DSNhomTho.get(1).NhomThoID, DSNhomTho.get(1)));

		DSNhomTho.get(1).TruongNhomID = DSTho.get(3).ThoID;
		DSNhomTho.get(1).TruongNhom = DSTho.get(3);
		DSNhomTho.get(1).DSTho_Nhom.add(DSTho.get(3));
		DSNhomTho.get(1).DSTho_Nhom.add(DSTho.get(4));
		DSNhomTho.get(1).DSTho_Nhom.add(DSTho.get(5));

		DSTho.add(new Tho("T07", "Võ Tấn Sơn", 
				LocalDate.of(2003, 3, 3), 
				EGioiTinh.Nam, "Quận 3", 2600,
				DSNhomTho.get(2).NhomThoID, DSNhomTho.get(2)));
		DSTho.add(new Tho("T08", "Nguyễn Anh Tài", 
				LocalDate.of(1997, 7, 7), 
				EGioiTinh.Nam, "Quận 2", 1700,
				DSNhomTho.get(2).NhomThoID, DSNhomTho.get(2)));
		DSTho.add(new Tho("T09", "Lưu Viết Vũ", 
				LocalDate.of(1995, 5, 5), 
				EGioiTinh.Nam, "Quận 1", 2500,
				DSNhomTho.get(2).NhomThoID, DSNhomTho.get(2)));

		DSNhomTho.get(2).TruongNhomID = DSTho.get(6).ThoID;
		DSNhomTho.get(2).TruongNhom = DSTho.get(6);
		DSNhomTho.get(2).DSTho_Nhom.add(DSTho.get(6));
		DSNhomTho.get(2).DSTho_Nhom.add(DSTho.get(7));
		DSNhomTho.get(2).DSTho_Nhom.add(DSTho.get(8));
	}

	public static void TaoDanhSachNhomCongViec() {
		DSNhomCongViec.add(
				new NhomCongViec("NCV01", 
						"Nhóm công việc bảo dưỡng, bảo trì và sữa chữa", 
						new ArrayList<CongViec>()));
		DSNhomCongViec.add(
				new NhomCongViec("NCV02", 
						"Nhóm công việc thiết kế, chế tạo và lắp đặt", 
						new ArrayList<CongViec>()));
	}

	public static void TaoDanhSachCongViec() {
		DSCongViec.add(new CongViec("CV01", 
				"Bảo dưỡng, bảo trì và sữa chữa chữa động cơ",
				DSNhomCongViec.get(0).NhomCongViecID, DSNhomCongViec.get(0)));
		DSCongViec.add(new CongViec("CV02", 
				"Bảo dưỡng, bảo trì và sữa chữa nội thất, phụ tùng",
				DSNhomCongViec.get(0).NhomCongViecID, DSNhomCongViec.get(0)));
		DSCongViec.add(new CongViec("CV03", 
				"Thiết kế và nâng cấp động cơ", 
				DSNhomCongViec.get(1).NhomCongViecID,DSNhomCongViec.get(1)));
		DSCongViec.add(new CongViec("CV04", 
				"Thiết kế, chế tạo và lắp đặt nội thất, phụ tùng",
				DSNhomCongViec.get(1).NhomCongViecID, DSNhomCongViec.get(1)));
	}

	public static void TaoDanhSachKhachHang() {
		DSKhachHang.add(new KhachHang("KH01", "Dương Mai Xuân", 
				LocalDate.of(1978, 3, 18), EGioiTinh.Nu,
				"0999888777", new ArrayList<Xe>()));
		DSKhachHang.add(new KhachHang("KH02", "Hoàng Hùng Dũng", 
				LocalDate.of(1988, 9, 27), EGioiTinh.Nam,
				"0888777666", new ArrayList<Xe>()));
		DSKhachHang.add(new KhachHang("KH03", "Triệu Lệ Mai", 
				LocalDate.of(1988, 12, 12), EGioiTinh.Nu,
				"0666555444", new ArrayList<Xe>()));
	}

	public static void TaoDanhSachXe() {
		DSXe.add(new Xe("X01", ELoaiXe.Motorbike, 
				EHangXe.Yamaha, "KH01", DSKhachHang.get(0), 
				new ArrayList<HopDong>()));
		DSXe.add(new Xe("X02", ELoaiXe.Car, 
				EHangXe.Toyota, "KH01", DSKhachHang.get(0), 
				new ArrayList<HopDong>()));

		DSKhachHang.get(0).DSXe_KhachHang.add(DSXe.get(0));
		DSKhachHang.get(0).DSXe_KhachHang.add(DSXe.get(1));

		DSXe.add(new Xe("X03", ELoaiXe.Motorbike, 
				EHangXe.Honda, "KH02", DSKhachHang.get(1), 
				new ArrayList<HopDong>()));
		DSXe.add(new Xe("X04", ELoaiXe.Motorbike, 
				EHangXe.Kawasaki, "KH02", DSKhachHang.get(1), 
				new ArrayList<HopDong>()));
		DSXe.add(new Xe("X05", ELoaiXe.Car, 
				EHangXe.SYM, "KH02", DSKhachHang.get(1), 
				new ArrayList<HopDong>()));

		DSKhachHang.get(1).DSXe_KhachHang.add(DSXe.get(2));
		DSKhachHang.get(1).DSXe_KhachHang.add(DSXe.get(3));
		DSKhachHang.get(1).DSXe_KhachHang.add(DSXe.get(4));

		DSXe.add(new Xe("X06", ELoaiXe.Motorbike, 
				EHangXe.Suzuki, "KH03", DSKhachHang.get(2), 
				new ArrayList<HopDong>()));

		DSKhachHang.get(2).DSXe_KhachHang.add(DSXe.get(5));
	}

	public static void TaoDanhSachHopDong() {
		DSHopDong.add(new HopDong("HD01", 
				"Hợp đồng bảo trì và sữa chữa động cơ", 
				LocalDate.of(2022, 1, 1),
				LocalDate.of(2022, 7, 1), 
				5000, "X01", DSXe.get(0), 
				new ArrayList<PhieuThu>()));

		DSXe.get(0).DSHopDong_Xe.add(DSHopDong.get(0));

		DSHopDong.add(new HopDong("HD02", 
				"Hợp đồng bảo dưỡng và sữa chữa nội thất", 
				LocalDate.of(2022, 2, 1),
				LocalDate.of(2022, 8, 1), 
				4000, "X02", DSXe.get(1), 
				new ArrayList<PhieuThu>()));
		DSHopDong.add(new HopDong("HD03", 
				"Hợp đồng thiết kế và nâng cấp động cơ, thiết và nâng cấp nội thất",
				LocalDate.of(2022, 2, 1), 
				LocalDate.of(2022, 8, 1), 
				8000, "X02", DSXe.get(1),
				new ArrayList<PhieuThu>()));

		DSXe.get(1).DSHopDong_Xe.add(DSHopDong.get(1));
		DSXe.get(1).DSHopDong_Xe.add(DSHopDong.get(2));

		DSHopDong.add(new HopDong("HD04", 
				"Hợp đồng thiết kế và nâng cấp động cơ", 
				LocalDate.of(2022, 3, 1),
				LocalDate.of(2022, 9, 1), 
				4500, "X03", DSXe.get(2), 
				new ArrayList<PhieuThu>()));

		DSXe.get(2).DSHopDong_Xe.add(DSHopDong.get(3));

		DSHopDong.add(new HopDong("HD05", 
				"Hợp đồng bảo dưỡng và nâng cấp nội thất", 
				LocalDate.of(2022, 4, 1),
				LocalDate.of(2022, 10, 1), 
				7500, "X04", DSXe.get(3), 
				new ArrayList<PhieuThu>()));

		DSXe.get(3).DSHopDong_Xe.add(DSHopDong.get(4));

		DSHopDong.add(new HopDong("HD06", 
				"Hợp đồng bảo trì và sữa chữa phụ tùng", 
				LocalDate.of(2022, 5, 1),
				LocalDate.of(2022, 11, 1), 
				4000, "X05", DSXe.get(4), 
				new ArrayList<PhieuThu>()));

		DSXe.get(4).DSHopDong_Xe.add(DSHopDong.get(5));

		DSHopDong.add(new HopDong("HD07", 
				"Hợp đồng thiết kế và nâng cấp động cơ", 
				LocalDate.of(2022, 6, 1),
				LocalDate.of(2022, 12, 1), 
				4500, "X06", DSXe.get(5), 
				new ArrayList<PhieuThu>()));
		DSHopDong.add(new HopDong("HD08", 
				"Hợp đồng bảo trì sữa chữa, "
				+ "thiết kế và nâng cấp và lắp nội thất",
				LocalDate.of(2022, 7, 1), 
				LocalDate.of(2023, 1, 1), 
				7500, "X06", DSXe.get(5),
				new ArrayList<PhieuThu>()));
		DSHopDong.add(new HopDong("HD09", 
				"Hợp đồng bảo trì và sữa chữa động cơ, "
				+ "thiết kế, nâng cấp và lắp đặt phụ tùng",
				LocalDate.of(2022, 8, 1), 
				LocalDate.of(2023, 2, 1), 
				8500, "X06", DSXe.get(5),
				new ArrayList<PhieuThu>()));

		DSXe.get(5).DSHopDong_Xe.add(DSHopDong.get(6));
		DSXe.get(5).DSHopDong_Xe.add(DSHopDong.get(7));
		DSXe.get(5).DSHopDong_Xe.add(DSHopDong.get(8));

	}

	public static void TaoDanhSachPhieuThu() {
		DSPhieuThu.add(new PhieuThu("PT01", "Dương Xuân Mai", 
				"Nguyễn Phương Ngọc", LocalDate.of(2022, 1, 1),
				1000, "HD01", DSHopDong.get(0)));
		DSPhieuThu.add(new PhieuThu("PT02", "Trần Cẩm Ánh", 
				"Nguyễn Hồng Nhung", LocalDate.of(2022, 2, 22),
				3000, "HD01", DSHopDong.get(0)));

		DSHopDong.get(0).DSPhieuThu_HopDong.add(DSPhieuThu.get(0));
		DSHopDong.get(0).DSPhieuThu_HopDong.add(DSPhieuThu.get(1));

		DSPhieuThu.add(new PhieuThu("PT03", "Dương Xuân Mai", 
				"Mai Thảo Hương", LocalDate.of(2022, 2, 1), 
				4000, "HD02", DSHopDong.get(1)));

		DSHopDong.get(1).DSPhieuThu_HopDong.add(DSPhieuThu.get(2));

		DSPhieuThu.add(new PhieuThu("PT04", "Dương Xuân Mai", 
				"Nguyễn Phương Ngọc", LocalDate.of(2022, 2, 1),
				3000, "HD03", DSHopDong.get(2)));
		DSPhieuThu.add(new PhieuThu("PT05", "Triệu Lệ Mai", 
				"Mai Thảo Hương", LocalDate.of(2022, 3, 5), 
				500, "HD03", DSHopDong.get(2)));
		DSPhieuThu.add(new PhieuThu("PT06", "Đỗ Mỹ Duyên", 
				"Nguyễn Hồng Nhung", LocalDate.of(2022, 3, 25),
				1000, "HD03", DSHopDong.get(2)));
		DSPhieuThu.add(new PhieuThu("PT07", "Triệu Lệ Mai", 
				"Mai Thảo Hương", LocalDate.of(2022, 4, 7), 
				2500, "HD03", DSHopDong.get(2)));

		DSHopDong.get(2).DSPhieuThu_HopDong.add(DSPhieuThu.get(3));
		DSHopDong.get(2).DSPhieuThu_HopDong.add(DSPhieuThu.get(4));
		DSHopDong.get(2).DSPhieuThu_HopDong.add(DSPhieuThu.get(5));
		DSHopDong.get(2).DSPhieuThu_HopDong.add(DSPhieuThu.get(6));

		DSPhieuThu.add(new PhieuThu("PT08", "Hoàng Hùng Dũng", 
				"Nguyễn Phương Ngọc", LocalDate.of(2022, 3, 1),
				4500, "HD04", DSHopDong.get(3)));

		DSHopDong.get(3).DSPhieuThu_HopDong.add(DSPhieuThu.get(7));

		DSPhieuThu.add(new PhieuThu("PT09", "Hoàng Hùng Dũng", 
				"Mai Thảo Hương", LocalDate.of(2022, 4, 1),
				4000, "HD05", DSHopDong.get(4)));
		DSPhieuThu.add(new PhieuThu("PT10", "Vũ Đình Huế", 
				"Nguyễn Hồng Nhung", LocalDate.of(2022, 7, 23),
				3500, "HD05", DSHopDong.get(4)));

		DSHopDong.get(4).DSPhieuThu_HopDong.add(DSPhieuThu.get(8));
		DSHopDong.get(4).DSPhieuThu_HopDong.add(DSPhieuThu.get(9));

		DSPhieuThu.add(new PhieuThu("PT11", "Hoàng Hùng Dũng", 
				"Mai Thảo Hương", LocalDate.of(2022, 5, 1),
				4000, "HD06", DSHopDong.get(5)));

		DSHopDong.get(5).DSPhieuThu_HopDong.add(DSPhieuThu.get(10));

		DSPhieuThu.add(new PhieuThu("PT12", "Triệu Lệ Mai", 
				"Mai Thảo Hương", LocalDate.of(2022, 6, 1), 
				4500, "HD07", DSHopDong.get(6)));

		DSHopDong.get(6).DSPhieuThu_HopDong.add(DSPhieuThu.get(11));

		DSPhieuThu.add(new PhieuThu("PT13", "Triệu Lệ Mai", 
				"Nguyễn Phương Ngọc", LocalDate.of(2022, 7, 1),
				3500, "HD08", DSHopDong.get(7)));
		DSPhieuThu.add(new PhieuThu("PT14", "Triệu Lệ Mai", 
				"Mai Thảo Hương", LocalDate.of(2022, 8, 19), 
				2500, "HD08", DSHopDong.get(7)));
		DSPhieuThu.add(new PhieuThu("PT15", "Võ Sương Kim", 
				"Nguyễn Hồng Nhung", LocalDate.of(2022, 11, 8),
				1500, "HD08", DSHopDong.get(7)));

		DSHopDong.get(7).DSPhieuThu_HopDong.add(DSPhieuThu.get(12));
		DSHopDong.get(7).DSPhieuThu_HopDong.add(DSPhieuThu.get(13));
		DSHopDong.get(7).DSPhieuThu_HopDong.add(DSPhieuThu.get(14));

		DSPhieuThu.add(new PhieuThu("PT16", "Triệu Lệ Mai", 
				"Nguyễn Hồng Nhung", LocalDate.of(2022, 8, 1),
				5500, "HD09", DSHopDong.get(8)));
		DSPhieuThu.add(new PhieuThu("PT17", "Võ Sương Kim", 
				"Nguyễn Hồng Nhung", LocalDate.of(2023, 1, 24),
				2500, "HD09", DSHopDong.get(8)));
		DSPhieuThu.add(new PhieuThu("PT18", "Trần Bá Phong", 
				"Nguyễn Hồng Nhung", LocalDate.of(2023, 2, 1),
				500, "HD09", DSHopDong.get(8)));

		DSHopDong.get(8).DSPhieuThu_HopDong.add(DSPhieuThu.get(15));
		DSHopDong.get(8).DSPhieuThu_HopDong.add(DSPhieuThu.get(16));
		DSHopDong.get(8).DSPhieuThu_HopDong.add(DSPhieuThu.get(17));
	}

	public static void TaoDanhSachKhaNang() {
		DSKhaNang.add(new KhaNang("T01", "CV1", 
				DSTho.get(0), DSCongViec.get(0)));
		DSKhaNang.add(new KhaNang("T01", "CV2", 
				DSTho.get(0), DSCongViec.get(1)));
		DSKhaNang.add(new KhaNang("T02", "CV3", 
				DSTho.get(1), DSCongViec.get(2)));
		DSKhaNang.add(new KhaNang("T03", "CV4", 
				DSTho.get(2), DSCongViec.get(3)));
		DSKhaNang.add(new KhaNang("T04", "CV1", 
				DSTho.get(3), DSCongViec.get(0)));
		DSKhaNang.add(new KhaNang("T05", "CV2", 
				DSTho.get(4), DSCongViec.get(1)));
		DSKhaNang.add(new KhaNang("T06", "CV3", 
				DSTho.get(5), DSCongViec.get(2)));
		DSKhaNang.add(new KhaNang("T06", "CV4", 
				DSTho.get(5), DSCongViec.get(3)));
		DSKhaNang.add(new KhaNang("T07", "CV1", 
				DSTho.get(6), DSCongViec.get(0)));
		DSKhaNang.add(new KhaNang("T08", "CV2", 
				DSTho.get(7), DSCongViec.get(1)));
		DSKhaNang.add(new KhaNang("T08", "CV3", 
				DSTho.get(7), DSCongViec.get(2)));
		DSKhaNang.add(new KhaNang("T09", "CV4", 
				DSTho.get(8), DSCongViec.get(3)));

	}

	public static void TaoDanhSachChiTietHopDong() {
		DSChiTietHopDong.add(new ChiTietHopDong("T01", "CV01", "HD01", 
				DSTho.get(0), DSCongViec.get(0), DSHopDong.get(0)));
		DSChiTietHopDong.add(new ChiTietHopDong("T08", "CV02", "HD02", 
				DSTho.get(7), DSCongViec.get(1), DSHopDong.get(1)));
		DSChiTietHopDong.add(new ChiTietHopDong("T02", "CV03", "HD03", 
				DSTho.get(1), DSCongViec.get(2), DSHopDong.get(2)));
		DSChiTietHopDong.add(new ChiTietHopDong("T06", "CV04", "HD03", 
				DSTho.get(5), DSCongViec.get(3), DSHopDong.get(2)));
		DSChiTietHopDong.add(new ChiTietHopDong("T08", "CV03", "HD04", 
				DSTho.get(7), DSCongViec.get(2), DSHopDong.get(3)));
		DSChiTietHopDong.add(new ChiTietHopDong("T05", "CV02", "HD05", 
				DSTho.get(4), DSCongViec.get(1), DSHopDong.get(4)));
		DSChiTietHopDong.add(new ChiTietHopDong("T09", "CV04", "HD05", 
				DSTho.get(8), DSCongViec.get(3), DSHopDong.get(4)));
		DSChiTietHopDong.add(new ChiTietHopDong("T01", "CV02", "HD06", 
				DSTho.get(0), DSCongViec.get(1), DSHopDong.get(5)));
		DSChiTietHopDong.add(new ChiTietHopDong("T02", "CV03", "HD07", 
				DSTho.get(1), DSCongViec.get(2), DSHopDong.get(6)));
		DSChiTietHopDong.add(new ChiTietHopDong("T04", "CV02", "HD08", 
				DSTho.get(3), DSCongViec.get(1), DSHopDong.get(7)));
		DSChiTietHopDong.add(new ChiTietHopDong("T03", "CV04", "HD08", 
				DSTho.get(2), DSCongViec.get(3), DSHopDong.get(7)));
		DSChiTietHopDong.add(new ChiTietHopDong("T07", "CV01", "HD09", 
				DSTho.get(6), DSCongViec.get(0), DSHopDong.get(8)));
		DSChiTietHopDong.add(new ChiTietHopDong("T03", "CV04", "HD09", 
				DSTho.get(2), DSCongViec.get(3), DSHopDong.get(8)));
	}

    /*------------------------------Query--------------------------------*/
	
	public static void Cau1() {
		/*
		 * 1. Lấy ra tổng số lương 
		 * mà ông chủ phải trả cho thợ
		 * */
		
		DoubleSummaryStatistics tongluong = DSTho
				.stream()
				.collect(Collectors.summarizingDouble(Tho::getLuongTho));
		
		System.out.println(tongluong.getSum());
	}
	
	public static void Cau2() {
		/*
		 * 2. Hãy cho biết thông tin 
		 * của các khách hàng 
		 * đến sữa chữa và nâng cấp 
		 * và sắp xếp theo độ tuổi tăng dần
		 * */
		
		List<KhachHang> list = DSKhachHang
				.stream()
				.collect(Collectors.toList());
		Collections.sort(list, new Comparator<KhachHang>() {
			@Override
			public int compare(KhachHang o1, KhachHang o2) {
				int Age1 = LocalDate.now().getYear() - o1.NgaySinh.getYear();
				int Age2 = LocalDate.now().getYear() - o2.NgaySinh.getYear();
				return Age2 - Age1;
			}
			
		});
		
		for(KhachHang khachhang : list) {
			System.out.println(String.format("ID khách hàng: " +
					khachhang.getKhachHangID()));
			System.out.println(String.format("\t Họ tên khách hàng: " + 
					khachhang.getHoTenKhachHang()));
			System.out.println(String.format("\t Giới tính khách hàng: " + 
					khachhang.getGioiTinhKhachHang()));
			System.out.println(String.format("\t Tuổi khách hàng: " + 
					(LocalDate.now().getYear() - khachhang.getNgaySinh().getYear())));
			System.out.println(String.format("\t Số điện thoại khách hàng: " +  
					khachhang.getKhachHangID()));
		}
	}
	
	public static void Cau3() {
		/*
		 * 3. Hãy cho biết ID, Tên, giá trị 
		 * của hợp đồng 
		 * có giá trị > 5000
		 * và sắp xếp giá trị hợp đồng giảm dần
		 * */
		
		List<HopDong> list = DSHopDong
				.stream()
				.filter(hopdong -> hopdong.getGiaTriHopDong() > 5000)
				.collect(Collectors.toList());
		Collections.sort(list, new Comparator<HopDong>() {
					@Override
					public int compare(HopDong o1, HopDong o2) {
						if(o1.getGiaTriHopDong() < o2.getGiaTriHopDong())
							return -1;
						if(o1.getGiaTriHopDong() == o2.getGiaTriHopDong())
							return 0;
						return 1;
					}
				});
		
		for(HopDong hd : list) {
			System.out.println(String.format("ID hợp đồng: " + 
					hd.getHopDongID()));
			System.out.println(String.format("\t Tên Hợp đồng: " + 
					hd.getTenHopDong()));
			System.out.println(String.format("\t Giá trị hợp đồng: " + 
					hd.getGiaTriHopDong()));
		}
	}
	
	public static void Cau4() {
		/*
		 * 4. Vì tính chất công việc 
		 * ông chủ muốn lập email cho thợ của mình
		 * theo ID 
		 * theo mẫu sau
		 * ví dụ: ID: T10
		 * có email là: T10@qlscx.com
		 * hãy xuất ra danh sách email của nhân viên
		 * */
		
		List<String> list = DSTho
				.stream()
				.map(tho -> {
					return tho.getThoID() + "@qlscx.com";					
				})
				.collect(Collectors.toList());
		
		for(String email : list)
			System.out.println(email);
	}
	
	public static void Cau5() {
		/*
		 * 5. Lấy ra thông tin 
		 * của khách hàng
		 * và danh sách xe 
		 * đang có 1 hay nhiều hợp đồng thực hiện công việc sữa chữa
		 * */
		
		Map<KhachHang, List<Xe>> map = DSXe
				.stream()
				.filter(xe -> {
					for(HopDong hopdong : xe.getDSHopDong_Xe()) 
						if(hopdong.getTenHopDong().contains("sữa chữa"))
							return true;
					return false;
				})
				.collect(Collectors.groupingBy(Xe::getKhachHang, Collectors.toList()));
		
		for(Map.Entry<KhachHang, List<Xe>> m : map.entrySet()) {
			System.out.println(String.format("ID khách hàng: " +
					m.getKey().getKhachHangID()));
			System.out.println(String.format("\t Họ tên khách hàng: " +  
					m.getKey().getHoTenKhachHang()));
			System.out.println(String.format("\t Giới tính khách hàng: " +  
					m.getKey().getGioiTinhKhachHang()));
			System.out.println(String.format("\t Tuổi khách hàng: " +
					(LocalDate.now().getYear() - m.getKey().getNgaySinh().getYear())));
			System.out.println(String.format("\t Số điện thoại khách hàng: " +  
					m.getKey().getKhachHangID()));
			for(Xe x : m.getValue()) {
				System.out.println(String.format("\t\t ID Xe: " + 
						x.getXeID()));
				System.out.println(String.format("\t\t\t Loại xe: " + 
						x.getLoaiXe()));
				System.out.println(String.format("\t\t\t Hãng xe: " + 
						x.getHangXe()));
			}
		}
	}
	
    /*------------------------------Main--------------------------------*/
	public static void main(String[] args) {
		
		TaoDanhSachNhomTho();
		TaoDanhSachTho();
		
		TaoDanhSachNhomCongViec();
		TaoDanhSachCongViec();
		
		TaoDanhSachKhachHang();
		TaoDanhSachXe();
		TaoDanhSachHopDong();
		TaoDanhSachPhieuThu();
		
		TaoDanhSachKhaNang();
		TaoDanhSachChiTietHopDong();
		
		Cau1();
//		Cau2();
//		Cau3();
//		Cau4();
//		Cau5();
	}
}
