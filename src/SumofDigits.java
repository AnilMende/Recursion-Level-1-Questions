public class SumofDigits {
    public static void main(String[] args) {
        //System.out.println(sum(1234));
        System.out.println(digitSum(1234));
    }

    //Using Recursion
    static int digitSum(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }

    //Without Recursion
    static int sum(int n){
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
