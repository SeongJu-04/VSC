import java.util.*;

abstract class Character {
    String name;
    int level;
    int hp;

    abstract void action();
}

class Student extends Character {
    HashMap<String, Integer> skills = new HashMap<>();
    HashMap<String, Integer> failCount = new HashMap<>();

    public Student(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 100;

        skills.put("Java", 10);
        skills.put("Hardware", 10);
        skills.put("Network", 10);

        failCount.put("Java", 0);
        failCount.put("Hardware", 0);
        failCount.put("Network", 0);
    }

    @Override
    void action() {}

    public void study(String subject) {
        int gain = new Random().nextInt(6) + 5;
        skills.put(subject, skills.get(subject) + gain);
        hp -= 2;

        System.out.println(subject + " 공부 +" + gain + " (체력 -2)");
    }

    public void rest() {
        Random r = new Random();
        int heal = r.nextInt(6) + 5;
        hp += heal;

        List<String> keys = new ArrayList<>(skills.keySet());
        String randomSkill = keys.get(r.nextInt(keys.size()));
        int loss = r.nextInt(3) + 3;

        skills.put(randomSkill, Math.max(0, skills.get(randomSkill) - loss));

        System.out.println("휴식: 체력 +" + heal);
        System.out.println(randomSkill + " -" + loss);
    }
}

class Assignment {
    String subject;
    int remaining = 3;

    public Assignment(String subject) {
        this.subject = subject;
    }
}

class GameManager {
    static int day = 1;
    static int totalSuccess = 0;
    static int totalFail = 0;
}

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    static String[] subjects = {"Java", "Hardware", "Network"};
    static HashMap<String, Assignment> assignmentMap = new HashMap<>();

    public static void main(String[] args) {

        System.out.print("이름 입력: ");
        String name = sc.nextLine();
        Student p = new Student(name);

        for (String s : subjects) {
            assignmentMap.put(s, new Assignment(s));
        }

        while (true) {

            if (p.hp <= 0) {
                System.out.println("체력 0 → 게임 종료");
                break;
            }

            if (isAllDone()) {
                showResult();
                break;
            }

            System.out.println("\n=== Day " + GameManager.day + " ===");
            System.out.println("1. 공부  2. 휴식  3. 과제  4. 상태  0. 종료");

            int choice = getIntInput();

            switch (choice) {
                case 1:
                    chooseStudy(p);
                    GameManager.day++;
                    break;
                case 2:
                    p.rest();
                    GameManager.day++;
                    break;
                case 3:
                    doAssignment(p);
                    GameManager.day++;
                    break;
                case 4:
                    showStatus(p);
                    break;
                case 0:
                    System.out.println("게임 종료");
                    return;
            }
        }
    }

    public static int getIntInput() {
        while (true) {
            try {
                System.out.print("입력: ");
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("숫자만 입력하세요.");
            }
        }
    }

    public static void chooseStudy(Student p) {
        System.out.print("과목 선택: ");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print((i + 1) + "." + subjects[i] + "  ");
        }
        System.out.println();

        int choice = getIntInput();

        if (choice >= 1 && choice <= subjects.length) {
            p.study(subjects[choice - 1]);
        } else {
            System.out.println("잘못된 선택");
        }
    }

    public static void doAssignment(Student p) {

        System.out.println("과제 선택 (※ 성공률은 현재 능력치 기반)");

        for (int i = 0; i < subjects.length; i++) {
            String sub = subjects[i];
            Assignment a = assignmentMap.get(sub);
            int skill = p.skills.get(sub);

            System.out.print((i + 1) + "." + sub);
            System.out.print(" [남은:" + a.remaining + "]");
            System.out.print(" [성공률:" + skill + "%]");

            if (p.failCount.get(sub) >= 3) {
                System.out.print(" (포기)");
            }

            System.out.print("   ");
        }
        System.out.println();

        int choice = getIntInput();

        if (choice < 1 || choice > subjects.length) {
            System.out.println("잘못된 선택");
            return;
        }

        String subject = subjects[choice - 1];
        Assignment a = assignmentMap.get(subject);

        if (p.failCount.get(subject) >= 3) {
            System.out.println(subject + " 과목은 이미 포기한 상태입니다");
            return;
        }

        if (a.remaining <= 0) {
            System.out.println(subject + " 과제는 이미 완료됨");
            return;
        }

        System.out.println(subject + " 과제 시작!");

        int skill = p.skills.get(subject);
        int chance = rand.nextInt(100);

        if (chance < skill) {
            System.out.println("과제 성공!");
            a.remaining--;
            GameManager.totalSuccess++;
        } else {
            System.out.println("실패... 체력 -30");
            p.hp -= 30;

            p.failCount.put(subject, p.failCount.get(subject) + 1);
            GameManager.totalFail++;

            if (p.failCount.get(subject) >= 3) {
                System.out.println(subject + " 과목은 포기해야합니다");
                a.remaining = 0;
            }
        }
    }

    public static boolean isAllDone() {
        for (Assignment a : assignmentMap.values()) {
            if (a.remaining > 0) return false;
        }
        return true;
    }

    public static void showStatus(Student p) {
        System.out.println("\n[상태]");
        System.out.println("체력: " + p.hp);

        System.out.print("능력치: ");
        for (String key : p.skills.keySet()) {
            System.out.print(key + "(" + p.skills.get(key) + ") ");
        }
        System.out.println();
    }

    public static void showResult() {
        System.out.println("\n=== 최종 결과 ===");
        System.out.println("성공: " + GameManager.totalSuccess);
        System.out.println("실패: " + GameManager.totalFail);

        int fail = GameManager.totalFail;

        if (fail == 0) System.out.println("학점: A");
        else if (fail == 1) System.out.println("학점: B");
        else System.out.println("학점: C+");
    }
}
