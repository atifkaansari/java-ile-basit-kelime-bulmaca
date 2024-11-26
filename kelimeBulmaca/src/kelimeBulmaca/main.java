package kelimeBulmaca;
import java.util.*;

public class main {
    public static void main(String[] args) {
        String[] kelimeler = {"JAVA", "PYTHON", "ALGORITMA", "DIZI", "YAZILIM", 
                              "KOD", "JAVADEVELOPER", "PROGRAM", "TASARIM", "YAPI"};
        
        Random rand = new Random();
        int dogruTahminSayisi = 0;
        int toplamKelimeSayisi = kelimeler.length;

        List<String> sorulanKelimeler = new ArrayList<>();

        for (int i = 0; i < kelimeler.length; i++) {
            String secilenKelime;
            do {
                secilenKelime = kelimeler[rand.nextInt(kelimeler.length)];
            } while (sorulanKelimeler.contains(secilenKelime)); 
            
            sorulanKelimeler.add(secilenKelime);

            List<Character> harfler = new ArrayList<>();
            for (char c : secilenKelime.toCharArray()) {
                harfler.add(c);
            }
            Collections.shuffle(harfler);

            StringBuilder karisikKelime = new StringBuilder();
            for (char c : harfler) {
                karisikKelime.append(c);
            }

            System.out.println("Tahmin Edilen Kelime: " + karisikKelime);
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Kelimeyi tahmin edin: ");
            String kullaniciTahmini = scanner.nextLine();

            if (kullaniciTahmini.equalsIgnoreCase(secilenKelime)) {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                dogruTahminSayisi++;
            } else {
                System.out.println("Yanlış tahmin! Doğru cevap: " + secilenKelime);
            }
            System.out.println("Şu ana kadar doğru tahmin sayısı: " + dogruTahminSayisi + "/" + (i + 1));
            if (i == kelimeler.length - 1) {
                System.out.println("\nSonuçlar:");
                System.out.println("Doğru tahmin sayısı: " + dogruTahminSayisi + "/10");

                if (dogruTahminSayisi == 10) {
                    System.out.println("Tebrikler, 10/10! Kazandınız!");
                } else if (dogruTahminSayisi >= 7) {
                    System.out.println("Başarılı! 7/10 geliştirilebilir.");
                } else if (dogruTahminSayisi >= 5) {
                    System.out.println("Başarısız! 5/10.");
                } else {
                    System.out.println("Başarısız! Daha çok çalışmalısınız.");
                }
            }
        }
    }
}
