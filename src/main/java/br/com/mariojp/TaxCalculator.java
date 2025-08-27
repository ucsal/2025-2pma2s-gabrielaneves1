package br.com.mariojp;

public class TaxCalculator {

    private final double taxRate;

    public TaxCalculator() {
        String rate = System.getProperty("tax.rate", "0.10");
        double parsed;
        try {parsed = Double.parseDouble(rate); } catch (Exception e) {
            parsed = 0.10; }
        
        this.taxRate = parsed;
    }

    public double calculateTax (double amount) {
        return amount + taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
