package tarasLectureJava;

public class Bitcoin extends AbstractCurrency {
    public Bitcoin(double baseKurs){
        super(baseKurs);
    }

    @Override
    public String getCurrencyName(){
        return "Bitcoin";
    }

    @Override
    public double convertCurrencyToGrn(int currencyValue){
        System.out.println("Операция запрещена");
        return currencyValue;
    }

}
