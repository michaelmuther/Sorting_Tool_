
public class Output {

    public void printTotalNumbers(int numbers) {
        final String TOTAL = "Total numbers: %d.\n";
        System.out.printf(TOTAL, numbers);
    }

    public void printGreatestNumber(int number, int amount) {
        final String GREATEST = "The greatest number: %d (%d time(s)).\n";
        System.out.printf(GREATEST, number, amount);
    }
}
