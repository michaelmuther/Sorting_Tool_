public class Main {

    public static void main(String[] args) {
        Input i = new Input();
        Calculation c = new Calculation(i.getInput());
        Output o = new Output();
        o.printTotalNumbers(c.getNumbers());
        o.printGreatestNumber(c.getGreatest(), c.getAmount());
    }
}
