package com.packt.webstore.validator;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CategoryValidator implements ConstraintValidator<Category, String>{
	List<String> allowedCategorties;
	
	public CategoryValidator() {
		this.allowedCategorties = new ArrayList<>();
		allowedCategorties.add("Smart Phone");
		allowedCategorties.add("Laptop");
		allowedCategorties.add("Tablet");
	}
	
	@Override
	public void initialize(Category arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String category, ConstraintValidatorContext context) {
		boolean exist = false;
		for (String item : allowedCategorties) {
			if(item.equals(category)){
				exist = true;
			}
		}
		return exist;
	}

}
