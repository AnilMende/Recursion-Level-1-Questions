public class CountNoOfSteps {
    public static void main(String[] args) {
        System.out.println(countSteps(14));
    }
    static int countSteps(int num){
        return helper(num,0);
    }
    private static int helper(int num, int steps){
        if(num == 0){
            return steps;
        }
        //if the number is even, increment the count by 1 and divide the number by 2
        //if the number is odd, increment the count by 1 and substract the number with 1
        if(num % 2 == 0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}
