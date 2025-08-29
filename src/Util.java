public class Util {
    public Boolean isPrime(int num) {
        if (num <= 1) {
            System.out.println(Message.NOT_PRIME);
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(Message.NOT_PRIME);
                return false;
            }
        }
        System.out.println(Message.PRIME);
        return true;
    }
}
