package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = numberToPrint;
        if(power == 0) {
            result = 0;
            System.out.println(result);
            return;
        }
        for (int i = 1; i < power; i++) {
            result = result * numberToPrint;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
