package TarasLectureJava;

abstract public class AbstractCurrency {
    private double kursNBU;
    private double marja = 10;

    public AbstractCurrency(double baseKurs) {
        this.kursNBU = baseKurs;
    }

    abstract public String getCurrencyName();


    public double getKursNBU(){
        return kursNBU;
    }

    public void setKursNBU(double kursNBU){
        this.kursNBU =  kursNBU;
    }

    public double getMarja() {
        return marja;
    }

    public void setMarja(double marja) {
        this.marja = marja;
    }

    public double convertGrnToCurrency(int grnValue){
        double tempResult = grnValue / kursNBU * (1 - marja/100);
        System.out.println("For " + grnValue + " grn you get " + tempResult + " " + getCurrencyName());
        return tempResult;
    }

    public double convertCurrencyToGrn(int currencyValue){
        double tempResult = currencyValue * kursNBU * (1 - marja/100);
        System.out.println(String.format("For %s %s you get %s grn", currencyValue, getCurrencyName() , tempResult));
        return tempResult;
    }



}
