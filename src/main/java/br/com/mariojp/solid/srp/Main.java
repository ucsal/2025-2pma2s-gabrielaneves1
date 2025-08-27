package br.com.mariojp.solid.srp;

import br.com.mariojp.TaxCalculator;

public class Main {
    public static void main(String[] args) {
        Order o = new Order();
        o.add(new Item("Cafe", 8.0, 2));
        o.add(new Item("Bolo", 12.5, 1));

        TaxCalculator taxCalculator = new TaxCalculator();
        ReceiptFormatter receiptFormatter = new ReceiptFormatter();

        ReceiptService service = new ReceiptService(taxCalculator, receiptFormatter);
        String receipt = service.generate(o);

        System.out.println(receipt);
    }
} 
