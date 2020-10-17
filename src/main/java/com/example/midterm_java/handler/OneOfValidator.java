package com.example.midterm_java.handler;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;

public class OneOfValidator implements ConstraintValidator<OneOf, Double>
{

    private double[] values;
    @Override
    public void initialize(OneOf constraintAnnotation) {
        this.values = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(Double number, ConstraintValidatorContext constraintValidatorContext) {

        for(int i=0;i<values.length;i++)
            if(values[i]==number)
                return true;

        return false;
    }
}

