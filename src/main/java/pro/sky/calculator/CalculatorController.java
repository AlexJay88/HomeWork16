package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;

    }

    @GetMapping
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/plus")
    public String sumCalculator(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "ошибка";
        }
        {
            return calculatorService.sumCalculator(num1, num2);
        }
    }

    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "ошибка";
        }
        {
            return calculatorService.minusCalculator(num1, num2);
        }
    }

    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "ошибка";
        }
        {
            return calculatorService.multiplyCalculator(num1, num2);

        }
    }

    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "ошибка";
        }
        {
            return calculatorService.divideCalculator(num1, num2);
        }


    }
}