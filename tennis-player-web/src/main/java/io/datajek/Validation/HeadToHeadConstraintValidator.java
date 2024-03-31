package io.datajek.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HeadToHeadConstraintValidator implements ConstraintValidator<HeadToHead, String> {
    @Override
    public void initialize(HeadToHead headToHeadScore) {
        // Doesn't need an implementation here, could've been omitted
    }

    public boolean isValid(String headToHeadScore, ConstraintValidatorContext context) {
        boolean isValid = headToHeadScore.matches("[0-9]{1,2}-[0-9]{1,2}");
        return isValid;
    }
}
