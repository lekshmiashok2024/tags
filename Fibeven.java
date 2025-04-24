class FibonacciRunnable implements Runnable {
    int count;

    FibonacciRunnable(int count) {
        this.count = count;
    }

    public void run() {
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

class EvenRunnable implements Runnable {
    int start, end;

    EvenRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Even Numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class Fibeven {
    public static void main(String[] args) {
        printFibonacci(10); 
        printEvenNumbers(1, 20); 
    }

    public static void printFibonacci(int count) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void printEvenNumbers(int start, int end) {
    System.out.println("Even Numbers from " + start + " to " + end + ":");
    if (start % 2 != 0) { 
        start++; 
    }
    for (int i = start; i <= end; i += 2) {
        System.out.print(i + " ");
    }
    System.out.println();
}

}


