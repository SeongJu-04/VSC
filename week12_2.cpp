#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Shape {
protected:
    int x, y;
    string color;

public:
    Shape(int x= 0, int y = 0, string c = "") : x(x), y(y), color(c) {}
    
    virtual ~Shape() {}
    virtual double getArea() = 0;
    virtual void print() = 0; 
};


class Circle : public Shape {
    int radius;
public:
    Circle(int x, int y, string c, int r) : Shape(x, y, c), radius(r) {}

    double getArea() override {
        return 3.14 * radius * radius;
    }

    void print() override {
        cout << "원은 (" << x << ", " << y << ")에 위치하며 색상은 "<< color << "이고 면적은 " << getArea() << "입니다." << endl;
    }
};


class Rectangle : public Shape {
    int width;
    int height;
public:
    Rectangle(int x, int y, string c, int w, int h) : Shape(x, y, c), width(w), height(h) {}

    double getArea() override {
        return (double)width * height;
    }

    void print() override {
        cout << "사각형은 (" << x << ", " << y << ")에 위치하며 색상은 "<< color << "이고 면적은 " << getArea() << "입니다." << endl;
    }
};

class Triangle : public Shape {
    int width;
    int height; 
public:
    Triangle(int x, int y, string c, int w, int h) : Shape(x, y, c), width(w), height(h) {}

    double getArea() override {
        return (double)width * height / 2.0;
    }

    void print() override {
        cout << "삼각형은 (" << x << ", " << y << ")에 위치하며 색상은 " 
             << color << "이고 면적은 " << getArea() << "입니다." << endl;
    }
};

int main() {
    vector<Shape*> shapes;

    shapes.push_back(new Rectangle(100, 200, "blue", 300, 400));

    shapes.push_back(new Circle(100, 200, "white", 300));

    shapes.push_back(new Triangle(100, 200, "yellow", 300, 400));
    
    for (int i = 0; i < shapes.size(); i++) {
        shapes[i]->print();
    }

    for (int i = 0; i < shapes.size(); i++) {
        delete shapes[i];
    }

    return 0;
}