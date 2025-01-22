public class UzmanGorevli extends Gorevli{
    public UzmanGorevli(String ad, String soyad, int tc) {
        super(ad, soyad, tc);
    }

    public  void evcillestir(Hayvan hayvan)
    {
        if(hayvan.isEvcilMi())
            System.out.println(hayvan.adiCoz() + " zaten evcil.");
        else
        {
            hayvan.setEvcilMi(true);
            System.out.println(hayvan.adiCoz() + " evcilleti.");
        }
    }
}
