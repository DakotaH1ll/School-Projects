/**
 * @author      Dakota James Hill (100523538)
 * @version     1.0
 * @since       2014-03-03
 */

#include "stdafx.h"
#include <iostream>
#include <fstream>
#include <string>
#include <cstdlib>

using namespace std;

int main() {
	//Opens the html file for reading
	ifstream inFile("LabTest.html");
	//Closes the program if no such file can be found
	if (inFile.fail()) {
		cerr << "Unable to open file for reading." << endl;
		return 1;
	}

	//Creates a text file to store the plain text 
	ofstream outFile("DoneTest.txt", ios::app);
	//Closes the program if the file cannot be created
	if(outFile.fail()) {
	cerr << "Unable to open file for writing" << endl;
	exit(1);
	}

	int FrontTagStart; //Numeric location where the tag begins
	int FrontTagEnd; //Numeric location where the tage ends
	int FrontTagLength; //How long the tag is


	string line; //The data being read

		while (getline(inFile, line)) {
		
			for(string::size_type i = 0; i < line.size(); i++) {
				//Reads the HTML file one character at a time

				if(line[i] = '<'){
					FrontTagStart = line.find('<', 0); //Outputs a numeric location
					FrontTagEnd = line.find('>', 0); //Outputs a numeric location
					FrontTagLength = FrontTagEnd - FrontTagStart;
					//Determines the length of the tag

					line.erase(FrontTagStart, FrontTagLength+1); //Deletes the tag
					line.erase(FrontTagStart, FrontTagLength+1);
				outFile << " " << line << endl; //Prints the text into the txt file
				} else {
			//outFile << line << endl; //Prints the text into the txt file
				}
			}
		}
	outFile.close(); //Closes the txt file
	inFile.close(); //Closes the HTML file

	return 0;
}
