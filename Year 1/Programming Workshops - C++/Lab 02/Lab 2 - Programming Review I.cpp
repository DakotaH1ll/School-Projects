#include <iostream>
#include <string>

using namespace std;

void calculateArea(string shape, float d1, float d2);
const pi = 3.14;

int main( )
{
    calculateArea("Circle", 52, 0);
    return 0;
}

void calculateArea(string shape, float d1, float d2) {
    if (shape.compare("Rectangle") == 0) {
        if (d1 <= 0 || d2 <= 0) 
            cout << shape << " has bad value for side!";	
        else {
            cout << "The area of the " 
                 << shape << " is: " << (d1 * d2);
        }
    } else if (shape.compare("Square") == 0) {
        if (d1 <= 0 || d2 <= 0) 
            cout << shape << " has bad value for side!";
        else {
            cout << "The area of the " 
                               << shape << " is: " << (d1 * d2);
        }
    } else if (shape.compare("Right Triangle") == 0) { //Extract
        if (d1 <= 0 || d2 <= 0) 
            cout << shape << " has bad value for side!";
        else {
            cout << "The area of the " 
                               << shape << " is: " << ((d1 * d2) / 2); 
        }
    } else if (shape.compare("Circle") == 0) {
        if (d1 <= 0)
            cout << shape << " has bad value for radius!";
        else {
            cout << "The area of the " 
                               << shape << " is: " << (pi * d1 * d1);
        }
    } else {
        cout << "Unknown shape!";
    }
    cout << endl;
}
