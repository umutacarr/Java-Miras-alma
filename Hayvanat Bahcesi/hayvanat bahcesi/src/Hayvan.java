public class Hayvan {
    private String ad;
    private String tur;
    private boolean erkekMi;
    private boolean temizMi;
    private boolean evcilMi;

    public Hayvan(String tur, boolean erkekMi, boolean temizMi, boolean evcilMi) {
        this.tur = tur;
        this.erkekMi = erkekMi;
        this.temizMi = temizMi;
        this.evcilMi = evcilMi;
    }

    public Hayvan(String ad, String tur, boolean erkekMi, boolean temizMi, boolean evcilMi) {
        this.ad = ad;
        this.tur = tur;
        this.erkekMi = erkekMi;
        this.temizMi = temizMi;
        this.evcilMi = evcilMi;
    }

    public String getAd() {
        return ad;
    }

    public String getTur() {
        return tur;
    }

    public boolean isErkekMi() {
        return erkekMi;
    }

    public boolean isTemizMi() {
        return temizMi;
    }

    public boolean isEvcilMi() {
        return evcilMi;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setTemizMi(boolean temizMi) {
        this.temizMi = temizMi;
    }

    public void setEvcilMi(boolean evcilMi) {
        this.evcilMi = evcilMi;
    }

    public String adiCoz()
    {
        String ad;
        if(this.ad != null)
            ad = this.ad;
        else
            ad = "bu hayvan";

        return ad;
    }

    public void durumunuAcikla()
    {
        String temizlikDurumu;
        String evcillikDurumu;
        String cinsiyet;

        if(temizMi)
            temizlikDurumu = "temiz";
        else
            temizlikDurumu = "kirli";

        if(evcilMi)
            evcillikDurumu = "evcil";
        else
            evcillikDurumu = "vahsi";

        if(erkekMi)
            cinsiyet = "erkek";
        else
            cinsiyet = "disi";

        System.out.println(adiCoz() + " bir " + cinsiyet + " " + tur );
        System.out.println(adiCoz() + " " + evcillikDurumu + " ve " + temizlikDurumu);
    }

    public void bakimYap()
    {
        System.out.println("Bakim yapildi.");
    }
}
