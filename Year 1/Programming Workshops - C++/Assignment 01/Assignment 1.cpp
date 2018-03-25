/* This is version 1.0 of a skeleton of a card game for the furst assignment in
Programming Workshops. It was created by Dakota Hill (100523538) and is to be
done by February 7th. At first it creates a random card, then it asks the user
to input the number of random cards they would like to be dealt, and which
specific card they would like to search their hand for. It then displays the
hand of random crads, and how many times the target card was dealt to the 
player. It also counts how many times each suit showed up, and outputs which
suit appears the most often, and how many times it appears*/

#include "stdafx.h";
#include <vector>
#include <time.h> // Include statements, such as string and vector, both used
#include <iostream>
#include <string>

using namespace std;

int _tmain(int argc, _TCHAR* argv[])
{

/**
* @author      Dakota Hill (100523538)
* @version     1.0
* @since       2014-02-06 
*/
/**
 * Deals a random card from a deck
 *
 * @param rand_suit a random generator that chooses a suit
 * @param rand_value a random genertaor that chooses a value
 */

	void randomCard(); {	// This function creates a random card
	
		srand(time(NULL));	// This seeds the random number generator

	vector < string > card_suits;
	card_suits.push_back ("Hearts");
	card_suits.push_back ("Diamonds");	// This vector includes all possible
	card_suits.push_back ("Spades");	// suits in a deck of cards
	card_suits.push_back ("Clubs");

	vector < string > card_values;
	card_values.push_back ("Ace");
	card_values.push_back ("Two");
	card_values.push_back ("Three");
	card_values.push_back ("Four");
	card_values.push_back ("Five");
	card_values.push_back ("Six");		// This vector contains all the values
	card_values.push_back ("Seven");	// of cards found in a deck
	card_values.push_back ("Eight");
	card_values.push_back ("Nine");
	card_values.push_back ("Ten");
	card_values.push_back ("Jack");
	card_values.push_back ("Queen");
	card_values.push_back ("King");

	int rand_suit = rand() % 3;	// This creates a random number to pick a suit
	int rand_value = rand() % 12; // Creates a random number to pick a value

	cout << "The First Card is: " << card_values[rand_value] << " Of " 
		<< card_suits[rand_suit] << endl;
	} //This outputs the original random card given to the user at the start


/**
* @author      Dakota Hill (100523538)
* @version     1.0
* @since       2014-02-07
*/
/**
 * Deals and counts various cards
 *
 * @param numCards number of cards to be dealt
 * @param target_suit the suit of the card the user wants to find
 * @param target_value the value of the card the user wants to find
 * @param target_suit_name the input of the desired suit from the user
 * @param target_value_name the input of the desired value from the user
 * @param count counts how many times the desired card appears
 * @param heart_count counts how many times hearts have appeared
 * @param diamond_count counts how many times diamonds have appeared
 * @param spade_count counts how many times spades have appeared
 * @param club_count counts how many times clubs have appeared 
 */

	void DealAndCount(); { // Deals a hand and performs many counts to the cards
		int numCards; // The number of cards the user would like dealt to them
		int target_suit; // The suit found in the suit vector
		int target_value; // The value found in the value vector
		string target_suit_name; // The input from the user for the suit desired
		string target_value_name; // The input fom the user for the value desired

		int count = 0;	// Counts how many times the target card appears
		int heart_count = 0; // Counts how many times hearts appear
		int diamond_count = 0; // Counts how many times diamonds appear
		int spade_count = 0; // Counts how many times spade appear
		int club_count = 0; // Counts how many times clubs appear



		srand(time(NULL));

		cout << endl; // Outputs a blank line for a better looking program
		cout << "How many cards do you want to be dealt?" << endl;
		cin >> numCards; // The user inputs how many cards they want
		if (numCards <= 0){
			cout << "That is an invalid number of cards!" << endl;
			exit(0);
		}
		else{
		cout << endl;

					
	vector < string > card_suits;
	card_suits.push_back ("Hearts");
	card_suits.push_back ("Diamonds");
	card_suits.push_back ("Spades");
	card_suits.push_back ("Clubs");

	vector < string > card_values;
	card_values.push_back ("Ace");
	card_values.push_back ("Two");
	card_values.push_back ("Three");
	card_values.push_back ("Four");
	card_values.push_back ("Five");
	card_values.push_back ("Six");
	card_values.push_back ("Seven");
	card_values.push_back ("Eight");
	card_values.push_back ("Nine");
	card_values.push_back ("Ten");
	card_values.push_back ("Jack");
	card_values.push_back ("Queen");
	card_values.push_back ("King");

	cout << "Which suit are you looking for? (Capitalize the first letter): " << endl;
	cin >> target_suit_name; // The user inputs the target suit
	
	if (target_suit_name == "Hearts"){
		target_suit = 0; // Converts the input into a vector location
	}
	else if (target_suit_name == "Diamonds"){
		target_suit = 1;  // Converts the input into a vector location
	}
	else if (target_suit_name == "Spades"){
		target_suit = 2; // Converts the input into a vector location
	}
	else if (target_suit_name == "Clubs"){
		target_suit = 3; // Converts the input into a vector location
	}
	else {cout << "That is an invalid suit!" << endl;
		exit(0); // Exits if the user fails to enter a valid suit
	}

	cout << endl; // An empty line for a clean program
	
	cout << "Which value are you looking for? (Capitalize the first letter): "
		<< endl; // The user inputs the desired value to find
	cin >> target_value_name;

	if (target_value_name == "Ace"){
		target_value = 0; // Converts the input into a vector location
	}

	else if (target_value_name == "Two"){
		target_value = 1; // Converts the input into a vector location
	}

	else if (target_value_name == "Three"){
		target_value = 2; // Converts the input into a vector location
	}

	else if (target_value_name == "Four"){
		target_value = 3; // Converts the input into a vector location
	}

	else if (target_value_name == "Five"){
		target_value = 4; // Converts the input into a vector location
	}

	else if (target_value_name == "Six"){
		target_value = 5; // Converts the input into a vector location
	}

	else if (target_value_name == "Seven"){
		target_value = 6; // Converts the input into a vector location
	}

	else if (target_value_name == "Eight"){
		target_value = 7; // Converts the input into a vector location
	}

	else if (target_value_name == "Nine"){
		target_value = 8; // Converts the input into a vector location
	}

	else if (target_value_name == "Ten"){
		target_value = 9; // Converts the input into a vector location
	}

	else if (target_value_name == "Jack"){
		target_value = 10; // Converts the input into a vector location
	}

	else if (target_value_name == "Queen"){
		target_value = 11; // Converts the input into a vector location
	}

	else if (target_value_name == "King"){
		target_value = 12; // Converts the input into a vector location
	}

	else {
		cout << "That is not a valid value!" << endl;
		exit(0); // Exits if an invalid value is inputted
	}
	
	cout << endl; // Blank line for a clean looking program
	cout << "Your Hand Is:" << endl;
	
	for( int i = 0; i < numCards; i++ ){ // Loops as many times as the user needs
	int rand_suit = rand() % 3; // Creates a random suit
	int rand_value = rand() % 12; // Creates a random value

		if (rand_suit == 0){
			heart_count = heart_count++; // Checks the suit and adds to the suit's
		}								 // count value
	
		else if (rand_suit == 1){
			diamond_count = diamond_count++; // Checks the suit and adds to the suit's
		}								     // count value

		else if (rand_suit == 2){
			spade_count = spade_count++; // Checks the suit and adds to the suit's
		}								 // count value

		else if (rand_suit == 3){
			club_count = club_count++; // Checks the suit and adds to the suit's
		}							   // count value


		if (rand_value == target_value && rand_suit == target_suit){
			count = count + 1; // Compares each card to the target card and adds
		}					   // to the target's count value
	
		cout << card_values[rand_value] << " Of " << card_suits[rand_suit] << endl;
		// Outputs each card on a seperate line
	}
	
	cout << endl; // A blank line


	cout << "The " << card_values[target_value] << " Of " << 
		card_suits[target_suit] << " appears " << count << " time(s)." << endl;	
		// Displays how many times the target card appeared in the hand
	cout << endl; 

	if (heart_count > diamond_count && heart_count > spade_count && heart_count < club_count){
		cout << "Hearts show up " << heart_count << " times." << endl;
	} // Checks which suit appears the most, and displays how often it appears 

	else if (diamond_count > heart_count && diamond_count > spade_count && diamond_count > club_count){
		cout << "Diamonds show up " << diamond_count << " times." << endl;
	} // Checks which suit appears the most, and displays how often it appears

	else if (spade_count > heart_count && spade_count > diamond_count && spade_count > club_count){
		cout << "Spades show up " << spade_count << " times." << endl;
	} // Checks which suit appears the most, and displays how often it appears

	else if (club_count > heart_count && club_count > spade_count && club_count > diamond_count){
		cout << "Clubs show up " << club_count << " times." << endl;
	} // Checks which suit appears the most, and displays how often it appears

	else{
		cout << "It's a tie!" << endl;
	} // If there is a tie, it will check and display a tie message
	}
	}
	return 0;
}
