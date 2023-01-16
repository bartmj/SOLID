package Interface_segregation_principle.incorrect;

public class Copier implements PrinterScannerCopier {
    @Override
    public void print() throws Exception {
        throw new Exception("Copier does not print.");
    }

    @Override
    public void scan() throws Exception {
        throw new Exception("Copier does not scan.");
    }

    @Override
    public void copy() {
        System.out.println("Makes a copy.");
    }
}
