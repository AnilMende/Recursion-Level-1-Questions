public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    //Factorial of n is n * (n-1)*(n-2).....
    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
