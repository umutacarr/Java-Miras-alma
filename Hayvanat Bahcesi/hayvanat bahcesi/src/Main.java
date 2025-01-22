public class Main {
    public static void main(String[] args) {

        Aslan aslan2 = new Aslan("King",false,false,false);

        Aslan aslan1 = new Aslan(true,false,false);

        Kedi kedi1 = new Kedi("Lucy",false,true,true);


        HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
        hayvanatBahcesi.hayvanEkle(aslan1);
        hayvanatBahcesi.hayvanEkle(aslan2);
        hayvanatBahcesi.hayvanEkle(kedi1);

        NormalGorevli normalGorevli = new NormalGorevli("mehmet","yilmaz",111111);
        hayvanatBahcesi.setNormalGorevli(normalGorevli);
        UzmanGorevli uzmanGorevli = new UzmanGorevli("Ahmet","mert",22222);
        hayvanatBahcesi.setUzmanGorevli(uzmanGorevli);
        hayvanatBahcesi.temizle(1);
        hayvanatBahcesi.evcillestir(1);
        hayvanatBahcesi.temizle(1);

        hayvanatBahcesi.bakimYap(0);
        hayvanatBahcesi.bakimYap(1);
        hayvanatBahcesi.bakimYap(2);

    }
}