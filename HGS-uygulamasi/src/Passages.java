public class Passages extends HGSPassages {
    public Passages(String passageDate, String entryToll, String exitToll, double fee) {
        super(passageDate, entryToll, exitToll, fee);
    }

    @Override
    public void recordPassage() {
        System.out.println("Geçiş kaydedildi:");
        System.out.println("Tarih: " + passageDate + ", Giriş Gişesi: " + entryToll +
                ", Çıkış Gişesi: " + exitToll + ", Ücret: " + fee + " TL");
    }
}
