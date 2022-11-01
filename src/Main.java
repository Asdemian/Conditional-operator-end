public class Main {
    public static void main(String[] args) {
        //task 1
        int amanOfYears = 24;
        if (amanOfYears >= 2 && amanOfYears <= 6) {
            System.out.println("Если возраст человека равен " +amanOfYears+ " , то ему нужно ходить в детский садик.");
        } else if (amanOfYears >= 7 && amanOfYears <= 18) {
            System.out.println("Если возраст человека равен " +amanOfYears+ " , то ему нужно ходить в в школу.");
        } else if (amanOfYears > 18 && amanOfYears < 24) {
            System.out.println("Если возраст человека равен " +amanOfYears+ " , то ему нужно ходить в в школу.");
        } else  if (amanOfYears >= 24) {
            System.out.println("Если возраст человека равен " +amanOfYears+ " , то ему нужно ходить на работу.");
        }
        //task 2
        int theChildIsYearsOld = 15;
        if (theChildIsYearsOld < 5) {
            System.out.println("Ребеное не может кататься на атракционе.");
        } else if (theChildIsYearsOld < 14) {
            System.out.println("Ребеное может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Ребеное может кататься без сопровождения взрослого.");
        }
        //task3
        int one = 700;
        int two = 700;
        int three = 700;
        if (one > two) {
            if (one >= three) {
                System.out.println("Большее число " + one);
            } else {
                System.out.println("Большее число " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Большее число " +two);
                    }
                 else {
                    System.out.println("Большее число " +three);
                }
        } else {
                if (one > three) {
                System.out.println("Большее число " +one);
            } else if (three > one) {
                System.out.println("Большее число " +three);
            } else {
                System.out.println("Числа равны");
            }
        }
    }
}