/* Created by Dakota James Hill (Student number 100523538) on January 29th 2014
it is version 3.0 of a bubble sorting program originally created on January
22nd 2014. It was used to sort random characters in an array alphabetically.
The update changes the characters into integers, and sorts them in increasing
order as well. Numbers are inserted at the begininning, and the output
should be a sorted list of the numbers fed into the program
using the array to_sort, as well as the alphabetical sorting of characters.
The main difference between this and version 2.0 is that this uses randomly
generated integers and characters to be sorted, instead of them being given.*/

#include "stdafx.h"
#include <array>	//Include statements such as array and iostream
#include <iostream>
#include <math.h>
#include <time.h>

using namespace std;


int _tmain(int argc, _TCHAR* argv[])
{

	srand(time(0)); //Seeding the random function for better randomness

	char rand_char_1;	//Creating the first random letter value
	rand_char_1 = (rand() % 26) + 'a'; // There are 26 possible values, and
									   // a random number to 'a' creates a
									   // random letter to be used

	char rand_char_2;	//Creating the next random letter value
	rand_char_2 = (rand() % 26) + 'a';

	char rand_char_3;	//Creating the next random letter value
	rand_char_3 = (rand() % 26) + 'a';

	char rand_char_4;	//Creating the next random letter value
	rand_char_4 = (rand() % 26) + 'a';

	char rand_char_5;	//Creating the next random letter value
	rand_char_5 = (rand() % 26) + 'a';

	char rand_char_6;	//Creating the next random letter value
	rand_char_6 = (rand() % 26) + 'a';

	char rand_char_7;	//Creating the next random letter value
	rand_char_7 = (rand() % 26) + 'a';

int to_sort[] = {rand(), rand(), rand(), rand(), rand() };  //The array of to_sort 
									//To be sorted, the integers
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


//------------------------------------------------------------------------------------------
//This ends the part dealing with integers, everything below this deals
//with character values.

{
char to_sort[] = {rand_char_1, rand_char_2, rand_char_3, rand_char_4, rand_char_5, 
	rand_char_6, rand_char_7};								 //The array of characters 
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
