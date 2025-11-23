#include <iostream>

using namespace std;

class animal {
    string name;
    int age;
public:
    animal(string name = "",int age = 0) : name(name), age(age) {}
    void Setname(string name) {
       this->name = name;
    }
    string Getname() {
        return name;
    }
    void Setage(int age) {
        this->age = age;
    }
    int Getage() {
        return age;
    }

    virtual void speak() {
        cout << name << "는 " << age << "살이고 소리를 내지 않습니다." << endl;
    }
};

class Dog : public animal {
    string breed;
public:
    Dog(string name,int age, string breed) : animal(name,age), breed(breed) {}
    void speak() {
        cout << Getname() << "는 " << Getage() << "살이고 " << breed << "이며 멍멍! 라고 짖습니다." << endl;
    }
};

class Cat: public animal {
    string color;
public:
        Cat(string name,int age, string color) : animal(name,age), color(color) {}
    void speak() {
        cout << Getname() << "은 " << Getage() << "살이고 " << color <<"인 고양이이며 야옹~ 이라고 울어대고 있습니다" << endl;
    }
};

int main(void) {                                                                                                                                                                                                     
    animal* a[3];
    a[0] = new animal("뽀삐", 3);
    a[1] = new Dog("백구", 2, "진돗개");
    a[2] = new Cat("톰", 1, "검은색");

for(int i = 0; i < 3; i++) {
    a[i]->speak();

}
delete a[0];
delete a[1];
delete a[2];

return 0;
}

