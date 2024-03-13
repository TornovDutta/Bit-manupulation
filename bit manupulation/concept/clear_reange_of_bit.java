package concept;
//here we clear middle bits on a number
import java.util.*;
public class clear_reange_of_bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking input of number and left and right index form user
        System.out.println("enter your number: ");
        int n=sc.nextInt();
        System.out.println("enter the index of left bit and right bit");
        int left=sc.nextInt();
        int right=sc.nextInt();
        //we need a number which has zero in middle
        //like if the num is 11111111,then we need 11000001
        //here right index is 1 and left index is 5

        //to make  11000001 
        //we need 11000000 and 000000001
        //or funtion
        //a varible makes 11000000
        //~0-->1111111111.......
        int a=(~0)<<(left);
        //b varible makes 000000001
        int b=~(1<<right);
        int bitmask=a|b;//11000001
        int newnumber=bitmask&n;//11000001 & 11111111
        System.out.println(newnumber);
        sc.close();
    }
}
