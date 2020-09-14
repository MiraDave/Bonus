public class Main {
    public static void main(String[] args) {
    long currentinvoice = 100;
    long additionalinvoice = 1100;
    long bonus = additionalinvoice / 100;

    long totalinvoice = currentinvoice + additionalinvoice + bonus;
    System.out.println(totalinvoice);
    }
}

