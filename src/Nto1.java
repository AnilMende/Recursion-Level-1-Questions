public class Nto1 {
    public static void main(String[] args) {
        //print(5);
        //printReverse(5);
        printBoth(5);
    }
    static void print(int n){
        if(n == 0){
            //System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    //Recursion pauses execution, dives deeper,
    // then resumes line-by-line while coming up
    // using the values saved in each stack frame.
    static void printReverse(int n){
        if(n == 0){
            return;
        }
        printReverse(n-1);
        System.out.println(n);
    }

    static void printBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
