package TarasLectureJava;

public class Euro extends AbstractCurrency implements FreeConverted {
    public Euro(double baseKurs) {
        super(baseKurs);
    }

    @Override
    public String getCurrencyName() {
        return "Euro";
    }

    @Override
    public boolean isFreeConverted() {
        return true;
    }
}
