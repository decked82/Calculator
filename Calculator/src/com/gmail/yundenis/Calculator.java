package com.gmail.yundenis;

import com.gmail.yundenis.*;


public class Calculator {
    
	public static void main(String[] args) {
		
		Convert convert = new Convert();
		GetExpression getExpression = new GetExpression();
		getExpression.expression();
		
		if (getExpression.getFlag()) {
			int romanResult = getExpression.calculate(getExpression.getRomanNumberA(), getExpression.getRomanNumberB(), getExpression.getOper());
	
			if (romanResult < 0) {
				System.out.println("Output: \n" + "-" + convert.romanNumerals(-romanResult));
			} else {
				System.out.println("Output: \n" + convert.romanNumerals(romanResult));
			}
		} else {		
		int result = getExpression.calculate(getExpression.getNumberA(), getExpression.getNumberB(), getExpression.getOper());
		System.out.println("Output: \n" + result);
		}
	}
}
 
