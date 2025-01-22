public class Aslan extends Hayvan{
    private boolean tuyuUzunMu = true;
    public Aslan( boolean erkekMi, boolean temizMi, boolean evcilMi) {
        super("Aslan", erkekMi, temizMi, evcilMi);
    }

    public Aslan(String ad,  boolean erkekMi, boolean temizMi, boolean evcilMi) {
        super(ad, "Aslan", erkekMi, temizMi, evcilMi);
    }

    public void tuyunuKisalt()
    {
        tuyuUzunMu = false;
        System.out.println(super.adiCoz() + "'nin tuyu kisaldi");
    }

    @Override
    public void bakimYap() {
        tuyunuKisalt();
    }
}
