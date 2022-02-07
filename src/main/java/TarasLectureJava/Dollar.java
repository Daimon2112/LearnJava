package TarasLectureJava;

public class Dollar extends AbstractCurrency implements FreeConverted{
    public Dollar(double baseKurs) {
        super(baseKurs);
    }

    @Override
    public String getCurrencyName() {
        return "Dollar";
    }

    @Override
    public boolean isFreeConverted() {
        return true;
    }
}
