package hitung;

public class Matematika {
    //membuat variabel
    private double bil1, bil2;
    
    //membuat constructor
    public Matematika (double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //membuat Method Penjumlahan
    public double setPenjumlahan(){
        return bil1 + bil2;
    }
    
    //membuat Method Pengurangan
    public double setPengurangan(){
        return bil1 - bil2;
    }
    
    //membuat Method Perkalian
    public double setPerkalian(){
        return bil1 * bil2;
    }
    
    //membuat Method Pembagian
    public double setPembagian(){
        return bil1 / bil2;
    }
}
