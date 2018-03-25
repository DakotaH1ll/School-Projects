
/**
 * @author      Dakota James Hill (100523538)
 * @version     1.0
 * @since       2014-03-07
 */

#include "stdafx.h"
#include <string>
#include <iostream>
#include <fstream>

using namespace std;

struct Node {
	int data;
	Node *next;
};

class dataAnalysis {
public:
	dataAnalysis(int, int);
	~dataAnalysis();
	bool isEmpty();
	void AddData(string, int);
	void DeleteData();
	void printrawData();
	void printHistogram();
	void calculateMean(int);
	void calculateMedian();

private:
Node *topPtr;
};

/**
 * Creates the data structure
 */
dataAnalysis::dataAnalysis(int rows, int columns) {
	int row = rows;
	int col = columns;

int** array = new int*[row];
for (int i = 0; i < row; i++) {
     array[i] = new int[col];
}
}

/**
 * Deletes the data structure
 */
dataAnalysis::~dataAnalysis() {
}

/**
 * Determines if the data structure is empty
 */
bool dataAnalysis::isEmpty() {
	bool empty;
	if (topPtr == NULL) {
		empty = true;
	cout << "The array is empty!" << endl;
	} else {
		empty = false;
		cout << "The array is not empty!" << endl;
	}
	return (topPtr == NULL);
}

/**
 * Allows the user to add data to the array
 * @param  wor the word the user wants in the array
 * @param  value the integer the user wants in the array
 */
void dataAnalysis::AddData(string wor, int value){
	Node *newNode = new Node;
	newNode->data = value;


	newNode->next = topPtr;
	//newNode->data = wor;
	topPtr = newNode;
}

/**
 * Allows the user to delete data from the array
 */
void dataAnalysis::DeleteData(){
	Node *oldTop = topPtr->next;
	int value = topPtr->data;
	delete oldTop;
}
/**
 * Allows the user to print the array
 */
void dataAnalysis::printrawData(){
	Node *current = topPtr;

	while(current == NULL){
	cout << "[" << current->data << "]" << endl;
	}
}
/**
 * Allows the user to make a histogram from the array
 */
void dataAnalysis::printHistogram(){
}
/**
 * Allows the user to calculate the mean of the numbers
 */
void dataAnalysis::calculateMean(int value){



}

/**
 * Allows the user to calculate the median of the numbers
 */
void dataAnalysis::calculateMedian(){
}


int main(int argc, char *argv[])
{
	int funct;
	int rows;
	int columns;
	string word;
	int number;
	int count = 0;

	cout << "How many rows would you like? (Default is 2)" << endl;
			cin >> rows;
			cout << "How many columns would you like? (Default is 5)" << endl;
			cin >> columns;
			cout << endl;

	dataAnalysis *data = new dataAnalysis(rows, columns);

	for (int i = 0; i < 1000000; i++) {
		cout << endl;
		cout << "Would you like to destruct and close the program (1)," 
		"check emptiness (2) add data (3), delete data (4), print raw data (5), print a" 
		" histogram (6), calculate the mean  (7), or calculate the median (8)?" << endl;
		
		cin >> funct;

		if (funct == 1) {

			delete data;
			exit(0);
		
		} else if (funct == 2) {
			
		data->isEmpty();


		} else if (funct == 3) {

			cout << "Enter a word: " << endl;
			cin >> word;
			cout << "Enter a number: " << endl;
			cin >> number;
			data->AddData(word, number);
			
			count++;
		} else if (funct == 4) {

			data->DeleteData();

		} else if (funct == 5) {
			
			data->printrawData();

		} else if (funct == 6) {
			
			//data.printHistogram();

		} else if (funct == 7) {
			
			//data.calculateMean();

		} else if (funct == 8) {
			
			//data.calculateMedian();

		} else { 
			cout << endl;
			cout << "That is not a valid option, please try again!" << endl;
		}
	}
	return 0;
}

