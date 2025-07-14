package lv3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String check = "";

        ArithmeticCalculator<Number> calculator = new ArithmeticCalculator<>();

        while (!(check.equals("exit"))) {
            System.out.print("첫번째 숫자를 입력하세요 : ");
            double firstNum =  getPositiveDouble(sc);
            System.out.print("두번째 숫자를 입력하세요 : ");
            double secondNum = getPositiveDouble(sc);

            System.out.print("사직연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);

            double result = calculator.calculate(firstNum, secondNum,operator);
            System.out.println("결과 : " + result);
            System.out.println("쌓인 데이터 : " + calculator.getResults());
            System.out.println("입력한 데이터 : " + firstNum + "  " + secondNum);
            calculator.FindBigResults(firstNum, secondNum);

            System.out.print("더 계산하시겠습니까? (exit 입력시 종료) : ");
            check = sc.next();
        }
    }


    public static double getPositiveDouble(Scanner sc){
        double num;

        while(true){
            try{
                num = sc.nextDouble();
                if(num < 0){
                    System.out.println("양의 실수만 입력 가능합니다.");
                    System.out.print("다시 입력하세요 : ");
                    continue;   //밑에꺼 무시하고 다시 위로
                }
                return num; // 정상이면 리턴
            } catch (Exception e) { //try 문안에서 오류가 생기면 일로옴
                System.out.print("숫자를 다시 입력하세요. : ");
                sc.nextLine(); // 이거 안하면 위에 문장이 계속 돔,,(버퍼 지우기)
            }
        }
    }
}
