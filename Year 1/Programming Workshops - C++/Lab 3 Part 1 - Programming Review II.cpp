/* Created by Dakota James Hill (Student number 100523538) on January 29th 2014
it is version 2.0 of a bubble sorting program originally created on January
22nd 2014. It was used to sort characters in an array alphabetically.
The update adds the ability to also sort integers in increasing
order. Numbers are inserted at the begininning, and the output
should be a sorted list of the numbers fed into the program
using the array to_sort, as well as an alphabetical list of the letters
given*/

#include "stdafx.h"
#include <array>	//Include statements such as array and iostream
#include <iostream>
#include <math.h>

using namespace std;



int _tmain(int argc, _TCHAR* argv[])
{
	
int to_sort[] = {1, 23, 4, 54, 3 };  //The array of to_sort 
									//To be sorted
for ( int x = 0; x < 10; x++ ){
if (to_sort[0] > to_sort[1])		//Comparing the first two integers
	swap(to_sort[0], to_sort[1]);	//Swapping them if the first is larger	

if (to_sort[1] > to_sort[2])		//Comparing the next two integers
	swap(to_sort[1], to_sort[2]);   //Swapping them if the first is larger

if (to_sort[2] > to_sort[3])		//Comparing the next two integers
	swap(to_sort[2], to_sort[3]);   //Swapping them if the first is larger

if (to_sort[3] > to_sort[4])		//Comparing the next two integers
	swap(to_sort[3], to_sort[4]);   //Swapping them if the first is larger
}

cout << to_sort[0] << " " << to_sort[1] << " " << to_sort[2] << " " 
	<< to_sort[3] << " " << to_sort[4] << endl;	
// The  sorted integers are all displayed in ascending order with these two lines

//---------------------------------------------------------------------------------
//This concludes the section dealing with integers, everything below this line
//deals with the characters instead
{
char to_sort[] = {'a', 'c', 'g', 'j', 'a', 'c', 'd'}; //The array of characters 
														 //To be sorted
for ( int x = 0; x < 10; x++ ){
if (to_sort[0] > to_sort[1])		//Comparing the first two characters
	swap(to_sort[0], to_sort[1]);	//Swapping them if the first is larger	

if (to_sort[1] > to_sort[2])		//Comparing the next two characters
	swap(to_sort[1], to_sort[2]); //Swapping them if the first is larger

if (to_sort[2] > to_sort[3])		//Comparing the next two characters
	swap(to_sort[2], to_sort[3]); //Swapping them if the first is larger

if (to_sort[3] > to_sort[4])		//Comparing the next two characters
	swap(to_sort[3], to_sort[4]); //Swapping them if the first is larger

if (to_sort[4] > to_sort[5])		//Comparing the next two characters
	swap(to_sort[4], to_sort[5]); //Swapping them if the first is larger

if (to_sort[6] > to_sort[6])		//Comparing the next two characters
	swap(to_sort[5], to_sort[6]); //Swapping them if the first is larger
}

cout << to_sort[0] << " " << to_sort[1] << " " << to_sort[2] << " " << to_sort[3] << " " <<
	to_sort[4] << " " << to_sort[5] << " " << to_sort[6] << endl;	
// The array of sorted characters is displayed below the array of sorted integers

return 0;
}

return 0;
}


