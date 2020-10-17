package com.example.midterm_java.model;

import com.example.midterm_java.handler.OneOf;
import com.example.midterm_java.handler.OneOfValidator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CostDriver {



    @OneOf(value = {0.75,0.88,1.00,1.15,1.40}, message = "requiredSoftwareReliability must be : 0.75, 0.88, 1.00, 1.15, 1.40")
    private double requiredSoftwareReliability;

    @OneOf(value = {0.94, 1.00, 1.08, 1.16}, message = "sizeofApplicationDatabase must be : 0.94, 1.00, 1.08, 1.16")
    private double sizeofApplicationDatabase;

    @OneOf(value = {0.70, 0.85, 1.00, 1.15, 1.30}, message = "complexityofTheProduct must be : 0.70, 0.85, 1.00, 1.15, 1.30")
    private double complexityofTheProduct;

    @OneOf(value = {1.00, 1.11, 1.30}, message = "runtimePerformanceConstraints must be : 1.00, 1.11, 1.30")
    private double runtimePerformanceConstraints;

    @OneOf(value = {1.00, 1.06, 1.21}, message = "remoryConstraints must be : 1.00, 1.06, 1.21")
    private double remoryConstraints;

    @OneOf(value = {0.87, 1.00, 1.15, 1.30}, message = "volatilityOfTheVirtualMachineEnvironment must be : 0.87, 1.00, 1.15, 1.30")
    private double volatilityOfTheVirtualMachineEnvironment;

    @OneOf(value = {0.94, 1.00, 1.07, 1.15}, message = "requiredTurnaboutTime must be : 0.94, 1.00, 1.07, 1.15")
    private double requiredTurnaboutTime;

    @OneOf(value = {1.46, 1.19,1.00,0.86,0.71}, message = "analystCapability must be : 1.46, 1.19, 1.00, 0.86, 0.71")
    private double analystCapability;

    @OneOf(value = {1.29,1.13,1.00,0.91,0.82}, message = "applicationsExperience must be : 1.29, 1.13, 1.00, 0.91, 0.82")
    private double applicationsExperience	;

    @OneOf(value = {1.42,1.17,1.00,0.86,0.7}, message = "softwareEngineerCapability must be : 1.42, 1.17, 1.00, 0.86, 0.7")
    private double softwareEngineerCapability;

    @OneOf(value = {1.21,1.10,1.00,0.90}, message = "virtualMachineExperience must be : 1.21, 1.10, 1.00, 0.90")
    private double virtualMachineExperience;

    @OneOf(value = {1.14,1.07,1.00,0.95}, message = "programmingLanguageExperience must be : 1.14, 1.07, 1.00, 0.95")
    private double programmingLanguageExperience;

    @OneOf(value = {1.24,1.10,1.00,0.91,0.82}, message = "applicationOfSoftwareEngineeringMethods must be : 1.24, 1.10, 1.00, 0.91, 0.82")
    private double applicationOfSoftwareEngineeringMethods;

    @OneOf(value = {1.24,1.10,1.00,0.91,0.83}, message = "useOfSoftwareTools must be : 1.24, 1.10, 1.00, 0.91, 0.83")
    private double useOfSoftwareTools;

    @OneOf(value = {1.23,1.08,1.00,1.04,1.10}, message = "requiredDevelopmentSchedule must be : 1.23, 1.08, 1.00, 1.04, 1.10")
    private double requiredDevelopmentSchedule;

    public CostDriver(@JsonProperty("requiredSoftwareReliability") double requiredSoftwareReliability,
                      @JsonProperty("sizeofApplicationDatabase") double sizeofApplicationDatabase,
                      @JsonProperty("complexityofTheProduct") double complexityofTheProduct,
                      @JsonProperty("runtimePerformanceConstraints") double runtimePerformanceConstraints,
                      @JsonProperty("remoryConstraints") double remoryConstraints,
                      @JsonProperty("volatilityOfTheVirtualMachineEnvironment") double volatilityOfTheVirtualMachineEnvironment,
                      @JsonProperty("requiredTurnaboutTime") double requiredTurnaboutTime,
                      @JsonProperty("analystCapability") double analystCapability,
                      @JsonProperty("applicationsExperience") double applicationsExperience,
                      @JsonProperty("softwareEngineerCapability") double softwareEngineerCapability,
                      @JsonProperty("virtualMachineExperience") double virtualMachineExperience,
                      @JsonProperty("programmingLanguageExperience") double programmingLanguageExperience,
                      @JsonProperty("applicationOfSoftwareEngineeringMethods") double applicationOfSoftwareEngineeringMethods,
                      @JsonProperty("useOfSoftwareTools") double useOfSoftwareTools,
                      @JsonProperty("requiredDevelopmentSchedule") double requiredDevelopmentSchedule) {
        this.requiredSoftwareReliability = requiredSoftwareReliability;
        this.sizeofApplicationDatabase = sizeofApplicationDatabase;
        this.complexityofTheProduct = complexityofTheProduct;
        this.runtimePerformanceConstraints = runtimePerformanceConstraints;
        this.remoryConstraints = remoryConstraints;
        this.volatilityOfTheVirtualMachineEnvironment = volatilityOfTheVirtualMachineEnvironment;
        this.requiredTurnaboutTime = requiredTurnaboutTime;
        this.analystCapability = analystCapability;
        this.applicationsExperience = applicationsExperience;
        this.softwareEngineerCapability = softwareEngineerCapability;
        this.virtualMachineExperience = virtualMachineExperience;
        this.programmingLanguageExperience = programmingLanguageExperience;
        this.applicationOfSoftwareEngineeringMethods = applicationOfSoftwareEngineeringMethods;
        this.useOfSoftwareTools = useOfSoftwareTools;
        this.requiredDevelopmentSchedule = requiredDevelopmentSchedule;
    }
}
