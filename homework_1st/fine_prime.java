public class fine_prime {
    public static void main(String[] args) {
        for(int i = 100; i <= 200; i ++) {
            int cnt = 0;
            boolean res = true;
            for(int j = 2; j < i ; j ++) {
                if(i % j == 0) {
                    res = false;
                    break;
                }
            }
            if(res) System.out.print(i + " ");
        }
    }
}
