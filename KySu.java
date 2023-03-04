
public class KySu extends CanBo{
     private String nghanhDT;

	public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String SDT, String nghanhDT) {
		super(hoTen, tuoi, gioiTinh, diaChi, SDT);
		this.nghanhDT = nghanhDT;
	}

	public String getNghanhDT() {
		return nghanhDT;
	}

	public void setNghanhDT(String nghanhDT) {
		this.nghanhDT = nghanhDT;
	}

	@Override
	public String toString() {
		return "KySu [nghanhDT=" + nghanhDT + ", getNghanhDT()=" + getNghanhDT() + ", getHoTen()=" + getHoTen()
				+ ", getTuoi()=" + getTuoi() + ", getGioiTinh()=" + getGioiTinh() + ", getDiaChi()=" + getDiaChi()
				+ ", getSDT()=" + getSDT() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
     
	

}
