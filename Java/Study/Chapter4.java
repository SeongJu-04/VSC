

/*
public class Chapter4 {
    public static void main(String args[]){
        Chapter4_1 obj = new Chapter4_1(); 

        obj.turnOn();
        var answer = obj.toString();
        System.out.println(answer);
    }
}

public class Chapter4{
    int channel;
    int volume;
    boolean onOff;

    public static void main(String args[]){
        Chapter4 tv1 = new Chapter4();
        tv1.channel = 1;
        tv1.volume = 10;
        tv1.onOff = true;

        Chapter4 tv2 = new Chapter4();
        tv2.channel = 22;
        tv2.volume = 222;
        tv2.onOff = false;

        System.out.println(tv1.channel + " and " + tv1.volume + " and " + (tv1.onOff == true? "켜짐" : "꺼짐"));
        System.out.println(tv2.channel + " and " + tv2.volume + " and " + (tv2.onOff == true? "켜짐" : "꺼짐"));
    }
}


import java.util.*;

class box{
    int x, y;
    public box() {
        x = 100;
        y = 200;
    }
    public box(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Chapter4{
    public static void main(String args[]){
        box obj1 = new box();
        box obj2 = new box(1,2);
        System.out.println(obj2.x + " and " + obj2.y);
    }
}


*/

import java.util.*;

public class Chapter4{
    private String username;
    private String password;
    
    public Chapter4(){
    }

    public String getName() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setName(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Chapter4 obj = new Chapter4();
        System.out.print("username을 입력하시오 ");
        String username = sc.nextLine();
        obj.setName(username);
        System.out.print("password을 입력하시오 ");
        String password = sc.nextLine();
        obj.setPassword(password);

        System.out.println("username은 " + obj.getName() + "password는 " + obj.getPassword());

    }
}