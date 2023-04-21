package pro.sky.skyprocourse2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculatorController  {
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping
    public String hello (){
        return "Добро пожаловать";
    }

    @GetMapping("/calculator")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/calculator/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        try {
            int result = calculatorService.add(num1, num2);
            return num1 + " + " + num2 + " = " + result;
        } catch (IllegalArgumentException error) {
            return "Ошибка: " + error.getMessage();
        }
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        try {
            int result = calculatorService.subtract(num1, num2);
            return num1 + " − " + num2 + " = " + result;
        } catch (IllegalArgumentException error) {
            return "Ошибка: " + error.getMessage();
        }
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        try {
            int result = calculatorService.multiply(num1, num2);
            return num1 + " * " + num2 + " = " + result;
        } catch (IllegalArgumentException error) {
            return "Ошибка: " + error.getMessage();
        }
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        try {
            int result = calculatorService.divide(num1, num2);
            return num1 + " / " + num2 + " = " + result;
        } catch (IllegalArgumentException error) {
            return "Ошибка: " + error.getMessage();
        }
    }
}

