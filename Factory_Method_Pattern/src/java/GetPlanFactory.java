package java;

public class GetPlanFactory {
    public Plan getPlan(String planType) {
        if(planType.equalsIgnoreCase("FLOWERPLAN")) {
            return new FlowerPlan();
        } else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }

        return null;
    }
}
