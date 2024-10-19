public class IndividualAccount extends HGSAccounts implements DisplayableDeposite, DisplayableRoutes {
    public IndividualAccount(String firstName, String lastName, String idNumber, String vehicleClass, double balance) {
        super(firstName, lastName, idNumber, vehicleClass, balance);
    }

    @Override
    public void addBalance(double amount) {
        balance += amount;
        System.out.println(amount + " TL bakiye eklendi. Yeni bakiye: " + balance);
    }

    @Override
    public void deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " TL geçiş ücreti düşüldü. Yeni bakiye: " + balance);
        } else {
            System.out.println("Yetersiz bakiye. Geçiş yapılamaz.");
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Bireysel hesap için bakiye görüntüleme:");
        System.out.println("Ad: " + firstName);
        System.out.println("Soyad: " + lastName);
        System.out.println("Kimlik Numarası: " + idNumber);
        System.out.println("Araç Sınıfı: " + vehicleClass);
        System.out.println("Bakiye: " + balance);
    }

    @Override
    public void displayBalance() {
        System.out.println("Mevcut Bakiye: " + balance);
    }

    @Override
    public void displayRoutes() {
        System.out.println("Bireysel hesap için tüm güzergahlar:");
        for (HGSPassages passage : passagesList) {
            System.out.println("Tarih: " + passage.passageDate + ", Giriş Gişesi: " + passage.entryToll +
                    ", Çıkış Gişesi: " + passage.exitToll + ", Ücret: " + passage.fee + " TL");
        }
    }

    public void addPassage(HGSPassages passage) {
        if (balance >= passage.fee) {
            deductBalance(passage.fee);
            passagesList.add(passage);
            passage.recordPassage();
        } else {
            System.out.println("Yetersiz bakiye. Geçiş yapılamaz.");
        }
    }
}
