import java.util.HashSet;

public class cc4{
    public static void main(String[] args) {
        int[] numbers = {3,2,4,-1,1};
        // int[] numbers = {1,2,0};
        // int[] numbers = {2,5,6,-1,5,8};
        System.out.println(missingNumber(numbers));
    }

    private static int missingNumber(int[] numbers){
        HashSet<Integer> set = new HashSet<Integer>();
        int min = numbers[0];
        for (int number : numbers) {
            if(min > number && number >= 0) //Find the lowest number in the array
                min = number;
            set.add(number);                //Put all the number into a set
        }
        for (int i = 0; i < set.size(); i++) {
            if(!set.contains(++min))        //Check whether the incremented "lowest number" is in the set
                return min;                 //if not then the incremented number is the missing positive number
        }
        return 1;
    }
}