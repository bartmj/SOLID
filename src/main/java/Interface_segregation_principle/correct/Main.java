package Interface_segregation_principle.correct;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

interface Copiable {
    void copy();
}

interface PrintScanCopiable extends Printable, Scannable, Copiable {}

class Printer implements Printable, Scannable {
    public void print() {
        System.out.println("Prints");
    }

    public void scan() {
        System.out.println("Makes a scan.");
    }
}

class Copier implements Copiable {
    public void copy() {
        System.out.println("Makes a copy");
    }
}


public class Main {
    public static void main(String[] args) {

    }
}
