package concept;
//get bit
public class get_bit {
    public static void main(String[] args) {
       int n=5,pos=2;//5-->0101;
       int bitwash =1<<pos;//bitwash-->100(001<<2)
       if((bitwash & n)==0){
        //100&101=100
        System.out.println("bit is zero");
       }else{
        System.out.println("bit is one");
       }
       //in n=5; 5-->0101, position 2 is 0-->1<--01
       //the index start with zero and go through right to left
    }
}
