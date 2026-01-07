public class DigitProduct {
    public static void main(String[] args) {
        //System.out.println(product(1234));
        System.out.println(digitProduct(12345));
    }
    static int digitProduct(int  n){
        //if one digit is remaining then return that digit
        //ex : 1 % 10 == 1
        if(n%10 == n){
            return n;
        }
        return (n%10) * digitProduct(n/10);
    }

    //Without Recursion
    static int product(int n){
        int prod = 1;

        while(n > 0){
            prod *= n % 10;
            n /= 10;
        }
        return prod;
    }
}
