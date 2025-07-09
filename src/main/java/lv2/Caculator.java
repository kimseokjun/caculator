package lv2;

import java.util.ArrayList;
import java.util.List;

public class Caculator {

    private int result;
    private ArrayList<Integer> results = new ArrayList<>();

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


    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


    public List<Integer> getResults() {
        return results;
    }

    public void setResults(ArrayList<Integer> results) {
        this.results = results;
    }

    public void removeResult() {
        results.remove(0);
    }
}
