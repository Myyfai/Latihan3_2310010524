package latihan3_2310010524;
public class RumusBeraksi {
    public class Latihan3_2310010524 {

    public static void main(String[] args) {
        Rumus faisal = new Rumus();

        faisal.setSisi(7);

        System.out.println("Luas Persegi dengan sisi 7: " + faisal.hitungLuasPersegi());

        faisal.setPanjangLebar(10, 6);

        System.out.println("Luas Persegi Panjang (10 x 6): " + faisal.hitungLuasPersegiPanjang());
    }
}
}
