package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        if (number % 5 == 0 && number % 11 == 0){
            System.out.println("Divisable");
        } else {
            System.out.println("Non-Divisable");
        }
    }
}
