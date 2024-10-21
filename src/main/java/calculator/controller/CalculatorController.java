package calculator.controller;

import calculator.service.CalculatorService;
import camp.nextstep.edu.missionutils.Console;

public class CalculatorController {
    private final CalculatorService calculatorService = new CalculatorService();

    public void calculate() {
        String input = Console.readLine();

        System.out.println("결과 : " + calculatorService.calculate(input));
    }
}
