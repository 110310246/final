#include <iostream>
#include <cstdlib>
#include <string>

using namespace std;

class Shape {
public:
    virtual double area() = 0;
    virtual void setWidth(double w) {
        width = w;
    }
    virtual void setHeight(double h) {
        height = h;
    }
protected:
    double width;
    double height;
};

class Rectangle : public Shape {
public:
    double area() {
        return width * height;
    }
};

class Circle : public Shape {
public:
    double area() {
        return 3.14 * width * width;
    }
};

class Triangle : public
