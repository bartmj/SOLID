package Interface_segregation_principle.incorrect;

public class Printer implements PrinterScannerCopier {
    @Override
    public void print() {
        System.out.println("Prints.");
    }

    @Override
    public void scan() throws Exception {
        throw new Exception("Printer does not scan.");
    }

    @Override
    public void copy() throws Exception {
        throw new Exception("Printer does not copy.");
    }
}
