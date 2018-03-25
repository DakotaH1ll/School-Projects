/* Created by Dakota James Hill on January 22nd 2014
Version 1.0 of a method of bubble sorting
seven characters in an array*/

#include "stdafx.h"
#include <array>	//Include statements such as array and iostream
#include <iostream>

using namespace std;

int _tmain(int argc, _TCHAR* argv[])
{
char characters[] = {'a', 'c', 'g', 'j', 'a', 'c', 'd'}; //The array of characters 
														 //To be sorted

if (characters[0] > characters[1])		//Comparing the first two characters
	swap(characters[0], characters[1]);	//Swapping them if the first is larger	

if (characters[1] > characters[2])		//Comparing the next two characters
	swap(characters[1], characters[2]); //Swapping them if the first is larger

if (characters[2] > characters[3])		//Comparing the next two characters
	swap(characters[2], characters[3]); //Swapping them if the first is larger

if (characters[3] > characters[4])		//Comparing the next two characters
	swap(characters[3], characters[4]); //Swapping them if the first is larger

if (characters[4] > characters[5])		//Comparing the next two characters
	swap(characters[4], characters[5]); //Swapping them if the first is larger

if (characters[5] > characters[6])		//Comparing the next two characters
	swap(characters[5], characters[6]); //Swapping them if the first is larger

/* Here the process repeats, because it does not work upon the first attempt
this can also be used a failsafe, to ensure thats none of the values 
change if it is properly sorted */

if (characters[0] > characters[1])
	swap(characters[0], characters[1]);

if (characters[1] > characters[2])
	swap(characters[1], characters[2]);

if (characters[2] > characters[3])
	swap(characters[2], characters[3]);

if (characters[3] > characters[4])
	swap(characters[3], characters[4]);

if (characters[4] > characters[5])
	swap(characters[4], characters[5]);

if (characters[5] > characters[6])
	swap(characters[5], characters[6]);

/* Here the process repeats, because it does not work upon the first attempt
this can also be used a failsafe, to ensure thats none of the values 
change if it is properly sorted */

if (characters[0] > characters[1])
	swap(characters[0], characters[1]);

if (characters[1] > characters[2])
	swap(characters[1], characters[2]);

if (characters[2] > characters[3])
	swap(characters[2], characters[3]);

if (characters[3] > characters[4])
	swap(characters[3], characters[4]);

if (characters[4] > characters[5])
	swap(characters[4], characters[5]);

if (characters[5] > characters[6])
	swap(characters[5], characters[6]);

cout << characters[0] << characters[1] << characters[2] << characters[3] <<
	characters[4] << characters[5] << characters[6] << endl;	// The array
																// is displayed
return 0;
}

