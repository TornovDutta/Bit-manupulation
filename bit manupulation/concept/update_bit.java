package concept;
//update bit
public class update_bit {
    public static void main(String[] args) {
        //set bit
        //for update bit to 1 ,we use set bit concept
        int n=5,pos=1,bitmask=1<<pos;
        int newnumber=(bitmask|n);
        System.out.println(newnumber);
        //here the number n=5-->101
        //position 1 has zero in the n
        //or fuction use to set the zero into 1



        //clear bit
        //for update bit to 0,we use clear bit concept
        int newbitmask=~(bitmask);
        int newnumber02=newbitmask&n;
        System.out.println(newnumber02);
        //here the number n=7-->111
        //position 1 has one in the n
        //or fuction use to clear the one into zero
    }
}
