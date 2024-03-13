//how many zero in any binary number
import java.util.Scanner;

public class cout_set_bits_in_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number: ");
        int num=sc.nextInt();//eg:--4(100)
        int count=0;
        while(num!=0){//4!=0
            if((num&1)==0){//100 & 001==0
                count++;//cout=1
            }
            num=num>>1;//num=10....and repeat it
        }
        System.out.println(count);
        sc.close();
    }
}
