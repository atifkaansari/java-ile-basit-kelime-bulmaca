import java.util.*;

public class main {
	public static void main(String[]args) {
		String[] kelimeler = {"RENK", "BOYUT", "YAZILIMDİLİ", "JAVA", "BİLGİSAYAR",
				"MODEM", "İSTANBUL", "ANKARA", "ARABA", "MERCEDES", 
				"VOLVO", "KEDİ", "KÖPEK", "YAZICI", "FOTOKOPİ", 
			    "TELEVİZYON", "KAMERA", "BİLGİ", "İNTERNET", "YAZILIM", 
			    "PROGRAM", "BİLİM", "MATEMATİK", "FİZİK", "DÜNYA", 
			    "GÜNEŞ", "UZAY", "YERKÜRE", "KÜTÜPHANE", "UNIVERSİTE",
			    "BİLİŞİM", "BİLGİSEL", "FİLOZOFA", "KİTAP", "TARİH", 
			    "FİLM", "MÜZİK", "TİYATRO", "BİYOKİMYA", "PSİKOLOJİ", 
			    "DOKTOR", "MÜHENDİS", "AVM", "KAFETERYA", "OCAK", 
			    "YAZ", "KIŞ", "YAZAR", "SİNEMA", "KAPALI", 
			    "AÇIK", "DOĞA", "BİSİKLET", "OTOBÜS", "VAPUR", 
			    "PARK", "SOKAK", "ÇAMUR", "ÇİÇEK", "AY", 
			    "YILDIZ", "KAR", "FIRTINA", "SAVAŞ", "PAZAR", 
			    "CUMARTESİ", "HAFTA", "GÜN", "KURUM", "KÜLTÜR", 
			    "EĞİTİM", "TATİL", "İŞ", "ZAMAN", "KAZANÇ", 
			    "YEMEK", "BÖLGE", "BİRİM", "PİZZA", "MANTI", 
			    "KARNIYARIK", "YAZLIK", "KÖY", "ŞEHİR", "KAPALI", 
			    "AÇIK", "HAVUZ", "SAHİL", "HAVA", "YOL", 
			    "KARŞI", "DÜZEN", "BÜRO", "OTEL", "MEKAN", 
			    "SAĞLIK", "YARDIM", "TIBBİ", "İLAÇ", "KONSER"
			};
		Random rand = new Random();
		int dogruTahminSayisi = 0 ;
		int toplamKelimeSayisi = kelimeler.length;
		List<String> sorulanKelimeler=new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			String secilenKelime;
			do {
				secilenKelime = kelimeler[rand.nextInt(kelimeler.length)];
			}while(sorulanKelimeler.contains(secilenKelime));
			
			sorulanKelimeler.add(secilenKelime);
			List<Character>harfler=new ArrayList<>();
			for(char c : secilenKelime.toCharArray()) {
				harfler.add(c);
			}
			Collections.shuffle(harfler);
			
			StringBuilder karisikKelime = new StringBuilder();
			for(char c : harfler) {
				karisikKelime.append(c);
			}
			Scanner scan = new Scanner(System.in);
			System.out.println("Tahmin Edilecek Kelime : "+karisikKelime);
			String kullaniciTahmini = scan.nextLine();
			
			if(kullaniciTahmini.equalsIgnoreCase(secilenKelime)) {
				System.out.println("Tebrikler Doğru Tahmin Ettiniz! \n");
				dogruTahminSayisi++;
			}else {
				System.out.println("Yanlış Tahmin! Doğru Cevap: "+secilenKelime);
			}
			System.out.println("Doğru Tahmin sayısı: " + dogruTahminSayisi + "/10");
			if(i == kelimeler.length - 1) {
				System.out.println("\nSonuçlar : ");
				System.out.println("\n Doğru Tahmin Sayısı: "+dogruTahminSayisi+"/10");
				
				if(dogruTahminSayisi == 10) {
					System.out.println("Tebrikler, 10/10! Kazandınız! ");
				}else if(dogruTahminSayisi == 7) {
					System.out.println("Tebrikler, 7/10!, Geliştirilebilir.");
				}else if(dogruTahminSayisi == 5 ) {
					System.out.println("Başarısız, 5/10.");
				}else {
					System.out.println("Başarısız, Daha Çok Çalışmalısınız.");
				}
				
			}
			
		}
		
	
	}
}
