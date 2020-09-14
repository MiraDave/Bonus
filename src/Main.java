public class Main {
    public static void main(String[] args) {
        long currentInvoice = 0;
        long additionalInvoice = 1000;
        long bonus = additionalInvoice / 100;
        long totalInvoice;
        if (additionalInvoice >= 1000) {
            totalInvoice = currentInvoice + additionalInvoice + bonus;
        } else {
            totalInvoice = currentInvoice + additionalInvoice;
        }
        System.out.println(totalInvoice);
    }
}

