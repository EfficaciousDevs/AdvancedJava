package DependencyInversionPrinciple.classes;

import DependencyInversionPrinciple.Interfaces.Iphone;

public class ProcessPhoneRepair {
    public void RepairSteps(Iphone phone){
        String Part1 = phone.getPhonePart1();
        System.out.println(Part1 + "repaired");

        double partCost = phone.getPart1Cost();
        System.out.println("RepairCost " + partCost*0.5);
    }
}
