public class Kedi extends Hayvan{

    private boolean tirnagiUzunMu = true;
    public Kedi( boolean erkekMi, boolean temizMi, boolean evcilMi) {
        super("Kedi", erkekMi, temizMi, evcilMi);
    }

    public Kedi(String ad,  boolean erkekMi, boolean temizMi, boolean evcilMi) {
        super(ad, "Kedi", erkekMi, temizMi, evcilMi);
    }

    public void tirnagiKisalt()
    {
        tirnagiUzunMu = false;
        System.out.println(super.adiCoz() +  "'nin tirnagi kisaldi");
    }

    @Override
    public void bakimYap() {
        tirnagiKisalt();
    }
}
