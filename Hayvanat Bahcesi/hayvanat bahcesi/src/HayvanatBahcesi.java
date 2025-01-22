import java.util.ArrayList;

public class HayvanatBahcesi {

    private ArrayList<Hayvan> hayvanlar;
    private NormalGorevli normalGorevli;
    private UzmanGorevli uzmanGorevli;

    public HayvanatBahcesi() {
        hayvanlar = new ArrayList<>();
    }

    public void hayvanEkle(Hayvan hayvan){
        hayvanlar.add(hayvan);
        System.out.println(hayvan.adiCoz() + " bahceye eklendi");
    }

    public NormalGorevli getNormalGorevli() {
        return normalGorevli;
    }

    public void setNormalGorevli(NormalGorevli normalGorevli) {
        this.normalGorevli = normalGorevli;
    }

    public UzmanGorevli getUzmanGorevli() {
        return uzmanGorevli;
    }

    public void setUzmanGorevli(UzmanGorevli uzmanGorevli) {
        this.uzmanGorevli = uzmanGorevli;
    }

    public ArrayList<Hayvan> getHayvanlar() {
        return hayvanlar;
    }

    public void temizle(int index)
    {
        Hayvan hayvan = hayvanlar.get(index);
        normalGorevli.temizLe(hayvan);
    }

    public void evcillestir(int index)
    {
        Hayvan hayvan = hayvanlar.get(index);
        uzmanGorevli.evcillestir(hayvan);
    }

    public void bakimYap(int index)
    {
        Hayvan hayvan = hayvanlar.get(index);
        hayvan.bakimYap();
        //Kedi kedi;
        //Aslan aslan;
//        if(hayvan.getTur() == "Kedi")
//        {
//            kedi = (Kedi) hayvan;
//            kedi.tirnagiKisalt();
//        }
//        if(hayvan.getTur()=="Aslan")
//        {
//            aslan = (Aslan)hayvan;
//            aslan.tuyunuKisalt();
//        }
    }
}
