/**
 * @author      Dakota Hill (100523538)
 * @version     1.0
 * @since       2014-02-1
 */


#include "stdafx.h" 
#include <iostream> 
#include <string>

using namespace std; 

bool leap( int year ); 
int DayofWeek( int year ); 
int PrintMonth( int DoW, int dim ); 

int year(){
	/**
 * A placeholder used in for loops
 */
	int i; 
/**
 *The day of the week that a date falls on
 */
	int DoW;
/**
 * The year given by the user
 */
	int year; 
/**
 *An array of how many days are in every month
 */
	int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 

	cout << "Enter calendar year: "; 
	cin >> year;  

/**
 * Tests if the given year is a leap year
 *
 * Uses the bool function below to determine how many days February should have.
 *
 * @param year			The year given by the user
 * @return				If true, then February has 29 days, otherwise it remains at 28.
 */
	if( leap( year ) == true ) days[ 2 ] = 29; // Leap year's February has 29 days 
	
	DoW = DayofWeek( year ); 
	
	for( i = 1; i <= 12; i++ ) { 
		DoW = PrintMonth( DoW, days[ i ] ) + 1; 
		cout << endl; 
	} 
	
	cin >> i; 
	return 0; 
} 

/**
 * The function used to determine if the year is a leap year, or a century year
 *
 * Uses division to determine how many days February should have.
 *
 * @param year			The year given by the user
 * @return				If true, then February has 29 days, otherwise it remains at 28.
 */
bool leap( int year ) {  
	if( year % 4 == 0 ) { 
		if( year % 100 == 0) { 
			return false; 
		} 
		return true; 
	} 
	else return false; 
} 


/**
 * Determines what day of the week January first is on
 *
 * It begins one day later for every year, so it adds one day to the starting day
 * depending on how many years have passed since year one.
 *
 * @param year			The year given by the user
 * @return DoW			The day the first of January occurs on		
 */
int DayofWeek( int year ) { 
int DoW = 7; 

for( int i = 1; i < year; i++ ) { 
	DoW++; 
	if( leap(i) ) DoW ++; 
		if( DoW > 7 ) DoW = 1; 
} 

return DoW; 
} 

/**
 * Prints out the calender for a month, repeating 12 times for a year
 *
 * @param DoW			The day January First occurs on
 * @param dim			The day January First occurs on
 */
int PrintMonth(int DoW, int dim ) { 
	
	bool j; 
	int k, curMonth; 
	string TheMonth;

	
	
cout << " Su Mo Tu We Th Fr Sa \n"; 
	
	curMonth = 1; 
	j = true; 
	
	while( j ) { 
		for( k = 1; k <= 7; k++ ) {
			if( curMonth < DoW ) cout << " "; 
			
			else { 
				if( curMonth - DoW + 1 < 10 ) cout << " "; 
				cout << " " << curMonth - DoW + 1; 
			} 

			curMonth++; 
			
			if( curMonth - DoW + 1 > dim ) { 
				j = false; 
				break; 
			} 
		} 
		cout << endl; 
	} 
	return k; 
}

int month();
int month() {
	int i2; 
	int dow2; 
	int year2;
	int curMonth2;
	string WhatMonth2;

	int days2[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 

	cout << "What month would you like to see? (Capitalize the first letter): " << endl;
	cin >> WhatMonth2;

	
	if (WhatMonth2 == "January") {
		curMonth2 = 1; }

	else if  (WhatMonth2 == "February") {
		curMonth2 = 2; }

	else if  (WhatMonth2 == "February") {
		curMonth2 = 2; }

	else if  (WhatMonth2 == "March") {
		curMonth2 = 3; }

	else if  (WhatMonth2 == "April") {
		curMonth2 = 4; }

	else if  (WhatMonth2 == "April") {
		curMonth2 = 4; }

	else if  (WhatMonth2 == "May") {
		curMonth2 = 5; }

	else if  (WhatMonth2 == "June") {
		curMonth2 = 6; }

	else if  (WhatMonth2 == "July") {
		curMonth2 = 7; }

	else if  (WhatMonth2 == "August") {
		curMonth2 = 8; }

	else if  (WhatMonth2 == "September") {
		curMonth2 = 9; }

	else if  (WhatMonth2 == "October") {
		curMonth2 = 10; }

	else if  (WhatMonth2 == "November") {
		curMonth2 = 11; }

	else if  (WhatMonth2 == "December") {
		curMonth2 = 12; }

	std::cout << "Enter the year you would like: "; 
	cin >> year2; 
		
	if( leap2( year2 ) == true ) days2[ 2 ] = 29;
	
	dow2 = DayofWeek2( year2 ); 
	
	for( i2 = 1; i2 <= 1; i2++ ) { 
		dow2 = PrintMonth( dow2, days2[ curMonth2 ] ) + 1; 
		std::cout << endl; 
	} 
	
	cin >> i2; 
	return 0;
	return curMonth2;
} 

bool leap2( int year2 ) { 
	
	if( year2 % 4 == 0 ) {
		if( year2 % 100 == 0) { 
			return false; 
		} 
		return true; 
	} 
	else return false; 
} 

int DayofWeek2( int year ) { 
int dow2 = 7; 

for( int i2 = 1; i2 < year; i2++ ) { 
	dow2++; 
	if( leap2(i2) ) dow2 ++; 
		if( dow2 > 7 ) dow2 = 1; 
} 

return dow2; 
} 

int PrintMonth2(int dow2, int dim2 ) { 
	bool j2; 
	int k2, curMonth2; 
	string WhatMonth2;

	cout << endl;
	cout << " S  M  T  W  T  F  S" << endl; 
	
	j2 = true; 
	
	while( j2 ) { 
		for( k2 = 1; k2 <= 7; k2++ ) { 
			if( curMonth2 < dow2 ) cout << " "; 
			

			else { 
				if( curMonth2 - dow2 + 1 < 10 ) cout << " "; 
				cout << " " << curMonth2 - dow2 + 1; 
			} 
			 

			if( curMonth2 - dow2 + 1 > dim2 ) { 
				j2 = false; 
				break; 
			} 
		} 
		cout << endl; 
} 
return k2;
}





int _tmain(int argc, _TCHAR* argv[]) 
{  
	int YorM; //Used to determine if the user wants to see a month, or a whole year

	std::cout << "Would you like a year calendar? (1) Or a month calendar? (2)" << endl;
	cin >> YorM;

	if (YorM = 1){
	year();
	}

	else if (YorM = 2){
	month();
	}

	else {
		exit(0);
	}

return 0;
}