package io.codelex.oop.summary.ordersandinvoices;

import java.util.List;

public class Invoice {


    private final double VAT = 0.21;
    private List<Item> itemList;
    private String invoiceNum;
    private InvoiceStatus invoiceStatus;

    public Invoice(List<Item> itemList, String invoiceNum) {
        this.itemList = itemList;
        this.invoiceNum = invoiceNum;
        this.invoiceStatus = InvoiceStatus.APPROVED;
    }

    public void send() {
        invoiceStatus = InvoiceStatus.SENT;
    }

    public String formattedInvoice() {

        double priceWithoutVAT = 0;

        StringBuilder invoiceString = new StringBuilder();

        invoiceString.append("===================================================\n" +
                "= INVOICE NUMBER: " + String.format("%-32s", invoiceNum) + "=\n" +
                "= INVOICE STATUS: " + String.format("%-32s", invoiceStatus) + "=\n");
        for (int i = 0; i < itemList.size(); i++) {
            invoiceString.append("= " + (i + 1) + ". " + String.format("%-45s", itemList.get(i).getFullInfo()) + "=\n");
            priceWithoutVAT += itemList.get(i).getPrice();
        }
        String priceWithoutVATString = String.format("%.2f EUR", priceWithoutVAT);
        String VATString = String.format("%.2f EUR", VAT * priceWithoutVAT);
        String priceWithVATString = String.format("%.2f EUR", priceWithoutVAT + (VAT * priceWithoutVAT));
        invoiceString.append("= SUM: " + String.format("%-43s", priceWithoutVATString) + "=\n" +
                "= VAT (21%): " + String.format("%-37s", VATString) + "=\n" +
                "= TOTAL: " + String.format("%-41s", priceWithVATString) + "=\n" +
                "===================================================\n");

        return invoiceString.toString();
    }


}
