public class Reverse {
    static int sum = 0;
    static void rev1(int n){
        if(n == 0){
            return;
        }
        //getting the last digit
        int rem = n % 10;
        //adding to the sum
        sum = sum * 10 + rem;
        //reinitalizing the n value
        //calling the function
        rev1(n/10);
    }

    static int rev2(int n){
        //to find the number of digits in a number
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        //to get the last digit in the number
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
    public static void main(String[] args) {
        //rev1(1234);
        //System.out.println(sum);
        System.out.println(rev2(1234));
    }
}
