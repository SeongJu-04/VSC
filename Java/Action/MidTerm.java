import java.util.*;

// JVM 은 자바에 있는 가상 컴퓨터의 개념. JVM이 있기 때문에 동적할당시 다른 고급언어와는 다르게 자동 해제 & public static void main()문 먼저 실행 
// JVM 안에 Garbage Collector가 있음 
// 변수의 경우 낙타체(단어 시작 대문자),의미있는 이름(가독성),약어 지양(가독성)
// 클래스 첫문자 대문자 그 이후 단어시작 대문자, 변수 첫문자 소문자 그 이후 단어시작 대문자, 상수 모든 알파벳 대문자
// 기초형과 참조형의 차이 = 기초형(int double 등등) 실제 데이터값이 저장되고 참조형의 경우(배열, 인터페이스,클래스) 해당 값의 주소를 참조하는 형태
// 자바의 경우 장점 4가지: 캡슐화, 상속, 다형성, 추상화 
// 캡슐화 안에는 정보은닉, 소프트웨어 캡슐, 공개인터페이스가 있음. 
class JavaType {
    private String javaSE, javaEE, javaME, javaFX;
    public JavaType() { // 기본 생성자 
    }
    public JavaType(String javaSE, String javaEE, String javaME, String javaFX) { // 다양한 매개변수를 받는 생성자 
        this.javaSE = javaSE;
        this.javaEE = javaEE;
        this.javaME = javaME;
        this.javaFX = javaFX;
    }
    public String getJavaSE() {return javaSE;} // 접근자 
    public String getJavaEE() {return javaEE;}
    public String getJavaME() {return javaME;}
    public String getJavaFX() {return javaFX;}
    public void getJavaSE(String javaSE) {this.javaSE = javaSE;} // 설정자 

}
class Parent{
    public void introduce() {
        System.out.println("Person");
    }
    public Parent() {}       

}
class Child extends Parent{
    public Child() {
        super();
    }

    @Override
    public void introduce() {
        System.out.println("Override되어 바뀐 문장");
    }
    
}
public class MidTerm { // public class 의경우 2개 이상이면 안되면 한개도 없을 경우 소스코드 파일명과 일치하는 일반 class가 있어야함. 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아무문자나 입력해주세요");
        String str = sc.nextLine();

        JavaType obj = new JavaType("기본형","대규모 작업시 사용","모바일과 임베디드", "모바일");
        System.out.println("javaSE " + obj.getJavaSE() + " javaEE " + obj.getJavaEE() + " javaME " + obj.getJavaME() + " javaFX " + obj.getJavaFX());
    }
    
}
