package homework4;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> printers = List.of(
                new Thread(new PrinterLetter(Letter.A)::print),
                new Thread(new PrinterLetter(Letter.B)::print),
                new Thread(new PrinterLetter(Letter.C)::print)
        );
        printers.forEach(Thread::start);
        for (Thread printer : printers) {
            printer.join();
        }
    }
}
