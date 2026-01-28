package SS_JV2.Question4;

public class Main {
    public static void main(String[] args) {
        Employee e1 = FactoryDesign.getEmployee("developer");
        Employee e2 = FactoryDesign.getEmployee("tester");
        Employee e3 = FactoryDesign.getEmployee("lead");

        e1.getRole();
        e2.getRole();
        e3.getRole();
    }
}
