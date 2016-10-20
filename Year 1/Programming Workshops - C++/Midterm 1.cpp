/**
 * @author      Dakota James Hill (100523538)
 * @version     1.0
 * @since       2014-02-13
 */

#include "stdafx.h"
#include <iostream>
#include <fstream>
#include <string>
#include <cstdlib>
#include <time.h>

using namespace std;

string getLetterGrade(float grade){
	
	string letter;
	
	if (grade < 50) {
		letter = "F"; 
	}

	else if (50 <= grade && grade < 60) {
		letter = "D"; 
	}

	else if (60 <= grade && grade < 67) {
		letter = "C"; 
	}

	else if (67 <= grade && grade < 70) {
		letter = "C+"; 
	}

	else if (70 <= grade && grade < 73) {
		letter = "B-"; 
	}

	else if (73 <= grade && grade < 77) {
		letter = "B"; 
	}

	else if (77 <= grade && grade < 80) {
		letter = "B+"; 
	}

	else if (80 <= grade && grade < 85) {
		letter = "A-"; 
	}

	else if (85 <= grade && grade < 90) {
		letter = "A"; 
	}

	else if (90 <= grade && grade <= 100) {
		letter = "A+"; 
	}

	return letter;
}

void saveGrade (string studentName, float mark, string letterGrade)
{
	ofstream outFile("Grades.txt", ios::app);
	
	if(outFile.fail()) {
		cerr << "Unable to open file for writing" << endl;
		exit(1);
	}

	outFile << studentName << " " << mark << " " << letterGrade << endl;
	
	outFile.close();

}

void loadGrade (string studentname, float mark, string letterGrade)
{
		ifstream inFile("Grades.txt");

	if (inFile.fail()) {
		cerr << "Unable to open file for reading." << endl;
		exit(1);
	}

	string data;
	
		while (getline(inFile, data)) {

		cout << data << endl;
	}
}


int _tmain(int argc, _TCHAR* argv[])
{
	srand(time(NULL));

	string StudentName;
	float StudentMark;
	string letterGrade;


		for (int i = 1; i < 99999; i++){
		cout << "Enter a students name, or 'End' to end the program: " << endl;
		cin >> StudentName;
		cout << endl;
	
		if (StudentName != "End") {
		
			StudentMark = rand() % 100;

			letterGrade = getLetterGrade(StudentMark);

			saveGrade(StudentName, StudentMark, letterGrade);}

		else {
			i = 100000;
		}
		
		}

		loadGrade(StudentName, StudentMark, letterGrade);

		return 0;
}

