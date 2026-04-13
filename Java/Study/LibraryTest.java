package Study;
import java.util.*;

class LibraryMember {
    private String name;
    private String memberId;

    public LibraryMember() {}
    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }
    public String getName() { return name;}
    public String getMemberId() {return memberId;}
    public void setName(String name) { this.name = name;}
    public void setMemberId(String memberId) { this.memberId = memberId;}
    public void printBorrowInfo() {
        System.out.println("이름: " + getName() + " 기본 대출 가능 권수: 3권");
    }
}

class StudentMember extends LibraryMember {
    private String major;
    public StudentMember(String name, String memberId, String major) {
        super(name,memberId);
        this.major = major;
    }

    @Override
    public void printBorrowInfo() {  //접근자 및 반환자도 작성해줘야함
        // TODO Auto-generated method stub
        System.out.println("이름: " + getName() + " 기본 대출 가능 권수: 5권");
    }
}

class FacultyMember extends LibraryMember {
    private String department;

    public FacultyMember(String name, String studentId, String department) {
        super(name,studentId);
        this.department = department;
    }

    @Override
    public void printBorrowInfo() {
        System.out.println("이름:" + getName() + " 교직원 대출 가능 권수: 10권");
    }
}

class Library {
    private String LibraryName;
    private ArrayList<LibraryMember> memberList; // < > 안에 자료형이 들어가야하는데 libraryMember 의 경우 참조 자료형으로 들어갈 수 있음

    public Library(String LibraryName) {
        this.LibraryName = LibraryName;
        this.memberList = new ArrayList<>() ;
    }

    public void addMember(LibraryMember member) { //LibraryMember 의 형태를 가진 데이터를 member 로 하겠다고 정의 
        this.memberList.add(member); 
        System.out.println(member.getName() + "님이 " + this.LibraryName +  "회원으로 등록되었습니다.");
    }

    public void showAllMembersInfo() {
        System.out.println("=== [" + this.LibraryName + "] 전체 회원 대출 정보 ===");
        
        for (LibraryMember member : memberList) {
            // member는 부모 타입이지만, 실제로는 자식 객체들이므로 오버라이딩된 메소드가 알아서 호출됩니다!
            member.printBorrowInfo();
        }
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        // 1. 도서관 생성
        Library centralLibrary = new Library("중앙도서관");

        // 2. 학생과 교직원 객체 생성
        StudentMember student = new StudentMember("홍성주", "S2023001", "컴퓨터공학과");
        FacultyMember faculty = new FacultyMember("김현우", "F1004", "정보통신처");

        // 3. 도서관에 회원 등록 (업캐스팅 발생!)
        centralLibrary.addMember(student);
        centralLibrary.addMember(faculty);

        System.out.println("-------------------------");

        // 4. 전체 회원 대출 정보 출력 (다형성 확인!)
        centralLibrary.showAllMembersInfo();
    }
}