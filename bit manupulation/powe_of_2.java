//power of 2(1,22,4,8,16...)
//in binary number ever power of 2 number has common pattan
//1-->1
// 2-->10
// 4-->100
// 8-->1000
// 16-->10000
//and one more things
//2 &(2-1)-->10 & 01==0

import java.util.Scanner;

public class powe_of_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        if((num&(num-1))==0){
            System.out.println("number is a power of 2");
        }else{
            System.out.println("number is not a power of 2");
        }
        sc.close();
    }
}
