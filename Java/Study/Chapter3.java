/* 
import java.util.*;
public class Chapter3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력하시오");
        String str = sc.nextLine();
        //기본 배열 입력 및 생성
        String [][] arr = new String[1][2]; // 배열 생성시 var 은 불가능 

        // ragged 사용연습
        int [][] ragged = new int[3][]; // 행이 0,1,2안 ragged 형식
        ragged[0] = new int[4];
        ragged[1] = new int[3];
        ragged[2] = new int[2];

        var number = 1;
        for(int i = 0; i < ragged.length; i++) {
            // 각 행의 길이(ragged[i].length)만큼만 반복하므로 안전합니다!
                for(int k = 0; k < ragged[i].length; k++) {
                    ragged[i][k] = number; // 1, 2, 3... 순서대로 값 넣기
                    number++;
                }
            }   
        for(int i = 0; i < ragged.length; i++){
            for(int k = 0; k < ragged[i].length; k++){
            System.out.print(ragged[i][k]);
            }
            System.out.println();
        }
           //ArrayListd의 생성 및 활용 방법;
           ArrayList<String> list = new ArrayList<>();
           list.add("apple");
    }
}

import java.util.*;

public class Chapter3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        //random 클래스 활용 1)
        Random rand = new Random();
        int num = rand.nextInt(99)+1;
        //random 클래스 활용 2)
        int num2 = (int)(Math.random() * 99) + 1;
        var count = 0;
        while(true){
            System.out.print("정답을 추측하여 보시오:");
            int guess = sc.nextInt();
            if(num == guess) {
                System.out.println("똑같다");
                break;
            }
            if(num < guess) {
                System.out.println("더 작은 수입니다");
            }
            if(num > guess) {
                System.out.println("더 큰 수입니다.");
            }
            count++;
        }
        System.out.println("시도는"+count+"번 했습니다");
    }
}
*/