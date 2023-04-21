package pro.sky.skyprocourse2;

import org.springframework.stereotype.Service;

@Service

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) throws IllegalArgumentException {
        if (num2 == 0) {
            throw new IllegalArgumentException("Ошибка: деление на 0");
        }
        return num1 / num2;
    }
}


