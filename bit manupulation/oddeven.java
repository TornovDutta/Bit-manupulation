//if the number is odd ,then the binary number end with one
//and the number is even ,then the binary number end with even
import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int num=sc.nextInt();
        int newnumber=num&1;
        if(newnumber==0){
            System.out.println("the numer is even");
        }else{
            System.out.println("the numbet is odd");
        }
        //here we only focus with the lsb of the number 
        //if lsb is 1 then the number is odd or it will be even
        sc.close();
    }
}
