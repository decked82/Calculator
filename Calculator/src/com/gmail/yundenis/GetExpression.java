package com.gmail.yundenis;

import java.util.Scanner;

public class GetExpression {
	Convert convert = new Convert();
	
    Scanner scanner = new Scanner(System.in);
	private int romanNumberA;
	private int romanNumberB;
	private int numberA;
	private int numberB;
	private char operation;
	private boolean romanFlag;

	String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

	public void expression() {

		System.out.println("Input:");

		// Вводим выражение, убираем пробелы и делим выражение на операнды
		String expression = scanner.nextLine();
		String exp = expression.replaceAll(" ", "").toUpperCase();
		String[] operands = exp.split("[+-/*]");
		int romanFlagA = 0;
		int romanFlagB = 0;
		for (int i = 0; i < roman.length; i++) {
			if (roman[i].equals(operands[0])) {
				romanFlagA = 1;
			 } 
			 if (roman[i].equals(operands[1])) {
				romanFlagB = 1;
			 }
		}	
		// Проверяем числа на совпадение систем исчисления
		if ((romanFlagA == 0) && (romanFlagB == 1)) {
			throw new IllegalArgumentException("Введите арабское число");
		} else if ((romanFlagA == 1) && (romanFlagB == 0)) {
			throw new IllegalArgumentException("Введите римское число");
		}
			operation = exp.charAt(operands[0].length());
			// Если система исчисления обоих чисел совпадает 
			if ((romanFlagA == 1) && (romanFlagB == 1)) {
				romanNumberA = convert.romanToNumber(operands[0]);
				romanNumberB = convert.romanToNumber(operands[1]);
				romanFlag = true;
			} else if ((romanFlagA == 0) && (romanFlagB == 0)) {
				numberA = Integer.parseInt(operands[0]);
				numberB = Integer.parseInt(operands[1]);
				romanFlag = false;
					if ((numberA <= 0 || numberA > 10) || (numberB <= 0 || numberB > 10)) {
						System.out.println("Число не входит в диапазон от 1 до 10");
					} else {
			}
		}	
				scanner.close();
	}	
	
				public int getRomanNumberA() {
					return romanNumberA;
				}
				public int getRomanNumberB() {
					return romanNumberB;
				}
				public int getNumberA() {
					return numberA;
				}
				public int getNumberB() {
					return numberB;
				}
				public char getOper() {
					return operation;
				}
				public boolean getFlag() {
					return romanFlag;
				}
				
				public static int calculate(int a, int b, char operation) {
				    int result;
				    switch (operation) {
				    	case '+':
				    		result = a+b;
				    		break;
				    	case '-':
				    		result = a-b;
				    		break;
				    	case '*':
				    		result = a*b;
				    		break;
				    	case '/':
				    		result = a/b;
				    		break;	
				    	default:
				    		throw new IllegalArgumentException("Не верный знак операции");
				    }
				    return result;
	}
}
