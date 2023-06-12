package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika edho = new Matematika(4,8);
        
        System.out.println("Hasil Penjumlahan : "+edho.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+edho.setPengurangan());
        System.out.println("Hasil Perkalian : "+edho.setPerkalian());
        System.out.println("Hasil Pembagian : "+edho.setPembagian());
    }
}
