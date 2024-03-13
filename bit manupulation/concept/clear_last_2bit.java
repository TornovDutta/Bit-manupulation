package concept;
//clear last 2 bit
import java.util.*;
public class clear_last_2bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int num=sc.nextInt();//like we need 7 as input
        //7-->111
        int bitmask=(~0)<<2;//111....<<2===...11100
        System.out.println(bitmask&num);//...11100 & 111==100
        sc.close();

    }
}
