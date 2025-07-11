package lv2;

import java.util.ArrayList;
import java.util.List;

public class Caculator {

    private final ArrayList<Integer> results = new ArrayList<>();

//    public void plus(int firstNum, int secondNum) {
//        results.add(firstNum + secondNum);
//    }
//
//    public void minus(int firstNum, int secondNum) {
//
//        results.add(firstNum - secondNum);
//
//    }
//
//    public void multi(int firstNum, int secondNum) {
//
//        results.add(firstNum * secondNum);
//
//    }
//
//    public void div(int firstNum, int secondNum) {
//
//        results.add(firstNum / secondNum);
//    }



    public List<Integer> getResults() {
        return results;
    }

    public void setResults(int r) {
        this.results.add(r);
    }

    public void removeResult() {
        results.remove(0);
    }
}
