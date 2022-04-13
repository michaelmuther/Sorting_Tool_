import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    private ArrayList<Integer> input = new ArrayList<>();
    private Scanner s = new Scanner(System.in);

    public Input() {
        while (s.hasNext()) {
            input.add(s.nextInt());
        }
    }

    public ArrayList<Integer> getInput() {
        return input;
    }
}
