package Interface_segregation_principle.incorrect;

interface PrinterScannerCopier {
    void print() throws Exception;
    void scan() throws Exception;
    void copy() throws Exception;
}
