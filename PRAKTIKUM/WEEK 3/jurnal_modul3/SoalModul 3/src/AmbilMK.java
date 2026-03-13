public class AmbilMK {
    private MataKuliah mataKuliah;
    private String tahunAjaran;
    private String nilai;


    public AmbilMK(MataKuliah mataKuliah, String nilai, String tahunAjaran) {
        this.mataKuliah = mataKuliah;
        this.tahunAjaran = tahunAjaran;
        this.nilai = nilai;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getNilai() {
        return nilai;
    }
}
