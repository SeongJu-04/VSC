package Study;
import java.util.*;

class Weapon{
    private String name;
    private int damage;
    final int MAX_DURABILITY = 100;
    public Weapon() {    }
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    public Weapon(Weapon p1) {
        p1 = new Weapon(p1.name,p1.damage);
    }
    public String getName() { return name;}
    public int getDamage() {return damage;}

}

class Character {
    protected String name;
    protected int hp;
    static int characterCount = 0;
    public Character(String name,int hp) {
        this.name = name;
        this.hp = hp;
        characterCount++;
    }
    public void attack() {
        System.out.println("출력");
    }
    public final void die() {
        System.out.println("캐릭터가 사망했습니다.");
    }
}

class Hero extends Character {
    private Weapon myWeapon;
    public Hero(String name, int hp,Weapon w1) {
        super(name,hp);
        myWeapon = new Weapon(w1);
    }

    @Override 
    public void attack() {
        System.out.println( this.name + " 용사가 " + myWeapon.getName() + "으로 공격하여 " + myWeapon.getDamage()+ "의 피해를 줍니다!");
    }
    public void attack(String skillName) {
        System.out.println(this.name+" 용사가 " + myWeapon.getName() + "스킬을 시전합니다!");
    }
}

class Monster extends Character { 
    public Monster(String name, int hp) {
        super(name,hp);
    }
    public void roar() {
        System.out.println("크아아앙! 덤벼라");
    }
    @Override 
    public void attack() {
        System.out.println(this.name + " 몬스터가 무서운 발톱으로 공격합니다!");
    }
}

public class Practice1 {
    public static void main(String args[]) {
        Weapon wp = new Weapon("전설의 검", 50);
        
        ArrayList<Character> obj = new ArrayList<>(2); // ArrayList에서 L 대문자 
        obj.add(new Hero("홍성주", 100, wp)); // 이 부분은 ArrayList 를 썼을 떄 방식
        obj.add(new Monster("이장주", 200));
        // obj[0] = new Hero("홍성주",100, wp); // 이부분에서 오류가 발생하는 이유는 ArrayList 의 경우 이방식으로 불가능 

        System.out.println("------전투 시작 ------");
        // for(obj s: ) {                      //이부분 확실히 모름  
        for(Character s: obj) {
            s.attack();
            if( s instanceof Monster) {
                Monster m = (Monster) s;
                m.roar();
            }
            System.out.println("-----------------");
        }
        System.out.println("현재까지 생성된 총 캐릭터 수: " + Character.characterCount + "명");
    }
}
