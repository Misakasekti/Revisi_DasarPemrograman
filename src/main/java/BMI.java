public class BMI {
    private double beratBadan; // dalam kg
    private double tinggiBadan; // dalam meter
    private String kategori;

    // Konstruktor
    public BMI(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
        this.kategori = hitungKategori(); // Ini mutator
    }

    // Getter dan Setter beratBadan
    public double getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(double beratBadan) {
        this.beratBadan = beratBadan;
        this.kategori = hitungKategori(); 
    }

    // Getter dan Setter tinggiBadan
    public double getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
        this.kategori = hitungKategori(); 
    }

    // Getter kategori
    public String getKategori() {
        return kategori;
    }

    // Method  yang digunagan buat hitung BMInya 
    public double hitungBMI() {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    // Method buat nentuin kategori BMI 
    private String hitungKategori() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            return "Kurus kerontang";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Kelebihan berat badan";
        } else {
            return "Obesitas,diabetes,kolestrol";
        }
    }

 
    public static void main(String[] args) {
        // Contoh dalam pemakaian BMI
        BMI bmi = new BMI(70, 1.75); // Berat 70 kg, Tinggi 1.75 m
        System.out.println("Berat Badan: " + bmi.getBeratBadan() + " kg");
        System.out.println("Tinggi Badan: " + bmi.getTinggiBadan() + " m");
        System.out.println("BMI: " + bmi.hitungBMI());
        System.out.println("Kategori: " + bmi.getKategori());

        // Mengubah berat badan
        bmi.setBeratBadan(85);
        System.out.println("\nSetelah berat diubah:");
        System.out.println("Berat Badan: " + bmi.getBeratBadan() + " kg");
        System.out.println("BMI: " + bmi.hitungBMI());
        System.out.println("Kategori: " + bmi.getKategori());
    }
    }
