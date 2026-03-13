import java.util.Arrays;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;
    private String prodi;
    private AmbilMK[] ambilMK;

    public Mahasiswa(String nim, String nama, int noKelas) {
        setNim(nim);
        this.nama = nama;
        setKelas(noKelas);
        this.ambilMK = new AmbilMK[0]; // Assuming a maximum of 10 courses
    }

    // Getters and setters for all private fields
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if(nim.startsWith("10301")){
            prodi = "IF";
        }else if(nim.startsWith("10302")){
            prodi = "SE";
        }else if (nim.startsWith("10303")) {
            prodi = "IT";
        }else if (nim.startsWith("10304")) {
            prodi = "DS";
        }else{
            prodi = "Prodi tidak diketahui";
        }
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(int noKelas) {
        int x = Integer.parseInt(nim.substring(5, 7)) + 24;
        this.kelas = prodi + "-" + x + "-" + (String.format("%02d", noKelas));
    }

    public String getProdi() {
        return prodi;
    }

    public void tambahMK(AmbilMK mk) {
        this.ambilMK = Arrays.copyOf(this.ambilMK, this.ambilMK.length + 1);
        this.ambilMK[this.ambilMK.length - 1] = mk;
    }

    public double hitungIPK(String tahunAjaran) {
        double IPK = 0;
        int sks = 0;

        for (AmbilMK mk : this.ambilMK) {
            if (mk != null && mk.getTahunAjaran().equals(tahunAjaran)){
                sks += mk.getMataKuliah().getSks();
                switch (mk.getNilai()) {
                    case "A":
                        IPK += 4.0 * mk.getMataKuliah().getSks();
                        break;
                    case "AB":
                        IPK += 3.5 * mk.getMataKuliah().getSks();
                        break;
                    case "B":
                        IPK += 3.0 * mk.getMataKuliah().getSks();
                        break;
                    case "BC":
                        IPK += 2.5 * mk.getMataKuliah().getSks();
                        break;
                    case "C":
                        IPK += 2.0 * mk.getMataKuliah().getSks();
                        break;
                    case "D":
                        IPK += 1.0 * mk.getMataKuliah().getSks();
                        break;}
            }
        }
        return Math.round((IPK / sks) * 100.0) / 100.0; // Round to 2 decimal places
    }

}
