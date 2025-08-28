public class Calculator {
    public Boolean is_prime(int num){
        boolean prime = false;
        if (num == 1){
            prime = false;
            System.out.println("Não é primo!");
            return prime;
        }
        if (num > 0){
            int iterator = 1;
            if (!prime) {
                iterator += 1;
                do {
                    int div = num % iterator;
                    if (div != 0) {
                        prime = true;
                        System.out.println("É primo!");
                        return prime;
                    } else {
                        prime = false;
                        System.out.println("Não é primo!");
                        return prime;
                    }
                } while (!prime);
            }

        }

        return prime;
    }
}
