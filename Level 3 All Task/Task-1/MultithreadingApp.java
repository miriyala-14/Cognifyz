class DigitPrinter extends Thread {
    private int initialNumber;

    public DigitPrinter(int initialNumber) {
        this.initialNumber = initialNumber;
    }

    @Override
    public void run() {
        for (int i = initialNumber; i <= initialNumber + 4; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                // Simulate some work
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadingApp {
    public static void main(String[] args) {
        // Create three threads
        DigitPrinter printer1 = new DigitPrinter(1);
        DigitPrinter printer2 = new DigitPrinter(6);
        DigitPrinter printer3 = new DigitPrinter(11);

        // Start the threads
        printer1.start();
        printer2.start();
        printer3.start();

        // Wait for all threads to finish
        try {
            printer1.join();
            printer2.join();
            printer3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have completed execution.");
    }
}
