public class Main {
    public static void main(String[] args) {
        // Bireysel hesap oluşturma
        IndividualAccount account = new IndividualAccount("Ahmet", "Yılmaz", "123456789", "Binek", 100.0);

        // Hesap bilgilerini görüntüleme
        account.displayAccountInfo();

        // Bakiye ekleme
        account.addBalance(50.0);
        account.displayBalance();

        // Geçiş işlemleri
        Passages passage1 = new Passages("2024-10-18", "Ankara", "İstanbul", 20.0);
        account.addPassage(passage1);

        Passages passage2 = new Passages("2024-10-19", "İstanbul", "Bursa", 15.0);
        account.addPassage(passage2);

        Passages passage3 = new Passages("2024-10-20", "Bursa", "Ankara", 25.0);
        account.addPassage(passage3);

        // Geçiş güzergahlarını görüntüleme
        account.displayRoutes();
    }
}
