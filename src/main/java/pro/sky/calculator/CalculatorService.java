package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface{
@Override
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

@Override
    public String sumCalculator(int num1,int num2) {
        return num1+"+"+num2+"="+(num1+num2);
    }
@Override
    public String minusCalculator(int num1,int num2) {
        return num1+"-"+num2+"="+(num1-num2);
    }
@Override
    public String multiplyCalculator(int num1,int num2) {
        return num1 + "*" + num2 + "=" + (num1 * num2);
    }
@Override
    public String divideCalculator(int num1,int num2) {
        if (num2==0){
            return "На ноль делить нельзя";}
        else{
            return num1 + "/" + num2 + "=" + (num1 / num2);

        }

        }}


