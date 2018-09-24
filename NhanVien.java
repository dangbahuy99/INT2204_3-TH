public class Nhanvien {
	private String ten;
	private int tuoi;
	private String noiCongTac;
	private String monGiangDay;

	public Nhanvien(String ten, int tuoi, String noiCongTac, String monGiangDay) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.noiCongTac = noiCongTac;
		this.monGiangDay = monGiangDay;
	}

	public GiaoVien() {
		super();
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getNoiCongTac() {
		return noiCongTac;
	}

	public void setNoiCongTac(String noiCongTac) {
		this.noiCongTac = noiCongTac;
	}

	public String getMonGiangDay() {
		return monGiangDay;
	}

	public void setMonGiangDay(String monGiangDay) {
		this.monGiangDay = monGiangDay;
	}
	
	public void dayHoc() {
		//code
	}
	

}