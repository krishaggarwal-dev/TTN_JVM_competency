package SS_JV2.Question4;

public class FactoryDesign {

    public static Employee getEmployee(String type) {
        if(type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "developer":
                return new Dev();
            case "tester":
                return new Tester();
            case "lead":
                return new Lead();
            default:
                return null;
        }
    }
}
