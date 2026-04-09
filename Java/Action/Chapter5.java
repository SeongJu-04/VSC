package Action;
/* 
class Television{
    public Television() {

    }
    public int volume;
    public boolean onOff;

}

public class Chapter5 {
    public static void main(String args[]){
        Television tv1 = new Television();
        Television tv2 = tv1;

    }    
}

*/

class Math{
    public Math() {
       
    }
    public static int abs(int x) {
        return x > 0 ? x : -x;
    }
    public static int power(int base, int exponent) {
        int result = 1;
        for(int i = 1; i <= exponent; i++)
            result *= base;
        return result;
    }
}

public class Chapter5 {
    public static void main(String args[]){
    System.out.println("10의 3승은 " + Math.power(10,3));
    }
}