package latihan3_2310010524;

public class Rumus {
    // Faisal 2310010524 4B Reg Pagi

    int sisi;
    int panjang;
    int lebar;
    int hasil;

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void setPanjangLebar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungLuasPersegi() {
        return sisi * sisi;
    }

    public int hitungLuasPersegiPanjang() {
        return panjang * lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }
    
}