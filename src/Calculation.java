import java.util.ArrayList;

public class Calculation {

    private int numbers, greatest, amount;
    private ArrayList<Integer> input;

    public Calculation(ArrayList<Integer> input) {
        this.input = input;
        calculations();
    }

    private void calculations() {
        numbers = input.size();
        greatest = Integer.MIN_VALUE;
        amount = 0;
        for(Integer i:input) {
            greatest = i > greatest ? i : greatest;
        }
        for(Integer i:input) {
            if(i == greatest) {
                amount++;
            }
        }
    }

    public int getNumbers() {
        return numbers;
    }

    public int getGreatest() {
        return greatest;
    }

    public int getAmount() {
        return amount;
    }
}
