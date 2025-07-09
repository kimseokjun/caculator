package lv3;

public class ArithmeticCalculator<T extends Number> {
    
    public enum OperatorType{
        PLUS('+'),
        MINUS('-'),
        MULTI('*'),
        DIV('/');

        private char operator;

        OperatorType(char c) {
            this.operator = c;
        }
    }


}
