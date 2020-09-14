public class Main {
    public static void main(String[] args) {
    long currentinvoice = 0;
    long additionalinvoice = 1000;
    long bonus = additionalinvoice / 100;
    long totalinvoice;
        if (additionalinvoice >= 1000) {
            totalinvoice = currentinvoice + additionalinvoice + bonus;
        } else {
            totalinvoice = currentinvoice + additionalinvoice;
    }
    System.out.println(totalinvoice);
    }
}

