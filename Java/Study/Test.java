/* 
import java.util.*;

// 1. 클래스 이름은 대문자로 시작 (Person)
class Person {  
    private String name;
    private int age;
    
    public Person() { }
    
    public Person(String name, int age) { 
        this.name = name;
        this.age = age;
    }
    
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public String getName() { return name; }
    public int getAge() { return age; }
}

class Student extends Person {
    private String studentId;
    
    public Student(String name, int age, String studentId) {
        super(name, age); 
        this.studentId = studentId;
    }
}

class Professor extends Person {
    private String employeeId; // 실무에서 자주 쓰이는 employeeId로 변경
    
    public Professor(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
}

// 2. 클래스 이름은 대문자로 시작 (Lesson)
class Lesson {
    private String subject; // 과목명
    private ArrayList<Student> students; // 수강생 목록
    private Professor professorCharge; // 담당교수

    // 생성자 (교수 객체와 과목명을 받음)
    public Lesson(Professor professorCharge, String subject){
        this.professorCharge = professorCharge;
        this.subject = subject;
        this.students = new ArrayList<>(); // 리스트 초기화 아주 좋습니다!
    }
    
    // 3. 단수형 매개변수 사용
    public void 수강신청(Student student) {
        this.students.add(student);
        System.out.println(student.getName() + " 학생이 " + this.subject + " 과목 수강신청을 완료했습니다.");
    }
}

public class Test {
    public static void main(String args[]) {
        // 1. 교수 객체 생성
        Professor 김현우 = new Professor("김현우", 34, "20240922");
        
        // 2. 강의 객체 생성 ('전공강의' -> 'Lesson'으로 수정, 문자열 대신 교수 객체 전달)
        Lesson 자바이론 = new Lesson(김현우, "Java 이론"); 
        
        // 3. 학생 객체 생성 및 수강신청
        Student 학생1 = new Student("이은재", 21, "2012311");
        자바이론.수강신청(학생1);
        
        // 4. 변수에 담지 않고 생성과 동시에 수강신청도 가능합니다!
        자바이론.수강신청(new Student("김민재", 22, "20250211"));
    }
}
*/
