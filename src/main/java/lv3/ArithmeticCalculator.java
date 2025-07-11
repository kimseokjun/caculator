package lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {

    private List<Double> results = new ArrayList<Double>(); // 연산 결과값들 저장

    private  char operator;// 연산 기호


    enum Operation {
        PLUS('+'){
            public <T extends Number> double cal(T firstNum, T secondNum){
                return firstNum.doubleValue() + secondNum.doubleValue();
            }
        },
        MINUS('-'){
            public <T extends Number> double cal(T firstNum, T secondNum){
                return firstNum.doubleValue() - secondNum.doubleValue();
            }
        },
        MULTI('*'){
            public <T extends Number> double cal(T firstNum, T secondNum){
                return firstNum.doubleValue() * secondNum.doubleValue();
            }
        },
        DIV('/') {
            public <T extends Number> double cal(T firstNum, T secondNum) {
                return firstNum.doubleValue() / secondNum.doubleValue();
            }
        };

        public abstract <T extends Number> double cal(T firstNum, T secondNum);

        private final char symbol;

        Operation(char symbol) {
            this.symbol = symbol;
        }


        public static Operation select(char operator) {
            for (Operation op : Operation.values()) {
                if (op.symbol == operator) return op;
            }
                throw new IllegalArgumentException("잘못된 기호");
        }
    }

    public double calculate(T firstNum, T secondNum, char operator) {
        Operation operation = Operation.select(operator);
        double result = operation.cal(firstNum,secondNum);
        results.add(result);
        return result;
    }

    public List<Double> getResults() {
        return results;
    }

    public void FindBigResults(T firstNum, T secondNum) {

        List<Double> BigResults = results.stream()
                .filter(n -> n > firstNum.doubleValue())
                .filter(n -> n > secondNum.doubleValue())
                .collect(Collectors.toList());

        System.out.println("입력한 데이터 보다 큰 수 " + BigResults);
    }
}
