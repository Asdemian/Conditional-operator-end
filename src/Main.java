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
    }
}