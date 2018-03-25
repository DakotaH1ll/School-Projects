/**
 * @author      Dakota Hill (100523538)
 * @version     1.0
 * @since       2014-03-12
 */

#include "stdafx.h"
#include <iostream>

using namespace std;

struct Node {
	char data;
	Node *next;
};

class NumberStack {
public:
	NumberStack();
	~NumberStack();

	char top();
	char pop();
	void push(char value);
	void print();

private:
Node *topPtr;
};
 /**
 * Creates the class member
 */
NumberStack::NumberStack() {
	topPtr = nullptr;
}
 /**
 * Deletes the class member
 */
NumberStack::~NumberStack() {
}
 /**
 * Outputs the top value on the stack
 */
char NumberStack::top() {
	if (topPtr == NULL){
		throw(0);
	}
	return topPtr->data;
}
 /**
 * Displays and deletes the top number on the stack
 * @return value the number on top of the stack
 */
char NumberStack::pop() {
	if (topPtr == NULL) {
		cerr << "No top of stack, ya dummy!" << endl;
		throw(0);
	}

	char value = topPtr->data;

		Node *next = topPtr->next;

		Node *old = topPtr;
		topPtr = next;
		delete old;

		

	return value;
}
 /**
 * Puts the data onto to the top of the stack
 * @param  value The data being pushed onto the stack
 */
void NumberStack::push(char value) {
	Node *newNode = new Node;
	newNode->data = value;
	newNode->next = topPtr;
	topPtr = newNode;
}
 /**
 * Outputs the entire stack
 */
void NumberStack::print() {
	Node *current = topPtr;

	while(current == NULL){
		cout << "[" << current->data << "]" << endl;
	}
}


class NumberStackNode {
public:
	NumberStackNode();
	~NumberStackNode();
		
	void Next();
	int number();

private:
	int getNumber(int number);
	void setNumber();

	void setNext();
	void getNext();
};
/**
 * Creates the class member
 */
NumberStackNode::NumberStackNode() {
}
 
/**
 * Deletes the class member
 */
NumberStackNode::~NumberStackNode() {
}

 /**
 * Sets a number
 */
void NumberStackNode::setNumber(){
}
 /**
 * Gets a number
 * @param  number The integer that is being recieved
 */
int NumberStackNode::getNumber(int number){
return 0;
}
 /**
 * Sets the next node
 */
void NumberStackNode::setNext(){
}
 /**
 * Gets the next node 
 */
void NumberStackNode::getNext() {
}


int main() {
	char input; // The input from the user
	char uno;	// The first number used in the operations
	char dos;	// The second number used in the operations
	float ans;	// The result of the operation
	float iuno;	// The first number in integer form
	float idos;	// The second number in integer form

	NumberStack *YourStack = new NumberStack;	// Creates a stack named stack
	
	for (int i = 0; i < 10000; i++) {
	cout << "Enter a single digit or an operator, followed by Enter, or 'Q' to quit." << endl;
	cout << "Use + to add, - to subtract, / to divide or * to multiply!" << endl;
	cout << endl;
	cin >> input;
	cout << endl;

		if (input == 'Q'){
		delete YourStack;
		
		exit(0);
		i = 10001;

		//Addition case
		} else if (input == '+' ) {
			dos = YourStack->top();			
			idos = dos - '0';	// Converts from char type to float type
			YourStack->pop();
			uno = YourStack->top();
			iuno = uno - '0'; 	// Converts from char type to float type
			ans = iuno + idos;

			YourStack->push(ans);

			cout << uno << " + " << dos << " = " << ans;
			cout << endl;

			// Subtraction case
		} else if (input == '-' ) {
			dos = YourStack->top();			
			idos = dos - '0';	// Converts from char type to float type
			YourStack->pop();
			uno = YourStack->top();
			iuno = uno - '0';	// Converts from char type to float type
			ans = iuno - idos;
			
			YourStack->push(ans);

			cout << uno << " - " << dos << " = " << ans;
			cout << endl;

			// Division case
		} else if (input == '/' ) {
			dos = YourStack->top();			
			idos = dos - '0';	// Converts from char type to float type
			YourStack->pop();
			uno = YourStack->top();
			iuno = uno - '0';	// Converts from char type to float type
			ans = iuno / idos;
			
			YourStack->push(ans);

			cout << uno << " / " << dos << " = " << ans;
			cout << endl;

			// Multiplication case
		} else if (input == '*' ) {
			dos = YourStack->top();			
			idos = dos - '0';	// Converts from char type to float type
			YourStack->pop();
			uno = YourStack->top();
			iuno = uno - '0';	// Converts from char type to float type
			ans = idos * iuno;
			
			YourStack->push(ans);

			cout << uno << " X " << dos << " = " << ans;
			cout << endl;
		} else {
			// Input case
			YourStack->push(input);
		}
	}

	// Deletes the stack
	delete YourStack;

	return 0;
}

