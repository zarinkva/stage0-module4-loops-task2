package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int i = 0;
            int result = 1;
            while (i <= power) {
                System.out.println(result);
                result *=2;
                i++;
            }
        }
    }

    public static void main(String[] args) {
PowerOfTwo powerOfTwo=new PowerOfTwo();
powerOfTwo.printPower(10);
    }
}
