/**
 * @author      Dakota Hill (100523538)
 * @version     1.0
 * @since       2014-03-17
 */

#include "stdafx.h"

#include <iostream>
#include <string>

using namespace std;

struct Node {
	string data;
	Node *next;
};

class Queue {
public:
	Queue();
	~Queue();
	bool isEmpty();
	void printQueue(bool forward);
	void add(int newValue);
	string remove();


private:
	Node *front;
};

Queue::Queue() {
	front = nullptr;
}

Queue::~Queue() {
	while (!isEmpty()) {
		remove();
	}
}

bool Queue::isEmpty(){
	if (front == NULL){
		cout << "The queue is empty!" << endl;
		return true;
	} else { 
		cout << "The queue is not empty!" << endl;
		return false;
	}
}

/**
 * Prints the queue in whichever direction the user wants
 *
 * @param forward the bool statement is true if it is to be printed forward
 * or false if it is to be printed backwards
 */

void Queue::printQueue(bool forward) {
	if (forward = true) {
	
	Node *current = front;

	while(current == NULL){
	cout << "[" << current->data << "]" << endl;
	} 
	
	} else if (forward = false) {
		
	Node *current = front;
	
	while(current == NULL){
	cout << current->data << " " << endl;
	
	}
	}
}

/**
 * Adds an integer to the end of the queue
 *
 * @param newValue is the integer that is to be added to the queue
 */

void Queue::add(int newValue) {
	// create the new node
	Node *newNode = new Node; 
	newNode->data = newValue;
	newNode->next = nullptr;


	if (front == nullptr) {
		front = newNode;
	} else {

		// move forward until we are at the last element
		Node *current = front;
		while (current->next != nullptr) {
			current = current->next;
		}

		// insert the element here
		current->next = newNode;
	}
}

/**
 * Removes the oldest integer from the queue
 */

string Queue::remove() {
	if (front != nullptr) {
		string value = front->data;

		Node *next = front->next;

		Node *old = front;
		front = next;
		delete old;

		return value;
	} else {
		return "";
	}
}


int _tmain(int argc, _TCHAR* argv[])
{
	int choice;
	int data;
	int forw;

	Queue *YourQueue = new Queue;
	
	for (int i = 0; i < 100000; i++){

		cout << endl;
		cout << "This is a queue class program!" << endl; 
		cout << "Press '1' to check emptiness!" << endl;
		cout << "Press '2'to print the queue!" << endl;
		cout << "Press '3' to add a number!" << endl;
		cout << "Press '4' to remove a number!" << endl;
		cout << "Press '5' to close the program!" << endl;
		cout << endl;
		cin >> choice;
		
		if (choice == 1) {
			YourQueue->isEmpty();
	
		} else if (choice == 2) {
			cout << "Would you like to print it forward (1), or backward(any other number)?" << endl;
			cin >> forw;
			if (forw == 1){ 
				YourQueue->printQueue(true); 
			} else { 
				YourQueue->printQueue(false);
			
			}
		
		} else if (choice == 3) {
			cout << "What number would you like to add?" << endl;
			cin >> data;
		
			YourQueue->add(data);
	
		} else if (choice == 4) {
			YourQueue->remove();
	
		} else if (choice == 5) {
			delete YourQueue; 
			exit (0);
	
		} else {
		cout << "That is not a valid option!" << endl;
		
		}
	}
	
	return 0;

}