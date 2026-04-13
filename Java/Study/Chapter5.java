package Study;
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


import java.util.*;

class Rect{
    int width, height;
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    double getArea(){ 
        return (double)(width*height);
    }
}

public class Chapter5{

    public static void main(String args[]) {
        Rect[] obj = new Rect[5];
        
        for(int i = 0; i < obj.length; i++){
            obj[i] = new Rect(i,i);
        }
        for(int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].getArea());
        }
    }
}


import java.util.*;

class Movie {
    public String title;
    public String director;

    public Movie(String title,String director) {
        this.title = title;
        this.director = director;
    }

    public String getAnswer() {
        return (title +" " + director);
        }

}

public class Chapter5{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("몇개의 영화를 저장하시겠습니까?");
        int count = sc.nextInt();
        Movie[] obj = new Movie[count];
        for(int i = 0; i < count; i++){
            System.out.print("저장할 제목과 감독을 적어주세요");
            String title = sc.next();
            String director = sc.next();
            obj[i] = new Movie(title,director);
        }

        for(int i = 0; i < count; i++){
            System.out.println("제목과 감독은" + obj[i].getAnswer() + "입니다");
        }
    }
}


import java.util.*;

public class Chapter5{

    public static void main(String args[]){

        try{
            int result = 10/0;
        }
        catch(ArithmeticException e){ //catch () 안에 예외 타입을 넣을 변수가 있어야함
            System.out.println("오류발생");
        }
        finally {
            System.out.println("이것도 출력됨?");
        }
    }
}

import java.util.*;

public class Chapter5{
    public static double minArray(double[] list) {
        double min = list[0];

        for(int i = 1; i< list.length; i++){
            if(list[i]<min)
        }
    }

    public static void main(String args[]) {

    }
}

*/