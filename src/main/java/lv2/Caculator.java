package lv2;

import java.util.ArrayList;
import java.util.List;

//이거를 lv1의 Caculator로 들고가기
public class Caculator {
    private int result;
    private ArrayList<Integer> results = new ArrayList<>(); //이거 큐로 바꿔서 FIFO 가능하게하기

    public void plus(int firstNum, int secondNum) {
        results.add(firstNum + secondNum);
    }

    public void minus(int firstNum, int secondNum) {
        results.add(firstNum - secondNum);

    }

    public void multi(int firstNum, int secondNum) {
        results.add(firstNum * secondNum);

    }

    public void div(int firstNum, int secondNum) {
        results.add(firstNum / secondNum);
    }

    public List<Integer> getResult() {
            return results;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void removeResult(){
        results.remove(0);
    }
}
