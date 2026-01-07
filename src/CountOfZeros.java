public class CountOfZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(40030));
    }
    static int countZeros(int n){
        return helper(n,0);
    }

    //this is special pattern where we are directly returning the value
    //when the base condition is true
    private static int helper(int n, int count){
        //when n becomes 0 directly return the count from that point
        if(n == 0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            //rem is 0 then increase the count by 1 and
            //decrease the number by 1 digit
            return helper(n/10,count+1);
        }
        //if the rem is not zero then the count will not change
        //and decrease the number by 1 digit
        return helper(n/10,count);
    }
}
