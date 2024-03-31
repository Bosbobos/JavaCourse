package io.datajek.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = HeadToHeadConstraintValidator.class)
public @interface HeadToHead {
    public String message() default "Value must have the following format: ##-##.";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
