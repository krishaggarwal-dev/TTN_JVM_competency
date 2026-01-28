package SS_JV1.Question6;

class BankingSystem {

    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "SS_JV1.Question6.Bank Name: " + name +
                "\nHead Office: " + headOfficeAddress +
                "\nChairman: " + chairmanName +
                "\nBranch Count: " + branchCount +
                "\nFD Interest Rate: " + fdInterestRate + "%" +
                "\nPersonal Loan Interest Rate: " + personalLoanInterestRate + "%" +
                "\nHome Loan Interest Rate: " + homeLoanInterestRate + "%";
    }
}

class SBI extends BankingSystem {
    public SBI() {
        setName("SS_JV1.Question6.SBI");
        setHeadOfficeAddress("Mumbai");
        setChairmanName("Dinesh Kumar Khara");
        setBranchCount(22000);
        setFdInterestRate(6.8);
        setPersonalLoanInterestRate(10.5);
        setHomeLoanInterestRate(8.4);
    }
}

class BOI extends BankingSystem {
    public BOI() {
        setName("SS_JV1.Question6.BOI");
        setHeadOfficeAddress("Mumbai");
        setChairmanName("Atanu Kumar Das");
        setBranchCount(5100);
        setFdInterestRate(6.5);
        setPersonalLoanInterestRate(11.0);
        setHomeLoanInterestRate(8.6);
    }
}

// SS_JV1.Question6.ICICI subclass
class ICICI extends BankingSystem {
    public ICICI() {
        setName("SS_JV1.Question6.ICICI");
        setHeadOfficeAddress("Mumbai");
        setChairmanName("Sandeep Bakhshi");
        setBranchCount(6200);
        setFdInterestRate(7.0);
        setPersonalLoanInterestRate(10.8);
        setHomeLoanInterestRate(8.5);
    }
}

// Main class
public class Bank {
    public static void main(String[] args) {

        BankingSystem sbi = new SBI();
        BankingSystem boi = new BOI();
        BankingSystem icici = new ICICI();

        System.out.println(sbi);
        System.out.println();
        System.out.println(boi);
        System.out.println();
        System.out.println(icici);
    }
}