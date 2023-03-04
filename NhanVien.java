
public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String SDT, String congViec) {
		super(hoTen, tuoi, gioiTinh, diaChi, SDT);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	@Override
	public String toString() {
		return "NhanVien [congViec=" + congViec + ", getCongViec()=" + getCongViec() + ", getHoTen()=" + getHoTen()
				+ ", getTuoi()=" + getTuoi() + ", getGioiTinh()=" + getGioiTinh() + ", getDiaChi()=" + getDiaChi()
				+ ", getSDT()=" + getSDT() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
