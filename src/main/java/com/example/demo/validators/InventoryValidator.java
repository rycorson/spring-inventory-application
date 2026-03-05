package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class InventoryValidator implements ConstraintValidator<ValidInventory, Part> {
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;
    @Override
    public void initialize(ValidInventory constraintAnnotation) {
        //ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {

        //Create code to make sure that inventory is between min and max value
        if(part.getInv() > part.getMaxInv()) {
            //display error message when inventory is greater than max inventory
            constraintValidatorContext.buildConstraintViolationWithTemplate("Please fix inventory, it is currently greater than the Inventory Maximum allowed.").addConstraintViolation();
            return false;
        }
        if(part.getInv() < part.getMinInv()) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("Please fix inventory, it is currently less than the Inventory Maximum allowed.").addConstraintViolation();
            return false;
        }

        return true;
    }
}
