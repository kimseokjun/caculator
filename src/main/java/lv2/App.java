package lv2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String check = "";

        Caculator c = new Caculator();

        while (!(check.equals("exit"))) {
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int firstNum =  getPositiveInt(sc);
            System.out.print("두번째 숫자를 입력하세요 : ");
            int secondNum = getPositiveInt(sc);

            System.out.print("사직연산 기호를 입력하세요 : ");
            char operation = sc.next().charAt(0);

            switch (operation) {
                case '+':
                    //c.plus(firstNum, secondNum);  //처음에는 메서드로 구현하였는데 set을 활용하라고 되어있어 주석처리했습니다.
                    c.setResults(firstNum+secondNum);
                    break;
                case '-':
                    //c.minus(firstNum, secondNum);
                    c.setResults(firstNum-secondNum);
                    break;
                case '/':
                    if (secondNum == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    //c.div(firstNum, secondNum);
                    c.setResults(firstNum/secondNum);
                    break;
                case '*':
                    //c.multi(firstNum, secondNum);
                    c.setResults(firstNum*secondNum);
                    break;
                default:
                    System.out.println("사용할수 없는 연산기호 입니다.");
            }

            System.out.println("get메서드를 통한 값 접근(results) : " + c.getResults());
            System.out.print("첫번째 데이터를 삭제하려면 del 입력 : ");
            String del = sc.next();
            if (del.equals("del")) {
                c.removeResult();
                System.out.println("삭제후 데이터 내역 : " + c.getResults());
            }
            System.out.print("더 계산하시겠습니까? (exit 입력시 종료) : ");
            check = sc.next();
        }
    }


    public static int getPositiveInt(Scanner sc){
        int num;
        while(true){
            try{
                num = sc.nextInt();
                if(num < 0){
                    System.out.println("양의 정수만 입력 가능합니다.");
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
