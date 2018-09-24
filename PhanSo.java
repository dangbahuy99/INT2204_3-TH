import java.util.Scanner;

public class PhanSo {
	private int tuSo;
	private int mauSo;

	public PhanSo(int tuSo, int mauSo) {
		super();
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	public static int UCLN(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return UCLN(b,a % b);
        }
    }

	// rut gon
	public void RutGon() {
		int i = UCLN(this.getTuSo(), this.getMauSo());
		this.setTuSo(this.getTuSo() / i);
		this.setMauSo(this.getMauSo() / i);
	}

	public void Cong(PhanSo ps) {
		int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
		int ms = this.getMauSo() * ps.getMauSo();
		PhanSo phansocong = new PhanSo(ts, ms);
		phansocong.rutGonPS();
		System.out.println("Tong = " + phansocong.tuSo + "/" + phansocong.mauSo);
	}

	public void Tru(PhanSo ps) {
		int ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
		int ms = this.getMauSo() * ps.getMauSo();
		PhanSo phansotru = new PhanSo(ts, ms);
		phansotru.rutGonPS();
		if(phansochia.tuSo==0){
			System.out.println("Thuong = 0");
		}
		else{
			System.out.println("Hieu = " + phansotru.tuSo + "/" + phansotru.mauSo);
		}
	}
		

	public void Nhan(PhanSo ps) {
		int ts = this.getTuSo() * ps.getTuSo();
		int ms = this.getMauSo() * ps.getMauSo();
		PhanSo phansonhan = new PhanSo(ts, ms);
		phansonhan.rutGonPS();
		System.out.println("Tich = " + phansonhan.tuSo + "/" + phansonhan.mauSo);
	}

	public void Chia(PhanSo ps) {
		int ts = this.getTuSo() * ps.getMauSo();
		int ms = this.getMauSo() * ps.getTuSo();
		PhanSo phansochia = new PhanSo(ts, ms);
		phansochia.rutGonPS();
		if(phansochia.tuSo==1&&phansochia.mauSo==1){
			System.out.println("Thuong = 1");
		}
		else{
			System.out.println("Thuong = " + phansochia.tuSo + "/" + phansochia.mauSo);
		}
	}

	// so sanh 2 phan so
	public boolean equals(PhanSo ps) {
		if (this.getTuSo() == ps.getTuSo() && this.getMauSo() == ps.getMauSo()) {
			System.out.println("It's true");
			return true;
		} else {
			System.out.println("It's false");
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap tu 1 :");
		int ts1 = scanner.nextInt();
		System.out.print("Nhap mau 1 :");
		int ms1 = scanner.nextInt();
		System.out.print("Nhap tu 2 :");
		int ts2 = scanner.nextInt();
		System.out.print("Nhap mau 2 :");
		int ms2 = scanner.nextInt();
		System.out.println("-------------------------");
		PhanSo ps1 = new PhanSo(ts1, ms1);
		PhanSo ps2 = new PhanSo(ts2, ms2);

		// xác thực mẫu số của phân số hợp lệ
		if (ms1 == 0 && ms2 == 0) {
			System.out.println("Mau khong hop le");
		} else {
			System.out.println("Phan so da nhap : " + ps1.getTuSo() + "/" + ps1.getMauSo() + " và " + ps2.getTuSo()
					+ "/" + ps2.getMauSo());
			ps1.RutGon();
			ps2.RutGon();
			System.out.println("rút gon la : " + ps1.getTuSo() + "/" + ps1.getMauSo() + " và " + ps2.getTuSo() + "/"
					+ ps2.getMauSo());
			ps1.Cong(ps2);
			ps1.Tru(ps2);
			ps1.Nhan(ps2);
			ps1.Chia(ps2);
			ps1.equals(ps2);
		}

	}
}