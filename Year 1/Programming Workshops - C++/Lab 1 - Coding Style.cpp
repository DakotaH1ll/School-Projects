/**
* Author	Dakota Hill
* Version	1.0
* Created	2014-01-15
**/

/**
This program is used to display a graph showing the individual production
totals for each specific plant the company owns. 
The prodcution numbers for every plant are entered by the user
and the end result is an array displaying every plant with its prodcution
data.
**/

#include <iostream>
#include <cmath>

using namespace std;
const int kConstant = 3;

void PrintPlant(int a[], int total_plants); //Displays the current plant number that is being asked about
void UnitsProduced(const int production_array[], int total_plants); //Creates the array
void EnterUnits(int& sum); //Gets the production number and adds it to the array
void DrawStar(int maximum); //Draws a star

int main( )
{
    int production[kConstant];
    cout << "This program displays a graph showing\n"
	cout << "production for each factory in the company.\n";
    PrintPlant(production, kConstant);
    CreateIndex(production, kConstant);
    UnitsProduced(production, kConstant);
    return 0;
}

void PrintPlant(int a[], int total_plants)
{
    for (int plant_number = 1;plant_number <= total_plants; plant_number++)
    {
        cout << endl << "Enter production data for plant number " 
			 << plant_number << endl;
        EnterUnits(a[plant_number - 1]);}}


void UnitsProduced(const int production_array[], int total_plants)
{
    cout << "\nUnits produced in thousands of units:\n";
    for (int plant_number = 1; plant_number <= total_plants; plant_number++)
    {
        cout << "Factory #" << plant_number << " ";
        DrawStar(production_array[plant_number - 1]);
        cout << endl;
    }
}

void EnterUnits(int& sum)
{
    cout << "Enter number of units produced by each department.\n" 
	cout << "Append a negative number to the end of the list.\n";
    sum = 0; int units_produced;
    cin >> units_produced;
    while (units_produced >= 0) {
		sum = sum + units_produced;
		cin >> units_produced;
    } cout << "Total = " << sum << endl;
}

void DrawStar(int maximum) {
    for (int count = 1; count <= maximum; count++) cout << "*";
}
