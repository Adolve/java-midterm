package com.example.midterm_java.Repository;

import com.example.midterm_java.model.Cocomo;
import com.example.midterm_java.model.CostDriver;
import org.springframework.stereotype.Repository;

@Repository
public class CocomoRepository implements CocomoDataService{

    private final double[][] table= {{3.2,1.05,2.5,0.38},
            {3.0,1.12,2.5,0.35},{2.8,1.20,2.5,0.32}};
    private final String[] mode={"Organic","Semi-Detached","Embedded"};

    @Override
    public Cocomo getValues(CostDriver cost) {

        double effort, time,staff, eaf;
        int model=-1;

        // Check the mode according to size
        if(cost.getSize()>=2 && cost.getSize()<=50)
            model=0;        //organic

        else if(cost.getSize()>50 && cost.getSize()<=300)
            model=1;        //semi-detached

        else if(cost.getSize()>300)
            model=2;        //embedded

        eaf= cost.getRequiredSoftwareReliability() * cost.getSizeofApplicationDatabase() * cost.getComplexityofTheProduct() *
                cost.getRuntimePerformanceConstraints() * cost.getMemoryConstraints() * cost.getVolatilityOfTheVirtualMachineEnvironment() * cost.getRequiredTurnaboutTime() *
                cost.getAnalystCapability() * cost.getApplicationsExperience() * cost.getSoftwareEngineerCapability()* cost.getVirtualMachineExperience() * cost.getProgrammingLanguageExperience() *
                cost.getApplicationOfSoftwareEngineeringMethods() * cost.getUseOfSoftwareTools() * cost.getRequiredDevelopmentSchedule();

        // Calculate Effort
        effort = table[model][0]*(double)Math.pow(cost.getSize(),table[model][1])*eaf;

        // Calculate Time
        time = table[model][2]*(double)Math.pow(effort,table[model][3]);

        //Calculate Persons Required
        staff = effort/time;

        return new Cocomo(effort, time,fround(staff) ,mode[model]);

    }
    private int fround (double x)
    {
        int a;
        x = x + 0.5f;
        a = (int)x;
        return a;

    }
}
