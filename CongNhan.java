
public class CongNhan extends CanBo {
	private String trinhDo;

	public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, String SDT, String trinhDo) {
		super(hoTen, tuoi, gioiTinh, diaChi, SDT);
		this.trinhDo = trinhDo;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	@Override
	public String toString() {
		return "CongNhan [trinhDo=" + trinhDo + ", getTrinhDo()=" + getTrinhDo() + ", getHoTen()=" + getHoTen()
				+ ", getTuoi()=" + getTuoi() + ", getGioiTinh()=" + getGioiTinh() + ", getDiaChi()=" + getDiaChi()
				+ ", getSDT()=" + getSDT() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
