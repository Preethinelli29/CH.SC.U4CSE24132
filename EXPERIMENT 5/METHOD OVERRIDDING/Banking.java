class Bank {
    double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 5.5;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 6.0;
    }
}

public class Banking{
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
    }
}
