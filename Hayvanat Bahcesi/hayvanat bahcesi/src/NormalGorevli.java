public class NormalGorevli extends Gorevli{
    public NormalGorevli(String ad, String soyad, int tc) {
        super(ad, soyad, tc);
    }

    public void temizLe(Hayvan h)
    {
        if(!h.isEvcilMi())
        {
            System.out.println(h.adiCoz() + " vahsi ve ben onu yikayamam.");
            return;
        }
        if(h.isTemizMi())
            System.out.println(h.adiCoz() + " zaten temiz.");
        else {
            h.setTemizMi(true);
            System.out.println(h.adiCoz() + " temizlendi.");
        }
    }
}
